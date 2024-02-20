package com.kodnest.tunehub.service;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.kodnest.tunehub.entity.User;

public interface UserService {
	public String addUser(User user);
}
