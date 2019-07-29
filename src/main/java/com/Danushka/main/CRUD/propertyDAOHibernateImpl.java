package com.Danushka.main.CRUD;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Danushka.main.entity.property;

@Repository
public class propertyDAOHibernateImpl implements propertyDAO {

	private EntityManager entityManager;
	
	@Autowired
	public propertyDAOHibernateImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public String save() {
		
		// get the current hibernate session
		Session currentSession1 = entityManager.unwrap(Session.class);
				
		property newObject = new property();
		
		newObject.setAddress("hero rd");
		newObject.setCity("Colombo 10");
		newObject.setTimePeriod("15 months");
		newObject.setNoOfRooms(3);
		newObject.setType("House");
		newObject.setOtherFacilities("Has a bed");
		newObject.setKeyMoney(50000);
		newObject.setMonthlyPrice(5000);
		
		
		System.out.println("property object created!");
		System.out.println(newObject.getCity());
				
		currentSession1.save(newObject);
		//System.out.println("Property is created");
		
		
		return null;
	}

	@Override
	@Transactional
	public List<property> findAll() {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// create a query
		Query<property> theQuery = currentSession.createQuery("from property", property.class);
				
		// execute query and get result list
		List<property> students = theQuery.getResultList();
		
		return students;
		
	}

	@Override
	@Transactional
	public List<property> findById() {
		
		
		return null;
	}

	@Override
	@Transactional
	public String deleteById() {
		
		
		return null;
	}

	@Override
	public String test() {
		
		return "autowirdWorking and hello world";
	}

}
