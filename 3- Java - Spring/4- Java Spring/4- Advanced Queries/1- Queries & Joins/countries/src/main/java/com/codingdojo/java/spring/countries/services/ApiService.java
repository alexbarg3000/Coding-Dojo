package com.codingdojo.java.spring.countries.services;

import java.util.List;

import com.codingdojo.java.spring.countries.repositories.CityRepository;
import com.codingdojo.java.spring.countries.repositories.CountryRepository;
import org.springframework.stereotype.Service;



@Service
public class ApiService {
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;

    public ApiService (CountryRepository countryRepository, CityRepository cityRepository) {
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
    }

    public List<Object[]> firstQuery() {
        return countryRepository.findByName();
    }

    public List<Object[]> secondQuery() {
        return countryRepository.findByName2();
    }

    public List<Object[]> thirdQuery() {
        return cityRepository.findByName();
    }

    public List<Object[]> fourthQuery() {
        return countryRepository.findByName3();
    }

    public List<Object[]> fifthQuery() {
        return countryRepository.findByName4();
    }

    public List<Object[]> sixthQuery() {
        return countryRepository.findByName5();
    }

    public List<Object[]> seventhQuery() {
        return countryRepository.findByName6();
    }

    public List<Object[]> eighthQuery() {
        return countryRepository.findByRegion();
    }
}