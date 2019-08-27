package com.Boardimak.main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Boardimak.main.model.*;
import com.Boardimak.main.service.StripeService;
import com.Boardimak.main.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private StripeService stripeService;
	
	@Value("${stripe.key.secret}")
	private String API_SECRET_KEY;
	
	@GetMapping("/index")
	public String index() {
		return "pay-property";
	}
	
	@GetMapping("/users")
	public ArrayList<Buyer> getAllUsers(){
		return userservice.getAllUsers();
		
	}
	
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable int id){
		Buyer b;
		b =  userservice.getUser(id);
		int ID = b.getId();
		String lastname = b.getStripeID();
		return lastname;
	}
	
	@PostMapping("/createCust")
    public @ResponseBody
    String createCust(String token, String email) {
        //validate data
        if (token == null) {
        	return "Please check the card";
        }
        String customerId = stripeService.createCustomer(token, email);
        System.out.println(customerId);
        return(customerId);
	}
}
