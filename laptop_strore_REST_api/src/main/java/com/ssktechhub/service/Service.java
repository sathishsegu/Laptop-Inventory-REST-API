package com.ssktechhub.service;

import java.util.List;

import com.ssktechhub.entity.Laptop;

public interface Service {

	Laptop addLaptop(Laptop laptop);

	List<Laptop> laptopList();

	Laptop getById(Integer id);

	List<Laptop> getbybrand(String brand);

	Laptop updateLaptop(Integer id, Laptop laptop);

	String deleteLaptop(Integer id);

}
