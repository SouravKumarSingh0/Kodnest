package com.kodnest.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.tunehub.entity.User;
import com.kodnest.tunehub.serviceImpl.UserServiceImpl;

@Controller
public class UsersController {
	
	@Autowired
	UserServiceImpl serviceImpl;
	@PostMapping("/register")
	public String addUser(@ModelAttribute User user )
	{
		/*System.out.println(user.getUsername()+" "+user.getEmail()+
				" "+user.getPassword()+" "
				+user.getGender()+" "+user.getRole()+
				" "+user.getAddress());
				*/
		serviceImpl.addUser(user);
		
		return "home";
	}

}
