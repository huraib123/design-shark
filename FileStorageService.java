package com.rasool.desigh.shark.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rasool.design.shark.model.Fileentity;
import com.rasool.design.shark.repository.FileRepository;
import com.rasool.design.shark.repository.UserRepository;

import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import jakarta.persistence.criteria.Path;

@Service
public class FileStorageService {
	  private final Path uploadDir = (Path) Paths.get("uploads");
      private FileRepository filerepo;
	
	  public Fileentity storeFile(MultipartFile file) throws IOException {
	        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	        java.nio.file.Path targetPath = ((java.nio.file.Path) uploadDir).resolve(fileName);
	        Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);

	        Fileentity fileEntity = new Fileentity();
	        fileEntity.setFileName(fileName);
	        fileEntity.setFilePath(targetPath.toString());
	        fileEntity.setSize(file.getSize());
	        fileEntity.setContentType(file.getContentType());
	        return filerepo.save(fileEntity);
	
}
	  public Resource loadFile(Long id) throws IOException {
	        Fileentity file = filerepo.findById(id)
	                .orElseThrow(() -> new FileNotFoundException("File not found"));
	        Path path = (Path) Paths.get(file.getFilePath());
	        return new UrlResource(path.toUri());
	    }
}