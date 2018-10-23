package com.github.springboot.starter.web.rest;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.springboot.starter.domain.User;
import com.github.springboot.starter.dto.UserDTO;
import com.github.springboot.starter.service.UserService;
import com.github.springboot.starter.web.rest.util.ResponseUtil;


@RestController
@RequestMapping("/api")
public class UserResource {
	
	private final Logger log = LoggerFactory.getLogger(UserResource.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{login}")
	public ResponseEntity<UserDTO> getUser(@PathVariable String login) {
		log.debug("REST request to get User by login: {}", login);
		return ResponseUtil.wrapOrNotFound(
				userService.getUserByLogin().map(UserDTO::new));
	}
	
	@PostMapping("/users")
	public ResponseEntity<?> createUser() {
		return null;
	}
	
	@PutMapping("/users")
	public ResponseEntity<?> updateUser() {
		return null;
	}
	
	@DeleteMapping("/users")
	public ResponseEntity<?> deleteUser() {
		return null;
	}
	
}
