package com.Boardimak.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Boardimak.main.entity.Property;


public interface PropertyRepository extends JpaRepository<Property, Integer> {

}
