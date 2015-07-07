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
}
