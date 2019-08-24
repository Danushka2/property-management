package com.Danushka.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class propertyController {

	@GetMapping("/")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/pro")
	public String testingProperty() {
		return "owner-properties";
	}
	
	@GetMapping("/full")
	public String allProperties() {
		return "owner-properties-full";
	}
	
	@GetMapping("/all")
	public String allPropertiesListView() {
		return "all-properties";
	}
	
}
