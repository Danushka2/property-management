package com.Danushka.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class propertyRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World from udemy!";
	}

}
