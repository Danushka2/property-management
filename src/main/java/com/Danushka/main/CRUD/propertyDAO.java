package com.Danushka.main.CRUD;

import java.util.List;
import com.Danushka.main.entity.property;

public interface propertyDAO {
	
	public String save();
	public List<property> findAll();
	public List<property> findById();
	public String deleteById();

}
