package com.codingdojo.java.spring.group_project.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Location {
    private final ArrayList<String> Locations = new ArrayList<>(Arrays.asList("Ramallah", "Nablus", "Hebron",
            "Jenin", "Bethlehem", "Tulkarm", "Jerusalem", "BeitJallah", "BeitSahor", "Tobas", "Abu Dis",
            "Khan Younis", "Salfeet", "Al Bireh", "Rafah", "Qalqilya", "Jericoh", "Zababdeh", "Gaza", "Jabalia", "Qabatia"
            , "Faqua"));

    public ArrayList<String> getLocations() {
        return Locations;
    }
}
