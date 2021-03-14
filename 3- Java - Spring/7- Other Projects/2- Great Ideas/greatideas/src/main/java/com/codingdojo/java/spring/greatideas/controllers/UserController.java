package com.codingdojo.java.spring.greatideas.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.codingdojo.java.spring.greatideas.models.User;
import com.codingdojo.java.spring.greatideas.services.UserService;
import com.codingdojo.java.spring.greatideas.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class UserController {
    private final UserService userService;
    private final UserValidator userValidator;

    // NEW
    public UserController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @RequestMapping("/")
    public String loginReg(@ModelAttribute("user") User user, @ModelAttribute("error") String error, Model model) {
        System.out.println("===============================================loginReg()");
        model.addAttribute("error", error);
        return "/loginreg/loginregPage.jsp";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirectAttrs) {
        if (email.length() < 1) {
            redirectAttrs.addFlashAttribute("error", "Email field cannot be blank.");
            return "redirect:/";
        }
        else if (password.length() < 1) {
            redirectAttrs.addFlashAttribute("error", "Please enter your password.");
            return "redirect:/";
        }
        else if (userService.authenticateUser(email, password)) {
            User user = userService.findByEmail(email);
            session.setAttribute("userId", user.getId());
            return "redirect:/ideas";
                }
        else {
            redirectAttrs.addFlashAttribute("error", "User was not successfully authenticated");
            return "redirect:/";
        }

        //return "loginreg/loginregPage.jsp";
    }

    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        System.out.println("===============================================registerUser()");
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "/loginreg/loginregPage.jsp";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        System.out.println("SUCCESS ========================================registerUser()");
        System.out.println(u.getId());
        return "redirect:/ideas";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("===============================================logout()");
        session.invalidate();
        return "redirect:/";
    }
}
