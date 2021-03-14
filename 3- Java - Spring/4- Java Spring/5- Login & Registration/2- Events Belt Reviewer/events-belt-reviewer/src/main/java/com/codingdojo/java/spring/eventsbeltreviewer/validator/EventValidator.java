package com.codingdojo.java.spring.eventsbeltreviewer.validator;

import java.util.List;

import com.codingdojo.java.spring.eventsbeltreviewer.models.User;
import com.codingdojo.java.spring.eventsbeltreviewer.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



@Component
public class EventValidator implements Validator {
    private final UserRepository userRepository;

    public EventValidator (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public boolean supports (Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate (Object target, Errors errors) {
        User user = (User) target;
        List <User> allusers = userRepository.findAll();

        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "PasswordConfirm");
        }
        for (int i = 0; i < allusers.size(); i++) {
            String email = allusers.get(i).getEmail();
            if (email.equals(user.getEmail())) {
                errors.rejectValue("email", "EmailIsAlreadyThere");
            }
        }
    }
}
