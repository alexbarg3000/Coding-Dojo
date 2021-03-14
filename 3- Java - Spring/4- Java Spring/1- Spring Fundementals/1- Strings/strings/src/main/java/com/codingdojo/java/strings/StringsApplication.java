package com.codingdojo.java.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

    public static void main(String[] args) {

        SpringApplication.run(StringsApplication.class, args);
    }

//    @GetMapping("/random")
//    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }

    @GetMapping("/")
    public String hello() {
        return "Hello client! You are the best client anybody could have asked for!";
    }

    @GetMapping("/random")
    public String greeting() {
        return "Spring Boot is alright so far, but Maven install was kinda sketchy!";
    }

}
