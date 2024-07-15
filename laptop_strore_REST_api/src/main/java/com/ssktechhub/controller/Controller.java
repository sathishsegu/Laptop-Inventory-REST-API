package com.ssktechhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssktechhub.entity.Laptop;
import com.ssktechhub.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@PostMapping("/insert")
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return service.addLaptop(laptop);
	}
	
	@GetMapping("/list")
	public List<Laptop> laptopList(){
		return service.laptopList();
	}
	
	@GetMapping("/byid/{id}")
	public Laptop getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@GetMapping("/bybrand/{brand}")
	public List<Laptop> laptopListbybrand(@PathVariable String brand){
		return service.getbybrand(brand);
	}
	
	@PutMapping("/update/{id}")
	public Laptop updateLaptop(@PathVariable Integer id, @RequestBody Laptop laptop) {
		return service.updateLaptop(id, laptop);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLaptop(@PathVariable Integer id) {
		return service.deleteLaptop(id);
	}
	
}
