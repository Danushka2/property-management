package com.Boardimak.main.repository;


import org.springframework.data.repository.CrudRepository;

import com.Boardimak.main.model.*;


public interface Dao extends CrudRepository<Buyer, Integer>{

	// custome method to get buyer using the email
	Buyer findAllByEmail(String email);
}
