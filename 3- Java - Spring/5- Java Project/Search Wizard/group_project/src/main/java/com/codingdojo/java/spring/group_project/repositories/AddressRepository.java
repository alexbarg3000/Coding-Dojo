package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Address;
import com.codingdojo.java.spring.group_project.models.User;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
    Address findAddressByUser(User u);

}
