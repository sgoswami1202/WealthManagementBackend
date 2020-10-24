package com.springrest.wealthmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.wealthmanagement.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
}