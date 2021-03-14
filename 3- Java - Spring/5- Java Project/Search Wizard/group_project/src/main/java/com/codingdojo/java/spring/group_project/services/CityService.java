package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Address;
import com.codingdojo.java.spring.group_project.models.City;
import com.codingdojo.java.spring.group_project.models.User;
import com.codingdojo.java.spring.group_project.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepo;

    public CityService(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }

    public List<City> getAllCities(){
        return cityRepo.findAll();
    }
    public City getCityByAddress(Address address){
        return cityRepo.findCityByAddresses(address);

    }

    public void save(City city) {
    }
}
