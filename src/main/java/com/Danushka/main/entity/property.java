package com.Danushka.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class property {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="property_id")
	private int id;

	@Column(name="address")
	private String address;
	
}
