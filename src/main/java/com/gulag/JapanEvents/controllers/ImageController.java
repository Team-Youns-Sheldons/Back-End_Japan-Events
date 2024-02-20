package com.gulag.JapanEvents.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gulag.JapanEvents.services.FileStorageService;

@RestController
@RequestMapping(path = "${api-endpoint}")
public class ImageController {
    
    @Autowired
    FileStorageService service;

    public ImageController(FileStorageService service) {
        this.service = service;
    }

    @PostMapping(path = "/images")
    ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file){
        String fileName = service.storeFile(file);

        return ResponseEntity.status(201).body("Imagen Guardada " + fileName);
    }
}
