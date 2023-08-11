package com.spring.swagger.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.swagger.model.User;
import com.spring.swagger.repository.UserRepository;


@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> fetchUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public User fetchUserByUserName(String userName) {
		return userRepository.findByUserName(userName);

	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		 userRepository.save(user);
		
	}
	

}
