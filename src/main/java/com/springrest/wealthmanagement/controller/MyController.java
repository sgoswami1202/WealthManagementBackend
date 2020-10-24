package com.springrest.wealthmanagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.wealthmanagement.entities.User;
import com.springrest.wealthmanagement.services.BankService;

@RestController
@CrossOrigin
public class MyController {
	
	//Inject the project service into our controller
	
	@Autowired
	//Inject bank service on to our controller 
	private BankService bankService;
	
	
	//Get the all user's details
	@GetMapping("/users")
	public List<User> getUsers()
	{
	return this.bankService.getUsers();
		
	}

	
	//Get user details as per the entered id
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id)
	{
		return this.bankService.getUser(Long.parseLong(id));
	}
	
	// Add new user
	@PostMapping(path="/users",consumes="application/json")
	public User addUser(@RequestBody User user)
	{
		return this.bankService.addUser(user);
		
	}
	
	//Update the entered user
	@PutMapping("/users")
	public User updateCource(@RequestBody User user)
	{
		return this.bankService.updateUser(user);
	}

	
	//Delete the user
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id) {
		try {
		this.bankService.deleteUser(Long.parseLong(id));
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
}
