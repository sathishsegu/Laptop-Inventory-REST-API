package com.ssktechhub.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssktechhub.entity.Laptop;
import com.ssktechhub.repository.Repository;
import com.ssktechhub.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	Repository repo;

	@Override
	public Laptop addLaptop(Laptop laptop) {
		return repo.save(laptop);
	}

	@Override
	public List<Laptop> laptopList() {
		return repo.findAll();
	}

	@Override
	public Laptop getById(Integer id) {
		Optional<Laptop> laptop = repo.findById(id);
		return laptop.orElse(null);
	}

	@Override
	public List<Laptop> getbybrand(String brand) {
		List<Laptop> laptop = repo.findByBrand(brand);
		return laptop;
	}

	@Override
	public Laptop updateLaptop(Integer id, Laptop updatinglaptop) {
		Optional<Laptop> byId = repo.findById(id);
		if(byId.isPresent()) {
			Laptop eL = byId.get();
			eL.setBrand(updatinglaptop.getBrand());
			eL.setModel(updatinglaptop.getModel());
			eL.setProcessor(updatinglaptop.getProcessor());
			eL.setStorage(updatinglaptop.getStorage());
			eL.setPrice(updatinglaptop.getPrice());
			repo.save(eL);
			return eL;
		}
		return null;
	}

	@Override
	public String deleteLaptop(Integer id) {
		Optional<Laptop> laptop = repo.findById(id);
		if(laptop.isPresent()) {
			repo.deleteById(id);
			return "Deletion Successful";
		}else {
			return "Id is not Found in the DB";
		}
	}

}
