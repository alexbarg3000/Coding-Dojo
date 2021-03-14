package com.codingdojo.java.spring.greatideas.validator;
//
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//import java.util.List;
//
//
//@Component
//public class UserValidator implements Validator {
//    private final UserRepository userRepository;
//
//    public UserValidator (UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        User user = (User) target;
//        List<User> allusers = userRepository.findAll();
//
//        if (!user.getPasswordConfirm().equals(user.getPassword()))
//            errors.rejectValue("passwordConfirm", "Match");
//
//        for (int i = 0; i < allusers.size(); i++) {
//            String email = allusers.get(i).getEmail();
//            if (email.equals(user.getEmail())) {
//                errors.rejectValue("email", "EmailIsAlreadyThere");
//            }
//        }
//    }
//
//}

import com.codingdojo.java.spring.greatideas.models.User;
import com.codingdojo.java.spring.greatideas.repositories.UserRepo;
import com.codingdojo.java.spring.greatideas.services.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;


@Component
public class UserValidator implements Validator {


    private final UserRepo userRepo;

    public UserValidator(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



    // 1
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    // 2
    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        List<User> allusers = userRepo.findAll();


        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // 3
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


