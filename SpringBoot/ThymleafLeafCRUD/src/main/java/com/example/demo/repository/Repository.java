package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Laptop;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Laptop, Integer> {
	
}
