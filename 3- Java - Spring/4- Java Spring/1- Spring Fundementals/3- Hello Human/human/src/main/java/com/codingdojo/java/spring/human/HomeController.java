package com.codingdojo.java.spring.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String human(@RequestParam(value="first_name", required=false) String firstName,
                        @RequestParam(value="last_name", required=false) String lastName) {

        if(firstName != null & lastName == null){
            return "<h1>Hello "+ firstName+"</h1>" +"\n"+"<h3> Welcome to Spring Boot </h3>";
        }

        if(firstName != null & lastName != null){
            return "<h1>Hello "+ firstName+" "+lastName+"</h1>" +"\n"+"<h3> Welcome to Spring Boot </h3>";
        }

        else{
            return "<h1>Hello Human </h1>" +"\n"+"<h3> Welcome to Spring Boot </h3>";
        }
    }
}
