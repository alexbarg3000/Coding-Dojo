package com.codingdojo.java.spring.group_project.auth.validator;


import com.codingdojo.java.spring.group_project.models.User;
import com.codingdojo.java.spring.group_project.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {
    private final UserRepository userRepository;


    private static final String email_regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;
    // Need to match email regex

    public UserValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.pattern = Pattern.compile(email_regex);
    }
    // Makes the pattern the email regex in the constructor

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    // Specifies that a instance of the User Domain Model
    // can be validated with this custom validator

    public boolean validateEmail(String username) {
        this.matcher = this.pattern.matcher(username);
        return matcher.matches();
    }
    // Checks if the email is an email and returns a boolean

    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;

        List<User> allusers = userRepository.findAll();

        if (!user.getConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "PasswordConfirm");
        }

        for (int i = 0; i < allusers.size(); i++) {
            String email = allusers.get(i).getEmail();
            if (email.equals(user.getEmail())) {
                errors.rejectValue("username", "EmailIsAlreadyThere");
            }
        }
    }
}