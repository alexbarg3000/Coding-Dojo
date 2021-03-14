package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Role;
import com.codingdojo.java.spring.group_project.models.User;
import com.codingdojo.java.spring.group_project.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

//    Finds the user by their username. If a user is found, it returns it with the correct authorities. If the username does not exist, the method throws an error

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthorities(user));
    }


//    Returns a list of authorities/permissions for a specific user. For example, our clients can be 'user',
//    'admin', or both. For Spring Security to implement authorization, we must get the name of the possibles roles for current user from our database and create a new `GrantedAuthority' object with those roles.

    private List<GrantedAuthority> getAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(Role role : user.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
