package com.Boardimak.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Boardimak.main.model.testImages;
import com.Boardimak.main.service.testImageServices;

@Controller
public class ImageController {

	@Autowired
	testImageServices imageService;
	
	@RequestMapping("/image")
	public String testImageUpload(){
		return "test-image";
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<testImages> getAll(){
		return imageService.getAll();
	}
	
}
