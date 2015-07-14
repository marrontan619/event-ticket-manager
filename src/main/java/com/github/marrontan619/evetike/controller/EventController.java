package com.github.marrontan619.evetike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.marrontan619.evetike.model.Event;
import com.github.marrontan619.evetike.model.form.EventForm;
import com.github.marrontan619.evetike.repository.EventRepository;

@Controller
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @ModelAttribute
    EventForm setUpNewEventForm() {
        return new EventForm();
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newEvent(@ModelAttribute EventForm newEventForm, Model model) {
        model.addAttribute("newEventForm", newEventForm);
        return "newEvent";
    }


    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String registEvent(@Validated final EventForm newEventForm, final BindingResult bindingResult) {
        Event event = new Event();
        if (!bindingResult.hasErrors()) {
            event.setEventName(newEventForm.getEventName());
            event.setEventDate(newEventForm.getEventDate());
            event.setLocation(newEventForm.getLocation());
            event.setUrl(newEventForm.getUrl());
            event.setDescription(newEventForm.getDescription());
            eventRepository.save(event);
            return "redirect:/top";
        } else {
            return "redirect:/event/new";
        }
    }
}
