package com.github.marrontan619.evetike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.marrontan619.evetike.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
