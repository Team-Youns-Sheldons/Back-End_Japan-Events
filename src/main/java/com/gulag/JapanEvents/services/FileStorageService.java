package com.gulag.JapanEvents.services;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.micrometer.common.util.StringUtils;

@Service
public class FileStorageService {
    
    private final String uploadDir = "src/main/resources/images/";

    public String storeFile(MultipartFile file){
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path path = Paths.get(uploadDir, fileName);
    }
}
