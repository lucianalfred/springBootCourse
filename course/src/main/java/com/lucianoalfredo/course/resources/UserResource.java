package com.lucianoalfredo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucianoalfredo.course.entities.User;
import com.lucianoalfredo.course.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> finaAll(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}

}
