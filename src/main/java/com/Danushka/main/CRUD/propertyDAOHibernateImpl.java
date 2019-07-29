package com.Danushka.main.CRUD;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Danushka.main.entity.property;

@Repository
public class propertyDAOHibernateImpl implements propertyDAO {

	@Override
	@Transactional
	public String save() {
		
		
		return null;
	}

	@Override
	@Transactional
	public List<property> findAll() {
		
		
		return null;
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
