package com.Danushka.main.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Danushka.main.CRUD.PropertyRepository;
import com.Danushka.main.entity.Property;

@RestController
@RequestMapping("/api")
public class propertyRestController {

	PropertyRepository proJPA;
	Property obj;
	
	@Autowired
	public propertyRestController(PropertyRepository obj) {
		this.proJPA = obj;
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@PostMapping("/Property")
	public void saveProertyJSON(@RequestBody Property propertyOBJ) {
		this.obj = propertyOBJ;
		proJPA.save(obj);
	}

	
	@GetMapping("/Property")
	public List<Property> findProerties() {
	
		return proJPA.findAll();
	}

	@GetMapping("/Property/{propertyId}")
	public Property findProerty(@PathVariable int propertyId) {
	
		Property searchedProp = null;
		Optional<Property> results = proJPA.findById(propertyId);
		
		if(results.isPresent()){
			searchedProp =  results.get();
		}
		
		return searchedProp;
	}


}
