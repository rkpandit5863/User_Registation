package com.pandit.service;

import java.util.List;

import org.apache.catalina.User;

public interface UserService {

	
	String upsert (User user);
	
	List<User> getAllUsers();
	
	User getUsers (int uid);
	
	String deleteUser (int uid);
}
