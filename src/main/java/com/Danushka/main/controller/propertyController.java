package com.Danushka.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class propertyController {

	@GetMapping("/")
	public String hello() {
		return "index";
	}
}
