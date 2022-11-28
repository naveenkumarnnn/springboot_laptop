package com.ty.laptop.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.laptop.dto.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
