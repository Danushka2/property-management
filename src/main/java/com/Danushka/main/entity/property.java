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
	
	@Column(name="other_facilities")
	private String otherFacilities;

	@Column(name="owner_id")
	private int ownerId;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="student_id")
	private int studentId;
	
	@Column(name="type")
	private String type;
	

	public property() {
		this.id = 1;
		this.address = "";
		this.city = "";
		this.timePeriod = "";
		this.noOfRooms = 0;
		this.airCondition = "false";
		this.parking = "false";
		this.keyMoney = 0;
		this.monthlyPrice = 0;
		this.discription = "";
		this.otherFacilities = "";
		this.ownerId = 0;
		this.parentId = 0;
		this.studentId = 0;
		this.type = "";
	}
	
	public property(int id, String address, String city, String timePeriod, int noOfRooms, String airCondition,
			String parking, int keyMoney, int monthlyPrice, String discription , String OtherFacilities, int ownerId, int parentId,
			int studentId, String Type) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.timePeriod = timePeriod;
		this.noOfRooms = noOfRooms;
		this.airCondition = airCondition;
		this.parking = parking;
		this.keyMoney = keyMoney;
		this.monthlyPrice = monthlyPrice;
		this.discription = discription;
		this.otherFacilities = OtherFacilities;
		this.ownerId = ownerId;
		this.parentId = parentId;
		this.studentId = studentId;
		this.type = Type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getAirCondition() {
		return airCondition;
	}

	public void setAirCondition(String airCondition) {
		this.airCondition = airCondition;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public int getKeyMoney() {
		return keyMoney;
	}

	public void setKeyMoney(int keyMoney) {
		this.keyMoney = keyMoney;
	}

	public int getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(int monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public String getOtherFacilities() {
		return otherFacilities;
	}

	public void setOtherFacilities(String OtherFacilities) {
		this.otherFacilities = OtherFacilities;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String Type) {
		this.type = Type;
	}
	
}
