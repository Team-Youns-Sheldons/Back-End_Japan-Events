package com.gulag.JapanEvents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulag.JapanEvents.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
    
    public Event findByName(String name);

}
