package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.repositories.TypesRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
    private final TypesRepository typeRepo;

    public TypeService(TypesRepository typeRepo) {
        this.typeRepo = typeRepo;
    }
}
