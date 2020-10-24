package com.springrest.wealthmanagement.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.wealthmanagement.dao.UserDao;
import com.springrest.wealthmanagement.entities.User;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private UserDao userDao;
	
	
   public BankServiceImpl() {
    	
	}
	
	
	@Override
	public List<User> getUsers() 
	{
		return userDao.findAll();
	}

	@Override
	public User getUser(long id) {
		return userDao.getOne(id);
			}

	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User deleteUser(long parseLong) {	
		User entity = userDao.getOne(parseLong);
		userDao.delete(entity);
		return entity;
	}
	
}
