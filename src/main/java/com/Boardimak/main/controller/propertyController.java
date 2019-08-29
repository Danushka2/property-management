package com.Boardimak.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Boardimak.main.model.Property;
import com.Boardimak.main.service.PropertyService;

@Controller
public class propertyController {
	
	@Autowired
	PropertyService pService;

	@GetMapping("/")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/one")
	public String singleProperty() {
		return "property";
	}
	
	@GetMapping("/owner")
	public String testingProperty() {
		return "owner-properties";
	}
	
	@GetMapping("/owner/all")
	public String allProperties() {
		return "owner-properties-full";
	}
	
	@GetMapping("/home")
	public String allPropertiesView() {
		return "home-page";
	}
	
	@GetMapping("/owner/property")
	public String showProperties(HttpServletRequest request) {
		request.setAttribute("properties",pService.showAll());
		return "all-properties";
	}
	
	@PostMapping("/owner/property")
	public String saveObject(@ModelAttribute Property newProperty,BindingResult bindingResult,HttpServletRequest request) {
		pService.saveProperty(newProperty);
		return "redirect:/owner/property";
	}
	
	@RequestMapping("/owner/delete-property")
	public String deleteProperty(@RequestParam int id,HttpServletRequest request) {
		pService.deleteProperty(id);
		return "redirect:/owner/property";
	}

	@GetMapping("/owner/my-properties")
	public String showPropImages(HttpServletRequest request) {
		request.setAttribute("properties",pService.showAll());
		return "owner-properties-full";
	}
	
	@GetMapping("/owner/proposal")
	public String showProposals(HttpServletRequest request) {
		//request.setAttribute("properties",pService.showAll());
		return "proposal-review";
	}
	
}
