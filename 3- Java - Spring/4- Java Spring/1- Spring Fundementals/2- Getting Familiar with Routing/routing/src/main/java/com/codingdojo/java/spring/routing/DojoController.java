package com.codingdojo.java.spring.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {

    @RequestMapping("{bootcamp}")
    public String dojo(@PathVariable("bootcamp") String bootcamp) {
        if (bootcamp.equals("dojo")) {
            return "The dojo is awesome!";
        }
        if (bootcamp.equals("burbank-dojo")) {
            return "Burbank Dojo is located in Southern California.";
        }
        if (bootcamp.equals("san-jose")) {
            return "SJ dojo is the headquarters.";
        }
        return "";


    }
}



