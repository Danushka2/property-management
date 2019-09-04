package com.Boardimak.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Boardimak.main.model.testImages;
import com.Boardimak.main.repository.testImageRepo;

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
	
	
}
