package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Role;
import com.codingdojo.java.spring.group_project.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> all(){
        return (List<Role>) roleRepository.findAll();
    }

    public Role findByName(String name){
        return roleRepository.findByName(name);
    }

    public void create(Role role){
        roleRepository.save(role);
    }
    public void update(Role role){
        roleRepository.save(role);
    }
    public void destroy(long id){
        roleRepository.deleteById(id);
    }

}
