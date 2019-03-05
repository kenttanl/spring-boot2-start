package com.github.springboot.starter.dto;

import org.springframework.beans.BeanUtils;

import com.github.springboot.starter.domain.User;

/**
 * A DTO representing a user
 */
public class UserDTO {
	
	private Long id;
	
	private String login;
	
	private String name;

	public UserDTO() {}
	
	public UserDTO(User user) {
		BeanUtils.copyProperties(user, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
