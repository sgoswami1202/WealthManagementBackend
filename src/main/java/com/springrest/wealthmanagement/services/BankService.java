package com.springrest.wealthmanagement.services;

import java.util.List;

import com.springrest.wealthmanagement.entities.User;

public interface BankService {
	
	public List<User> getUsers();
	
	public User getUser(long id);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User deleteUser(long id);
	

}
