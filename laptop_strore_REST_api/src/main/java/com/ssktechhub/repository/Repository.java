package com.ssktechhub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssktechhub.entity.Laptop;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Laptop, Integer>{

	@Query("SELECT l from Laptop l where l.brand = :brand")
	List<Laptop> findByBrand(String brand);
	
}
