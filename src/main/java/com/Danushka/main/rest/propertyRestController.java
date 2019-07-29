package com.Danushka.main.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Danushka.main.CRUD.propertyDAO;
import com.Danushka.main.entity.property;

@RestController
@RequestMapping("/api")
public class propertyRestController {

	propertyDAO propertyDAOObject;
	
	@Autowired
	public propertyRestController(propertyDAO propertyDAOObj) {
		super();
		this.propertyDAOObject = propertyDAOObj;
	}


	@GetMapping("/hello")
	public String hello() {
		return propertyDAOObject.test();
	}

	@GetMapping("/save")
	public String saveProerty() {
		
		propertyDAOObject.save();
		return "entry saved";
	}
	
	@GetMapping("/find")
	public List<property> findProerty() {
		
		return propertyDAOObject.findAll();
	}

}
