package com.spring.swagger.controller;

import java.util.List;

import javax.persistence.TableGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.swagger.model.User;
import com.spring.swagger.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userDS;
	
	@GetMapping("/")
	public @ResponseBody List<User> getUsers(){
		return  userDS.fetchUsers();
	}
	
	@GetMapping("/{userName}")
	public @ResponseBody User getUserByUserName(@RequestParam String userName) {
		return userDS.fetchUserByUserName(userName);
	}
	
	@PostMapping("/")
	public void createUser(@RequestBody User user) {
		System.out.println(" save user::>>>>"+ user);
		userDS.createUser(user);
	}
}


