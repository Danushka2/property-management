package com.Danushka.main.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Danushka.main.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {

}
