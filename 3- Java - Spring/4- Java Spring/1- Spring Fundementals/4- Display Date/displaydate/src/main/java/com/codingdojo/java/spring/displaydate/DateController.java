package com.codingdojo.java.spring.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller

public class DateController {
    @RequestMapping("/date")
    public String date(Model model) {
        String datePattern = "EEEEE, dd MMMMM, yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        String date = dateFormat.format(new Date());

        model.addAttribute("date", date);
        return "date.jsp";
    }
}
