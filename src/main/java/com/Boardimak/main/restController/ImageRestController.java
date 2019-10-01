package com.Boardimak.main.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Boardimak.main.model.testImages;
import com.Boardimak.main.service.testImageServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class ImageRestController {
	
	@Autowired
	testImageServices imageService;
    private static final Logger logger = LoggerFactory.getLogger(ImageRestController.class);
	
	@GetMapping("/test")
	public List<testImages> getAll(){
		return imageService.getAll();
	}

    @PostMapping("/uploadFile")
    public void uploadFile(@RequestParam("imagefile") MultipartFile file) throws Exception {
    	imageService.storeFile(file);
		
		
        /*String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(tImageObject.getId())
                .toUriString(); */
    }
/*
    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

	
    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable int fileId) {
        // Load file from database
    	Optional<testImages> tImageObject = imageService.getFile(fileId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(tImageObject.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + tImageObject.getFileName() + "\"")
                .body(new ByteArrayResource(tImageObject.getData()));
    }

	*/


}
