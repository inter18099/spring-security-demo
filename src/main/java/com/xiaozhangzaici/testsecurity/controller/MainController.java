package com.xiaozhangzaici.testsecurity.controller;

import com.xiaozhangzaici.testsecurity.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/welcome")
    public String home() {
        return "welcome";
    }
}