package com.codingdojo.java.spring.ninjagold;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
//@RequestMapping("/")

public class ResetController {
    @RequestMapping("/reset")
    public String reset(HttpSession session) {
        session.removeAttribute("gold");
        session.removeAttribute("activities");
        return "redirect:/";
    }
}

