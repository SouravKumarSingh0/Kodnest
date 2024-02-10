package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enity.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {
	StudentServiceImpl studentServiceImpl;
	
	public StudentController(StudentServiceImpl studentServiceImpl) {
		super();
		this.studentServiceImpl = studentServiceImpl;
	}

	@GetMapping(value= "/get")
	public List<Student> getStudent() {
		//redirecting to getStudent()
		return studentServiceImpl.getStudent();
	}
}
