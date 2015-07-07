package com.github.marrontan619.evetike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.marrontan619.evetike.repository.UsersRepository;

@Controller
public class LoginController {

    @Autowired
    UsersRepository userRepository;

    @RequestMapping(value = "/top")
    public String top() {
        return "top";
    }

    @RequestMapping(value = "/loginFailure")
    public String loginFailure() {
        return "loginFailure";
    }
}
