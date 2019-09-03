package com.Boardimak.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Boardimak.main.model.PropertyImages;

public interface PropertyImageRepo extends JpaRepository<PropertyImages, Integer> {

}