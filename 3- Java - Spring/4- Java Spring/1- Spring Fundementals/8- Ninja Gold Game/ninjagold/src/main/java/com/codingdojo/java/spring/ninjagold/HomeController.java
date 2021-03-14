package com.codingdojo.java.spring.ninjagold;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
//@RequestMapping("/")

public class HomeController {
    @RequestMapping("/")
    public String gold(HttpSession session) {
        if(session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }


        if((int)session.getAttribute("gold") < 0) {
            return "jail.jsp";
        }
        return "gold.jsp";
    }
}

