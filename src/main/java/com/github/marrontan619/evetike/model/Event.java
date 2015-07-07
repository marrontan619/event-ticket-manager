package com.github.marrontan619.evetike.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @Column(name = "event_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "location")
    private String location;

    @Column(name = "url")
    private String url;

    @Column(name = "description")
    private String description;

    protected Event() {};

    public Event(String eventName) {
        this.eventName = eventName;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
