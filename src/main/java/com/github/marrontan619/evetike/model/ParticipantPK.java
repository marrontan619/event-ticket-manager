package com.github.marrontan619.evetike.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ParticipantPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "participant_id", nullable = false)
    private String participantId;

    @Column(name = "event_id", nullable = false)
    private int eventId;

    protected ParticipantPK() {};

    public ParticipantPK(String participantId, int eventId) {
        this.participantId = participantId;
        this.eventId = eventId;
    }
}
