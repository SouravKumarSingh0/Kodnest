package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//get Students by 'id'
	@GetMapping(value= "/get/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentServiceImpl.getStudentById(id);
	}
	
	//get student by name
	@GetMapping(value= "/getbyname/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentServiceImpl.getStudentByName(name);
	}
	
	
	//insert a student into database
	@PostMapping(value= "/post")
	public Student postStudent(@RequestBody Student student) {
		return studentServiceImpl.postStudent(student);
	}
}
