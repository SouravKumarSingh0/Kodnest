package com.example.demo.controller;

import org.springframework.ui.Model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Laptop;
import com.example.demo.service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/laptops")
	public String getLaptops(Model model){
		model.addAttribute("laptops", service.getLaptops());
		return "viewlaptops";
	}
	
}
