package com.codingdojo.java.spring.countries.controllers;

import java.util.List;

import com.codingdojo.java.spring.countries.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CountryController {
    private final ApiService apiService;

    public CountryController (ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        List<Object[]> table = apiService.firstQuery();
        model.addAttribute("table", table);

        List <Object[]> table2 = apiService.secondQuery();
        model.addAttribute("table2", table2);

        List<Object[]> table3 = apiService.thirdQuery();
        model.addAttribute("table3", table3);

        List<Object[]> table4 = apiService.fourthQuery();
        model.addAttribute("table4", table4);

        List<Object[]> table5 = apiService.fifthQuery();
        model.addAttribute("table5", table5);

        List<Object[]> table6 = apiService.sixthQuery();
        model.addAttribute("table6", table6);

        List<Object[]> table7 = apiService.seventhQuery();
        model.addAttribute("table7", table7);

        List<Object[]> table8 = apiService.eighthQuery();
        model.addAttribute("table8", table8);
        return "index.jsp";
    }
}
