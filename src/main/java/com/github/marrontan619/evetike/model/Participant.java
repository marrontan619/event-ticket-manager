package com.github.marrontan619.evetike.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant {

    @EmbeddedId
    private ParticipantPK participantPK;

    @Column(name = "rank")
    private int rank;
}
