package com.gulag.JapanEvents.services;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.gulag.JapanEvents.models.Event;
import com.gulag.JapanEvents.repositories.EventRepository;

@Service
public class EventService {
    
    EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAll(){
        List<Event> event = repository.findAll();
        return event;
    }

    public Optional<Event> getById(@NonNull Long id){
        Optional<Event> event = repository.findById(id);

        return event;
    }

    public Event saveEvent(Event event){
        return repository.save(event);
    }
}
