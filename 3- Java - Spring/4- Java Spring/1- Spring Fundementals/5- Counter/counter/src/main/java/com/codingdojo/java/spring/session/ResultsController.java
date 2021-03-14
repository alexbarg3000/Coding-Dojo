package com.codingdojo.java.spring.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/")

public class ResultsController {
    @RequestMapping("/counter")
    public String results(HttpSession session) {
            return "results.jsp";

    }
}

