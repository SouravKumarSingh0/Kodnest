package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.enity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public  class StudentServiceImpl implements StudentService{
	
	StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	//writing getStudent()
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}


	public Student getStudentById(Integer id) {
		 Optional<Student> student = studentRepository.findById(id);
		 return student.orElse(null);
	}	 
	public Student getStudentByName(String name) {
		Optional<Student> student =  studentRepository.findByName(name);
		return student.orElse(null);
	}


	public Student postStudent(Student student) {
		Student s = studentRepository.save(student);
		return s;
	}




	
}
