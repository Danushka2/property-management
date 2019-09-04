package com.Boardimak.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Boardimak.main.model.testImages;

@Repository
public interface testImageRepo extends JpaRepository<testImages, String>{

}
