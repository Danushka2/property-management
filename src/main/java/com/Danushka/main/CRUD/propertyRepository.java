package com.Danushka.main.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Danushka.main.entity.property;

public interface propertyRepository extends JpaRepository<property, Integer> {

}
