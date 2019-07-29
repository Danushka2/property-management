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
	
	@Column(name="city")
	private String city;

	@Column(name="time_period")
	private String timePeriod;

	@Column(name="rooms")
	private int noOfRooms;

	@Column(name="air_condition")
	private String airCondition;

	@Column(name="parking")
	private String parking;

	@Column(name="key_money")
	private int keyMoney;

	@Column(name="monthly_price")
	private int monthlyPrice;

	@Column(name="discription")
	private String discription;

	@Column(name="owner_id")
	private int ownerId;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="student_id")
	private int studentId;

}
