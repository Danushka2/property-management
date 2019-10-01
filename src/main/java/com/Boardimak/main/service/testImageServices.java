package com.Boardimak.main.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Boardimak.main.model.testImages;
import com.Boardimak.main.repository.testImageRepo;
import org.springframework.util.StringUtils;

@Service
public class testImageServices {

	testImageRepo imageRepo;
	testImages tImageObject;
	
	@Autowired
	public testImageServices(testImageRepo imageRepo, testImages tImageObject) {
		super();
		this.imageRepo = imageRepo;
		this.tImageObject = tImageObject;
	}

	public void saveObject(testImages imageO) {
		imageRepo.save(imageO);
	}
	
	public List<testImages> getAll(){
		return imageRepo.findAll();
	}
	
	
    public testImages storeFile(MultipartFile file) throws Exception {
        // Normalize file name
    	//String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    	String fileName = file.getOriginalFilename();
    	System.out.println(fileName);
        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
            }
            testImages dbFile = new testImages(0,fileName,fileName, file.getContentType(), file.getBytes());
            return imageRepo.save(dbFile);
        } catch (IOException ex) {
            throw new Exception("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public Optional<testImages> getFile(String fileId) {
        return imageRepo.findById(fileId);
    }
    
}

	
