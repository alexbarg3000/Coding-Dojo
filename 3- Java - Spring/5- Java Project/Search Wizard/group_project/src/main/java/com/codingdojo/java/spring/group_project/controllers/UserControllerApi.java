//package com.codingdojo.java.spring.group_project.controllers;
//
//import com.codingdojo.java.spring.group_project.auth.validator.UserValidator;
//import com.codingdojo.java.spring.group_project.classes.Location;
//import com.codingdojo.java.spring.group_project.config.FileUploadUtil;
//import com.codingdojo.java.spring.group_project.models.*;
//import com.codingdojo.java.spring.group_project.repositories.RoleRepository;
//import com.codingdojo.java.spring.group_project.services.*;
//import org.springframework.ui.Model;
//import org.springframework.util.StringUtils;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.validation.Valid;
//import java.io.IOException;
//import java.security.Principal;
//import java.util.List;
//@RestController
//public class UserControllerApi {
//        private final RoleRepository roleRepository;
//        private final UserValidator userValidator;
//        private final UserService userService;
//        private final RoleService roleService;
//        private final CategoryService categoryservice;
//        private final SubCategoryService subcategoryservice;
//        private final AddressService addressService;
//        private final CityService cityService;
//
//        public UserControllerApi(RoleRepository roleRepository, UserValidator userValidator, UserService userService, RoleService roleService, CategoryService categoryservice, SubCategoryService subcategoryservice, AddressService addressService, CityService cityService) {
//            this.roleRepository = roleRepository;
//            this.userValidator = userValidator;
//            this.userService = userService;
//            this.roleService = roleService;
//            this.categoryservice = categoryservice;
//            this.subcategoryservice = subcategoryservice;
//            this.addressService = addressService;
//            this.cityService = cityService;
//
//        }
//        @RequestMapping("/api/allCategories")
//        //home controller to view the home page
//        public List<Category> HomePage(Model model) {
//
//            List<Category> categories = categoryservice.getAllCategories();
//            return categories;
//        }
//
//
//    @RequestMapping("/api/allSubCategories")
//    public List<SubCategory> allSubs(Model model) {
//        List<SubCategory> subcategories = subcategoryservice.getAllSubs();
//        return subcategories;
//    }
//
//@RequestMapping("/api/allCity")
//        public List<String> showCity() {
//    Location location = new Location();
//   return location.getLocations();
//}
//    @RequestMapping("/api/allUsers")
//            public List<User> showUsers() {
//        List<User> allUsers = userService.getAllUsers();
//        return allUsers;
//    }
//    @RequestMapping("/api/userRelated/{subId}/{city}")
//            public List<User> relatedUser(@PathVariable("subId")Long id,@PathVariable("city")String city) {
//        SubCategory sub = subcategoryservice.getSubById(id);
//        List<User> allRelatedUsers = userService.getAllUsersRelated(city, sub);//method take the city and subCategory selected by the user.
//        return allRelatedUsers;
//    }
//    //related sub
//    @RequestMapping("/api/subrelated/{catId}")
//            public List<SubCategory> showRelated(@PathVariable("catId")Long id){
//        Category category =categoryservice.findCategoryById(id);
//            List<SubCategory> relatedSubCat=subcategoryservice.getAllRelateSubs(category);
//           return relatedSubCat;
//        }
////edit user
//    @RequestMapping(value = "/api/updateUser/{id}", method = RequestMethod.PUT)
//    public User updateUser(@PathVariable("id")Long id,@RequestParam(value="first_name") String firstName, @RequestParam(value=
//            "last_name") String lastName, @RequestParam(value="business_name") String businessName,
//                             @RequestParam(value="phone") List <Phone> phoneNum, @RequestParam(value="street") String st, @RequestParam(value="building") String build, @RequestParam(value="business_email") String businessEmail, @RequestParam(value="city") String c, Principal principal, @RequestParam("image") String img) {
//
//        User user = userService.getUser(id);
//        Address address = addressService.getAddressByUser(user);
//        City city = cityService.getCityByAddress(address);
//        user.setFirst_name(firstName);
//        user.setLast_name(lastName);
//        user.setBusiness_name(businessName);
//        user.setPhones(phoneNum);
//        user.setBusiness_email(businessEmail);
//        address.setBuilding(build);
//        address.setStreet(st);
//        city.setName(c);
//        userService.update(user);
//        cityService.save(city);
//        addressService.updateAddress(address);
////        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        user.setPhotos(img);
////        String uploadDir = "user-photos/" + user.getId();
////        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//        return user;
//    }
//    @PostMapping("/api/registration")
//    public User registration(@ModelAttribute("user") User user,
//                               @RequestParam(value="first_name") String firstName, @RequestParam(value=
//            "last_name") String lastName, @RequestParam(value="business_name") String businessName,
//                               @RequestParam(value="phone") List <Phone> phoneNum, @RequestParam(value="street") String st, @RequestParam(value="building") String build, @RequestParam(value="business_email") String businessEmail, @RequestParam(value="city") String c, @RequestParam("image")String img){
//            Address address =addressService.getAddressByUser(user);
//            City city =cityService.getCityByAddress(address);
//            user.setFirst_name(firstName);
//            user.setLast_name(lastName);
//            user.setBusiness_name(businessName);
//            user.setPhones(phoneNum);
//            user.setBusiness_email(businessEmail);
//            address.setBuilding(build);
//            address.setStreet(st);
//            city.setName(c);
//            userService.update(user);
//            cityService.save(city);
//            userService.saveWithUserRole(user);
//            addressService.updateAddress(address);
////            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//            user.setPhotos(img);
////            String uploadDir = "user-photos/" + user.getId();
////            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//            return user;
//    }
//
//    @RequestMapping("/api/notApprove/{status}")
//    public List<User> displayAdmin(@PathVariable("status")Boolean status) {
//            List<User> users = userService.notApproved(status);
//            return users;
//    }
//
//    @RequestMapping("/api/admin/approved/{id}")
//    public String activate(@PathVariable("id") Long id) {
//        User user = userService.getOneById(id);
//        Boolean approved = true;
//        user.setApprove(approved);
//        userService.updateUserStatus(user);
//        return "redirect:/admin";
//    }
//
//    @RequestMapping("/api/admin/notapproved/{id}")
//    public String deactivate(@PathVariable("id") Long id) {
//        User user = userService.getOneById(id);
//        Boolean approved = false;
//        user.setApprove(approved);
//        userService.updateUserStatus(user);
//        return "redirect:/admin";
//    }
//
//    @RequestMapping(value = "/api/admin/delete/{id}",method = RequestMethod.DELETE)
//    public void deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//    }
//    @RequestMapping(value = "/api/addCat",method = RequestMethod.POST)
//    public Category addCaty(@RequestParam(value = "title")String title){
//    Category category =new Category(title);
//    return categoryservice.addCategory(category);
//    }
//    @RequestMapping(value = "/api/addSub",method = RequestMethod.POST)
//    public SubCategory addSubCat(@RequestParam(value = "title")String title){
//        SubCategory sub =new SubCategory(title);
//        return subcategoryservice.addSub(sub);
//    }
//}
