package com.codingdojo.java.spring.driverslicense.controllers;

import com.codingdojo.java.spring.driverslicense.models.License;
import com.codingdojo.java.spring.driverslicense.models.Person;
import com.codingdojo.java.spring.driverslicense.services.LicenseService;
import com.codingdojo.java.spring.driverslicense.services.PersonService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class LicenseController {
    private final LicenseService licenseService;
    private final PersonService personService;


    public LicenseController(LicenseService licenseService, PersonService personService) {
        this.licenseService = licenseService;
        this.personService = personService;
    }

    @RequestMapping("/licenses/new")
    public String newLicense(@ModelAttribute("licenseObject") License license, Model model) {
        List<Person> personslist = personService.allPersons();
        model.addAttribute("personslist", personslist);
        ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
                "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
                "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
                "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
                "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
        model.addAttribute("states", states);
        return "DriversLicense/newlicense.jsp";
    }

    @RequestMapping(value="/addlicense", method=RequestMethod.POST)
    public String addlicense(@Valid @ModelAttribute("licenseObject") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "DriversLicense/newlicense.jsp";
        }
        else {
            String number = licenseService.generateLicenseNumber();
            license.setNumber(number);
            licenseService.createLicense(license);
            return "redirect:/persons/" +license.getId();
        }
    }
}



