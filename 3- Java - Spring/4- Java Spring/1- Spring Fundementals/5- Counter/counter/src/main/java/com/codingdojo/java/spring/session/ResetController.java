package com.codingdojo.java.spring.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/")

public class ResetController {
    @RequestMapping("/reset")
    public String reset(HttpSession session) {
        session.removeAttribute("count");

        return "results.jsp";

    }
}

