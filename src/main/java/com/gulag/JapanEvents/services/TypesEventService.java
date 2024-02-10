package com.gulag.JapanEvents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gulag.JapanEvents.models.TypesEvent;
import com.gulag.JapanEvents.repositories.TypesEventRepository;

@Service
public class TypesEventService {
    
    TypesEventRepository repository;

    public TypesEventService(TypesEventRepository repository) {
        this.repository = repository;
    }

    public List<TypesEvent> getAll(){
        List<TypesEvent> typesEvent = repository.findAll();
        return typesEvent;
    }
}
