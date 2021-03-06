package com.example.loginFea.controller;

import com.example.loginFea.model.User;
import com.example.loginFea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "/account/login";
    }

    @GetMapping("/register")
    public String register() {
        return "/account/register";
    }
    @PostMapping("/register")
    public String register(User user) { //User.java 클래스를 가져옴
        userService.save(user);
        return "redirect:/";
    }
}
