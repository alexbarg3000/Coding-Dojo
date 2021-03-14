package com.codingdojo.java.spring.ninjagold;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Controller
//@RequestMapping("/")

public class GoldController {
    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String process(@RequestParam(value = "building") String building, HttpSession session) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

        if (building.equals("farm")) {
            int num = ThreadLocalRandom.current().nextInt(10, 21);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold + num);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You worked at a farm and earned " + num + " gold. ("
                    + timeStamp + ")");
        }

        if (building.equals("cave")) {
            int num = ThreadLocalRandom.current().nextInt(5, 11);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold + num);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You explored a cave and found " + num + " gold. ("
                    + timeStamp + ")");
        }

        if (building.equals("house")) {
            int num = ThreadLocalRandom.current().nextInt(2, 6);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold + num);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You broke into a house and looted " + num + " gold. ("
                    + timeStamp + ")");
        }

        if (building.equals("spa")) {
            int num = ThreadLocalRandom.current().nextInt(5, 21);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold - num);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You went for a sensual massage at the spa and it cost you "
                    + num + " gold. (" + timeStamp + ")");
        }

        if (building.equals("casino")) {
            int num = ThreadLocalRandom.current().nextInt(-50, 51);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold + num);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            if (num > 0) {
                activities.add(0, "You gambled at the casino and won " + num + " gold. ("
                        + timeStamp + ")");
            }
            if (num < 0) {
                activities.add(0, "You gambled at the casino and lost " + num + " gold. ("
                        + timeStamp + ")");
            }
            if (num == 0) {
                activities.add(0, "You gambled at the casino and broke even. ("
                        + timeStamp + ")");
            }
        }
        return "redirect:/";
    }
}