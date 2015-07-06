package com.github.marrontan619.evetice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String topPage() {
        return "login";
    }

}
