package com.Boardimak.main.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;
import java.util.Optional;
import java.io.IOException;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Boardimak.main.model.testImages;
import com.Boardimak.main.service.testImageServices;

@Controller
public class ImageController {

	@Autowired
	testImageServices imageService;
	testImages tImages;
	
	@RequestMapping("/image")
	public String testImageUpload(){
		return "test-image";
	}
	
	@RequestMapping("/testing")
	public String testImageDisplay(){
		return "test-showing-image";
	}
	
	
	@RequestMapping(value = "/show/{id}")
	public void getStudentPhoto(HttpServletResponse response, @PathVariable("id") int id) throws Exception {
		response.setContentType("image/jpeg");

		List<testImages> list = imageService.getAll();
		
		for(testImages testIm : list) {
			if(testIm.getId()==id) {
			byte[] ph = testIm.getData();
			InputStream inputStream = new ByteArrayInputStream(ph);
			IOUtils.copy(inputStream, response.getOutputStream());
			}
		}
		
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<testImages> getAll(){
		return imageService.getAll();
	}
	
}
