package com.spring.swagger.service;


import java.util.List;

import com.spring.swagger.model.User;


public interface UserService {

	public List<User> fetchUsers();
	
	public User fetchUserByUserName(String userName);
	
	public void createUser(User user);
	
}
