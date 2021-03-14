package com.codingdojo.java.spring.dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/")

public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";

    }
}
