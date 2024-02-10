package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController()
class CrudController {
	
	@GetMapping(value = "/value")
	public String getvalue() {
		return "value - 1";
	}
	

}
