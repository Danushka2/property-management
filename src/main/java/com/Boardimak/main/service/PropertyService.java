package com.Boardimak.main.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.Boardimak.main.model.Property;
import com.Boardimak.main.repository.PropertyRepository;

@Service
public class PropertyService {

	PropertyRepository propertyRepo;
	Property property;
	
	@Autowired
	public PropertyService(PropertyRepository pRepo) {
		this.propertyRepo = pRepo;
	}

	public List<Property> showAll() {
		List<Property> properties = new ArrayList<>();
			for(Property propertyObject : propertyRepo.findAll()) {
				properties.add(propertyObject);
			}
		return properties;
	}

	public void saveProperty(Property newProperty) {
		propertyRepo.save(newProperty);
	}
	
	public void deleteProperty(int id) {
		propertyRepo.deleteById(id);	
	}

	
}
