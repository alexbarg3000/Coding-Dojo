package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Phone;
import com.codingdojo.java.spring.group_project.repositories.PhonesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneService {
    private final PhonesRepository phoneRepo;

    public PhoneService(PhonesRepository phoneRepo) {
        this.phoneRepo = phoneRepo;
    }
    public List<Phone> getPhoneNumbers(Long id){
        return phoneRepo.findAllById(id);
    }

}
