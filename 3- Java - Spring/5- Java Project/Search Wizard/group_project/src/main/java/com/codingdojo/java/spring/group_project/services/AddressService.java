package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Address;
import com.codingdojo.java.spring.group_project.models.User;
import com.codingdojo.java.spring.group_project.repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepo;

    public AddressService(AddressRepository addressRepo) {
        this.addressRepo = addressRepo;
    }
    public Address getAddressByUser(User user){
        return addressRepo.findAddressByUser(user);
    }
    public void updateAddress(Address address){
        addressRepo.save(address);
    }
}
