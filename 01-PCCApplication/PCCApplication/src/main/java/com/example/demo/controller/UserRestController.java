package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	//inject user service 
	private UserService userService ; 
	
	@Autowired 
	public UserRestController(UserService theuserService) {
		userService = theuserService ;
	}
	
	//expose "/users" and return list of employees
	@GetMapping("/users")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	//add mapping for get user id 
	@GetMapping("/users/id/{id}")
	public User getUser(@PathVariable int id) {
		User theUser = userService.findByID(id);
		if (theUser == null) {
			throw new RuntimeException("User id not found ! ");
		}
		return theUser ;
	}
	
	
	
	//add mapping for post 
	@PostMapping("/users")
	public User addUser(@RequestBody User theUser) {
		theUser.setId(0);
		userService.save(theUser);
		return theUser ;
	}
	
	//add mapping for put user = update existing user 
	@PutMapping("/users")
		public User updateUser(@RequestBody User theUser) {
		userService.save(theUser);
		return theUser ;
	}
	
	//deleting user by id 
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		User theUser = userService.findByID(id);
		if (theUser == null) {
			throw new RuntimeException("user not found ");
		}
		userService.deleteByID(id);
		return "deleted user" ;
		
	}

}
