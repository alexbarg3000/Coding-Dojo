package com.codingdojo.java.spring.driverslicense.controllers;

import com.codingdojo.java.spring.driverslicense.models.Person;
import com.codingdojo.java.spring.driverslicense.services.LicenseService;
import com.codingdojo.java.spring.driverslicense.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;
    private final LicenseService licenseService;

    public PersonController(PersonService personService, LicenseService licenseService) {
        this.personService = personService;
        this.licenseService = licenseService;
    }

    @RequestMapping("/persons/new")
    public String newPerson(@ModelAttribute("personObject") Person person, Model model) {
        return "/DriversLicense/newperson.jsp";
    }


    @RequestMapping(value="/createperson", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("personObject") Person  person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Person> persons = personService.allPersons();
            model.addAttribute("persons", persons);
            return "/DriversLicense/newperson.jsp";
        } else {
            personService.createPerson(person);
            return "redirect:licenses/new";
        }
    }

    @RequestMapping("/persons/{id}")
    public String viewDetails(@PathVariable("id") Long id, Model model) {
        model.addAttribute("license", licenseService.getLicense(id).get());
        return "DriversLicense/view.jsp";
    }
}



