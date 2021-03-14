package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhonesRepository extends CrudRepository<Phone,Long> {
    List<Phone> findAllById(Long id);

}
