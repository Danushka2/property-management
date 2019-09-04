package com.Boardimak.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_images")
public class testImages {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="image_id")
	private int id;
	
	@Column(name="property_id")
	private int propertyId;
	
	@Column(name="image_name")
	private String imageName;

	public testImages() {
		this.id = 0;
		this.propertyId = 0;
		this.imageName = "";
	}
	
	public testImages(int id, int propertyId, String imageName) {
		super();
		this.id = id;
		this.propertyId = propertyId;
		this.imageName = imageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
	
}
