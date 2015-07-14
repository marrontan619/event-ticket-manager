package com.github.marrontan619.evetike.model.form;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class EventForm {

    @NotEmpty
    private String eventName;
    private Date eventDate;
    private String location;
    private String url;
    private String description;

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public Date getEventDate() {
        return eventDate;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
