package com.Danushka.main.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Danushka.main.CRUD.propertyDAO;
import com.Danushka.main.CRUD.propertyRepository;
import com.Danushka.main.entity.property;

//@Controller
@RestController
@RequestMapping("/api")
public class propertyRestController {

	propertyRepository proJPA;
	property obj;
	
	@Autowired
	public propertyRestController(propertyRepository obj) {
		this.proJPA = obj;
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@PostMapping("/property")
	public void saveProertyJSON(@RequestBody property propertyOBJ) {
		this.obj = propertyOBJ;
		proJPA.save(obj);
	}
	
	@GetMapping("/property")
	public List<property> findProerty() {
	
		return proJPA.findAll();
	}

}
