package com.gulag.JapanEvents.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gulag.JapanEvents.models.Event;
import com.gulag.JapanEvents.services.EventService;
import com.gulag.JapanEvents.services.FileStorageService;

@RestController
@RequestMapping(path = "${api-endpoint}/allevents")
public class EventController {
    
    EventService service;

    FileStorageService fileStorageService;

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

    @PostMapping(path = "")
    public ResponseEntity<Event> store(@RequestBody Event newEvent, @RequestParam("file") MultipartFile file) throws Exception{
        
        if(!file.isEmpty()){
            String imageName = fileStorageService.storeFile(file);

            newEvent.setImage(imageName);
        }

        Event saveEvent = service.saveEvent(newEvent);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveEvent);
    }
}
