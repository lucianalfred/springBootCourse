package com.lucianoalfredo.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lucianoalfredo.course.repositories.UserRepository;

import com.lucianoalfredo.course.entities.User;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
 	
}
