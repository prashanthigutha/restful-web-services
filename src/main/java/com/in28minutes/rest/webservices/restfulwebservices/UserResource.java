package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService userservice;

	@GetMapping("/users")
	public List<User> retrieveAllUsers()
	{
		return userservice.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public User findOne(@PathVariable int id){
		return userservice.findOne(id);
	}
}
