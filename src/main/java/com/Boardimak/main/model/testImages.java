package com.Boardimak.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="test_images")
public class testImages {
	
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
	
	@Column(name="property_id")
	private int propertyId;
	
	@Column(name="image_name")
	private String imageName;
	
	private String fileName;

    private String fileType;

    @Lob
    private byte[] data;

	public testImages() {
		this.id = "";
		this.propertyId = 0;
		this.imageName = "";
		this.fileType = "";
		this.data = null;
	}
	
	public testImages(int propertyId, String imageName, String fileName, String fileType, byte[] data) {
		super();
		this.id = id;
		this.propertyId = propertyId;
		this.imageName = imageName;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
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
