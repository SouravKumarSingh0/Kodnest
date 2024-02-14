package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class DataController {
	
	@PostMapping
	public String acceptDta(@RequestParam String data){
		return "Entered data = "+data;
	}
}
