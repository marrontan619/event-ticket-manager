package com.github.marrontan619.evetike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.marrontan619.evetike.model.Users;
import com.github.marrontan619.evetike.repository.UsersRepository;

@Controller
public class LoginController {

	@Autowired
	UsersRepository userRepository;

    @RequestMapping(value = "/")
    public String login() {
        List<Users> user = userRepository.findByUserName("aoki");
        return "login";
    }
}
