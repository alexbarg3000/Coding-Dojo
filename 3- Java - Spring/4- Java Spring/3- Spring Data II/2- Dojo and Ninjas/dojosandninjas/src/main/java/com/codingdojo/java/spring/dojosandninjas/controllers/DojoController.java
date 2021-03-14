package com.codingdojo.java.spring.dojosandninjas.controllers;

import com.codingdojo.java.spring.dojosandninjas.models.Dojo;
import com.codingdojo.java.spring.dojosandninjas.models.Ninja;
import com.codingdojo.java.spring.dojosandninjas.services.DojoNinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller

public class DojoController {
    private final DojoNinjaService dojoNinjaService;

    public DojoController(DojoNinjaService dojoNinjaService) {
        this.dojoNinjaService = dojoNinjaService;
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
        return "/DojosAndNinjas/newdojo.jsp";
    }

    @PostMapping("/adddojo")
    public String addDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result,Model model) {
        if(result.hasErrors()) {
            List<Dojo> dojos = dojoNinjaService.getAllDojos();
            model.addAttribute("dojos", dojos);
            return "/DojosAndNinjas/newdojo.jsp";
        }
        else {
            dojoNinjaService.addDojo(dojo);
            return "redirect:/ninjas/new";
        }
    }

    @GetMapping("/dojos/{dojoId}")
    public String showDojo(@PathVariable("dojoId") long id, Model model) {
        Dojo dojo = dojoNinjaService.singleDojo(id);
        model.addAttribute("dojo", dojo);
        return "/DojosAndNinjas/show.jsp";
    }
}
