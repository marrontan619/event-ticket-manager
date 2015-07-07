package com.github.marrontan619.evetike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.marrontan619.evetike.model.Participant;
import com.github.marrontan619.evetike.model.ParticipantPK;

public interface ParticipantRepository extends JpaRepository<Participant, ParticipantPK> {

}
