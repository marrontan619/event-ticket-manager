package com.github.marrontan619.evetike.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class TicketPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "ticket_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;

    @Column(name = "event_id", nullable = false)
    private int eventId;

    protected TicketPK() {};

    public TicketPK(int ticketId, int eventId) {
        this.ticketId = ticketId;
        this.eventId = eventId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
