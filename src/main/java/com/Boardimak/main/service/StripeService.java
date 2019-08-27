package com.Boardimak.main.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.Boardimak.main.model.*;
import com.stripe.Stripe;
import com.stripe.model.Customer;


@Service
public class StripeService {
	
	@Autowired
	UserService userservice;
	

	@Value("${stripe.key.secret}")
	private String API_SECRET_KEY;
	
	public String createCustomer(String token, String email) {
		// get the Buyer object using the email
        Buyer buyer = userservice.getIdByEmail(email);
        
        // initialize the Stripe id as null
		String StripeId = null;
        
        try {
        	// get the stripe Secret key from application.properties
            Stripe.apiKey = API_SECRET_KEY;
            Map<String, Object> customerParams = new HashMap<>();
            //add customer unique id here to track them in your web application
            customerParams.put("description", "Customer for " + buyer.getEmail());
            customerParams.put("email", buyer.getEmail());

            customerParams.put("source", token); // ^ obtained with Stripe.js through the UI
            //create a new customer
            Customer customer = Customer.create(customerParams);
            // get the new customer's unique customer Stripe id 
            StripeId = customer.getId();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       // set the stripe id in the Buyer object 
       buyer.setStripeID(StripeId);
       // update the stripe id of the customer in the buyer table
       userservice.updateStripeID(buyer);
       
       return StripeId;
    }
	
	
}
