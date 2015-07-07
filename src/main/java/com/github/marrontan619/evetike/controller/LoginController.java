package com.github.marrontan619.evetike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.marrontan619.evetike.model.Event;
import com.github.marrontan619.evetike.repository.EventRepository;
import com.github.marrontan619.evetike.repository.UsersRepository;

@Controller
public class LoginController {

    @Autowired
    UsersRepository userRepository;

    @Autowired
    EventRepository eventRepository;

    @RequestMapping(value = "/top")
    public ModelAndView top(ModelAndView mav) {
        List<Event> events = eventRepository.findAll();
        mav.addObject("events", events);
        mav.setViewName("top");
        return mav;
    }

    @RequestMapping(value = "/loginFailure")
    public String loginFailure() {
        return "loginFailure";
    }
}
