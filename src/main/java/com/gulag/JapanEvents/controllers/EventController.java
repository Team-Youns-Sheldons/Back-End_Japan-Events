package com.gulag.JapanEvents.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulag.JapanEvents.models.Event;
import com.gulag.JapanEvents.services.EventService;

@RestController
@RequestMapping(path = "${api-endpoint}/allevents")
public class EventController {
    
    EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Event> index(){
        List<Event> event = service.getAll();
        return event;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Event>> show(@NonNull @PathVariable("id") Long id){
        Optional<Event> event = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(event);
    }
}
