package com.codingdojo.java.spring.group_project.controllers;

import com.codingdojo.java.spring.group_project.auth.validator.UserValidator;
import com.codingdojo.java.spring.group_project.config.FileUploadUtil;
import com.codingdojo.java.spring.group_project.models.*;
import com.codingdojo.java.spring.group_project.repositories.RoleRepository;
import com.codingdojo.java.spring.group_project.services.*;
import com.codingdojo.java.spring.group_project.classes.Location;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

@RequestMapping("/")
@Controller
public class UserController {
    private final RoleRepository roleRepository;
    private final UserValidator userValidator;
    private final UserService userService;
    private final RoleService roleService;
    private final CategoryService categoryService;
    private final SubCategoryService subCategoryService;
    private final AddressService addressService;
    private final CityService cityService;
    private final FeedBackService feedBackService;

    public UserController(RoleRepository roleRepository, UserValidator userValidator, UserService userService,
                          RoleService roleService, CategoryService categoryService,
                          SubCategoryService subCategoryService, AddressService addressService, CityService cityService, FeedBackService feedBackService) {
        this.roleRepository = roleRepository;
        this.userValidator = userValidator;
        this.userService = userService;
        this.roleService = roleService;
        this.categoryService = categoryService;
        this.subCategoryService = subCategoryService;
        this.addressService = addressService;
        this.cityService = cityService;
        this.feedBackService = feedBackService;
        makeRoles();

    }
    @RequestMapping("/home")
    //home controller to view the home page
    public String HomePage(@ModelAttribute("user")User user ,Principal principal, Model model){
        //String email = principal.getName();
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("allCategories",categories);//all categories


        List<SubCategory> subcategories=subCategoryService.getAllSubs();
        model.addAttribute("AllSubs",subcategories);


        Location location=new Location();
        List<String> allCities =location.getLocations();
        model.addAttribute("AllCities",allCities);//List of all cities for each needed in jsp file.


        List<User> allUsers=userService.getAllUsers();
        model.addAttribute("ListOfUsers",allUsers);//All users for the deafult view

        //SubCategory sub = subcategoryservice.getSubById(id);
        //List<User> allRelatedUsers=userservice.getAllUsersRelated("city",subcategory);//method take the city and subCategory selected by the user.

        //List<SubCategory> relatedSubCat=subcategoryservice.getAllRelateSubs(category);
        return "registration.jsp";
    }


    private void makeRoles() {
        if(roleRepository.findAll().size() == 0) {
            Role admin = new Role();
            admin.setName("ROLE_ADMIN");
            roleRepository.save(admin);
        }
    }

    @RequestMapping(value={"/login"})
    public String login(Model model, @RequestParam(value="error",required=false) String error, @RequestParam(value="logout",required=false) String logout){
        if(logout != null){model.addAttribute("logoutMessage","Logout Successful");}
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials.");
            model.addAttribute("user", new User());
            return "login.jsp";
        }
        else{
            return "redirect:/home";

        }
    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user ,BindingResult result, Model model,
                               @RequestParam(value="first_name") String firstName, @RequestParam(value=
            "last_name") String lastName, @RequestParam(value="business_name") String businessName,
                               @RequestParam(value="phones") List <Phone> phoneNum,@ModelAttribute("subcategory")SubCategory su, @ModelAttribute("category")Category cat,
                               @ModelAttribute(value="street") String st, @ModelAttribute(value="building") String build, @ModelAttribute(value="business_email") String businessEmail, @ModelAttribute(value="city") String c,@RequestParam("image") MultipartFile multipartFile) throws IOException {
        userValidator.validate(user, result);

        if (result.hasErrors()) {
            List<Category> categories = categoryService.getAllCategories();
            model.addAttribute("allCategories",categories);//all categories

            List<SubCategory> subcategories=subCategoryService.getAllSubs();
            model.addAttribute("AllSubs",subcategories);


            Location location=new Location();
            List<String> allCities =location.getLocations();
            model.addAttribute("AllCities",allCities);//List of all cities for each needed in jsp file.


            return "registration.jsp";
        }
        else if(roleService.findByName("ROLE_ADMIN").getUsers().isEmpty())  {
            userService.saveUserWithAdminRole(user);
            return "redirect:/login";
        } else {
            Address address =addressService.getAddressByUser(user);
            //City city =cityService.getCityByAddress(address);
            user.setFirst_name(firstName);
            user.setLast_name(lastName);
            user.setBusiness_name(businessName);
            user.setPhones(phoneNum);
            user.setBusiness_email(businessEmail);
            user.getAddress().setBuilding(build);
            user.getAddress().setStreet(st);
            user.getAddress().getCity().setName(c);
            user.setCategory(cat);
            user.setSubcategory(su);
            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
            user.setPhotos(fileName);
            String uploadDir = "user-photos/" + user.getId();
            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
            userService.update(user);
            return "redirect:/adding";/////////
        }
    }
    @RequestMapping("/edit")
    public String showEdit(){
        return "edit.jsp";
    }
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
        public String updateUser(@RequestParam(value="first_name") String firstName, @RequestParam(value=
            "last_name") String lastName, @RequestParam(value="business_name") String businessName,
                                 @RequestParam(value="phone") List <Phone> phoneNum, @RequestParam(value="street") String st, @RequestParam(value="building") String build, @RequestParam(value="business_email") String businessEmail, @RequestParam(value="city") String c, Principal principal,@RequestParam("image") MultipartFile multipartFile) throws IOException{
        String email = principal.getName();
        User user = userService.findByEmail(email);
        Address address = addressService.getAddressByUser(user);
        City city = cityService.getCityByAddress(address);
        user.setFirst_name(firstName);
        user.setLast_name(lastName);
        user.setBusiness_name(businessName);
        user.setPhones(phoneNum);
        user.setBusiness_email(businessEmail);
        address.setBuilding(build);
        address.setStreet(st);
        city.setName(c);
        userService.update(user);
        cityService.save(city);
        addressService.updateAddress(address);
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        user.setPhotos(fileName);
        String uploadDir = "user-photos/" + user.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return "redirect:/home";
    }

    @RequestMapping("/admin")
    public String displayAdmin(Principal principal, Model model,
                               @ModelAttribute("user") User user) {
        String email = principal.getName();
        model.addAttribute("notApproved", userService.notApproved(false));
        return "adminPage.jsp";
    }

    @RequestMapping("/admin/approved/{id}")
    public String activate(@PathVariable("id") Long id) {
        User user = userService.getOneById(id);
        Boolean approved = true;
        user.setApprove(approved);
        userService.updateUserStatus(user);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/notapproved/{id}")
    public String deactivate(@PathVariable("id") Long id) {
        User user = userService.getOneById(id);
        Boolean approved = false;
        user.setApprove(approved);
        userService.updateUserStatus(user);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }

//    @PostMapping("/admin/createsubcategory")
//    public String createSubCategory(Principal principal,
//                                    @Valid @ModelAttribute("subCategory") SubCategory subCategory,
//                                    BindingResult result) {
//        subCategoryService.addSubCategory(subCategory);
//        return "redirect:/admin";
//    }
    @RequestMapping("/adding")
    public String displayAdding( @ModelAttribute("cat") Category category,@ModelAttribute("sub")SubCategory subcategory){
        return "adding.jsp";
    }

        @PostMapping("/createCategory")
        public String createCategory(Principal principal, @Valid @ModelAttribute("cat") Category category, BindingResult result) {
            categoryService.addCategory(category);
            return "redirect:/adding";
        }
    @PostMapping("/createSubCategory")
    public String createSubCategory(Principal principal, @Valid @ModelAttribute("sub") SubCategory subcategory, BindingResult result) {
        subCategoryService.addSubCategory(subcategory);
        return "redirect:/adding";
    }

    @RequestMapping("/profile/{id}")
    public String showProfile(@PathVariable("id") Long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("User", user);
        List <Feedback> messages = user.getFeedbacks();
        model.addAttribute("messages", messages);
        return "profile.jsp";
    }

    @RequestMapping("/profile/{id}/comment")
    public String commentEvent (@PathVariable("id") Long id,
                                @RequestParam("comment") String comment, RedirectAttributes r) {
        if (comment.length() < 5) {
            r.addFlashAttribute("error", "Comment must be at least five characters long.");
            return "redirect:/profile/" + id;
        }
        else {
            Feedback c = new Feedback();
            c.setComment(comment);
            User user = userService.getUser(id);
            c.setUser(user);
            feedBackService.createComment(c);
            return "redirect:/profile/" + id;
        }
    }

}
