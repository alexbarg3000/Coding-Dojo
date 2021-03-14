package com.codingdojo.java.spring.dojosandninjas.controllers;

import com.codingdojo.java.spring.dojosandninjas.models.Dojo;
import com.codingdojo.java.spring.dojosandninjas.models.Ninja;
import com.codingdojo.java.spring.dojosandninjas.services.DojoNinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaController {
    private final DojoNinjaService dojoNinjaService;

    public NinjaController(DojoNinjaService dojoNinjaService) {
        this.dojoNinjaService = dojoNinjaService;
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninjaObject") Ninja Ninja, Model model) {
        List<Dojo> dojos = dojoNinjaService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "/DojosAndNinjas/newninja.jsp";
    }

    @PostMapping("/addninja")
    public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result,Model model) {
        if(result.hasErrors()) {
            List<Dojo> dojos = dojoNinjaService.getAllDojos();
            model.addAttribute("dojos", dojos);
            return "/DojosAndNinjas/newninja.jsp";
        }
        else {
            dojoNinjaService.addNinja(ninja);
            return "redirect:/dojos/" + ninja.getDojo().getId() ;
        }
    }
}
