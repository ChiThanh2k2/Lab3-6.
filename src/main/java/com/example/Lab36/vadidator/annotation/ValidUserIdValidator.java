package com.example.Lab36.vadidator.annotation;

import com.example.Lab36.entity.User;
import com.example.Lab36.vadidator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId()!= null;
    }

}
