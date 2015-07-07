package com.github.marrontan619.evetike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.marrontan619.evetike.model.Ticket;
import com.github.marrontan619.evetike.model.TicketPK;

public interface TicketRepository extends JpaRepository<Ticket, TicketPK> {

}
