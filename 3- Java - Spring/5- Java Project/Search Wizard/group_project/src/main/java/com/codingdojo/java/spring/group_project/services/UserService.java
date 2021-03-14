package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.classes.Location;
import com.codingdojo.java.spring.group_project.models.Role;
import com.codingdojo.java.spring.group_project.models.SubCategory;
import com.codingdojo.java.spring.group_project.models.User;
import com.codingdojo.java.spring.group_project.repositories.RoleRepository;
import com.codingdojo.java.spring.group_project.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    // 1
    public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
        userRepository.save(user);
    }

    // 2
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_ADMIN")));
        userRepository.save(user);
    }

    // 3
    public User findByEmail(String email) {

        return userRepository.findByEmail(email);
    }
    //Service return user by id
    public User getUser(Long id){
        User user =userRepository.findUserById(id);
        return user;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //method that accept(approved on) the request
    public void approve(Long id){
        User user =userRepository.findUserById(id);
        user.setApprove(true);
    }
    public String getUserCity(User user){
        return user.getAddress().getCity().getName();
    }
    public List<User> getAllUsersRelated(String city, SubCategory sub){
            return userRepository.getRelatedUser(city,sub);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void makeAdmin(Long id) {
        User user = userRepository.findById(id).get();
        List<Role> roles = user.getRoles();
        roles.add((Role) roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }
    public void makeUser(Long id) {
        User user = userRepository.findById(id).get();
        List<Role> roles = user.getRoles();
        roles.remove(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }
    public void update(User user) {
        user.getId();
        userRepository.save(user);
    }
    public List<User> notApproved(boolean status){
        return userRepository.findByApproveEquals(status);
    }

    public User getOneById(Long id) {
        return userRepository.findById(id).get();
    }

    public void updateUserStatus(User user) {
        userRepository.save(user);
    }


}