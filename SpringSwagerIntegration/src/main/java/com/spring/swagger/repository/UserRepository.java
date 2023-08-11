package com.spring.swagger.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.swagger.model.User;


public interface UserRepository extends JpaRepository<User, Id>{

	User findByUserName(String userName);
}
