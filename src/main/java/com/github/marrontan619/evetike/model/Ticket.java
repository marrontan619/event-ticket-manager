package com.github.marrontan619.evetike.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

    @EmbeddedId
    private TicketPK ticketPK;

    @Column(name = "published_flag", nullable = false)
    private boolean publishedFlag;

    @Column(name = "price")
    private int price;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "note")
    private String note;
}
