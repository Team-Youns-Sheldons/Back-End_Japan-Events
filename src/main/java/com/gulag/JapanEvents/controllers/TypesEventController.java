package com.gulag.JapanEvents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulag.JapanEvents.models.TypesEvent;
import com.gulag.JapanEvents.services.TypesEventService;

@RestController
@RequestMapping(path = "/{api-endpoint}/events")
public class TypesEventController {
    
    TypesEventService service;

    public TypesEventController(TypesEventService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<TypesEvent> index(){
        
        List<TypesEvent> typesEvent = service.getAll();
        return typesEvent;

    }
}
