package com.github.marrontan619.evetike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/event")
public class EventController {

    @RequestMapping(params = "action=new", method = RequestMethod.GET)
    public String newEvent() {
        return "newEvent";
    }

    @RequestMapping(params = "action=regist", method = RequestMethod.GET)
    public String registEvent() {
        int a = 0;
        return "top";
    }
}
