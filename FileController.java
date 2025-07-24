package com.rasool.design.shark.controller;

import java.io.IOException;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rasool.desigh.shark.service.FileStorageService;
import com.rasool.design.shark.model.Fileentity;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/files")
public class FileController {

	@Autowired
	 private FileStorageService fileStorageService;
	@PostMapping("/upload")
    public ResponseEntity<Fileentity> upload(@RequestParam("file") MultipartFile file) throws IOException {
        Fileentity savedFile = fileStorageService.storeFile(file);
        return ResponseEntity.ok(savedFile);
    }
	@GetMapping("/download/{id}")
    public ResponseEntity<Resource> download(@PathVariable Long id) throws IOException {
        Resource file = fileStorageService.loadFile(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ((Resource) file).getFilename() + "\"")
                .body(file);
    }
	
}
