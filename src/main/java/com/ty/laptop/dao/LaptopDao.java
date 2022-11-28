package com.ty.laptop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.laptop.dto.Laptop;
import com.ty.laptop.rep.LaptopRepository;

@Repository
public class LaptopDao {
	
	@Autowired
	LaptopRepository repository;
	
	
	public Laptop saveLaptop(Laptop laptop) {
		return repository.save(laptop);
		
	}
	
	public Laptop getLaptopDao(int id) {
		return repository.findById(id).get();
	}
	
	public String deleteLaptopDao(int id) {
		repository.deleteById(id);
		return "deleted";
	}

}
