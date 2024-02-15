package com.example.demo.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.Repository;
import com.example.demo.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	Repository repository;
	
	@Override
	public List<Laptop> getLaptops(){
		return repository.findAll();
	}
}
