package com.Boardimak.main.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Boardimak.main.repository.*;
import com.Boardimak.main.model.*;


@Service
public class UserService {

	@Autowired
	private Dao jpaRepo;
	
	private ArrayList<Buyer> users = new ArrayList<>();
	
	
	public ArrayList<Buyer> getAllUsers(){
		jpaRepo.findAll().forEach(users::add);
		return users;
	}
	
	public Buyer getUser(int id){
		return jpaRepo.findById(id).get();
	}
	
	public void updateStripeID( Buyer buyer ) {
		jpaRepo.save(buyer);
	}

	public Buyer getIdByEmail(String email) {

		Buyer id = jpaRepo.findAllByEmail(email);
		return id;
	}
	
	
}
