package com.ty.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.laptop.dao.LaptopDao;
import com.ty.laptop.dto.Laptop;

@RestController
public class LaptopController {
	
	@Autowired
	LaptopDao dao;
	
	
	@PostMapping("/save")
	public Laptop saveLaptop(@RequestBody Laptop laptop) {
		return dao.saveLaptop(laptop);
		
	}
	
	@GetMapping("get")
	public Laptop getLaptopController(@RequestParam  int id) {
		return dao.getLaptopDao(id);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteLaptopController(@PathVariable int id) {
		return dao.deleteLaptopDao(id);
	}

}
