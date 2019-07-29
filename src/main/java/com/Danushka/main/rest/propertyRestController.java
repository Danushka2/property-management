package com.Danushka.main.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Danushka.main.CRUD.propertyDAO;

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
		return "entry saved";
	}

}
