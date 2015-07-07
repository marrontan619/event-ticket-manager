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

    public boolean isPublishedFlag() {
        return publishedFlag;
    }

    public void setPublishedFlag(boolean publishedFlag) {
        this.publishedFlag = publishedFlag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
