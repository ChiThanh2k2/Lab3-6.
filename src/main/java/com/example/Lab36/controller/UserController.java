package com.example.Lab36.controller;

import com.example.Lab36.entity.User;
import com.example.Lab36.services.UserService;
import com.example.Lab36.vadidator.annotation.ValidUserId;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String login(){
        return "user/login";
    }
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "user/register";
    }
    @PostMapping("/register")
    public String register(@Valid, @ModelAttribute("user")User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getFieldError().forEach(error)
        }
    }

}
