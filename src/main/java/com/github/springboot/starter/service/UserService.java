package com.github.springboot.starter.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.springboot.starter.domain.User;

@Service
public class UserService {
	
	public Optional<User> getUserByLogin() {
		return Optional.empty();
	}
	
}
