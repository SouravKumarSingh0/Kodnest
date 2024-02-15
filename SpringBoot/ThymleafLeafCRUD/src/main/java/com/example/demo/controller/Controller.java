package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Laptop;
import com.example.demo.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/laptops")
	public List<Laptop> getLaptops(){
		return service.getLaptops();
	}
	
}
