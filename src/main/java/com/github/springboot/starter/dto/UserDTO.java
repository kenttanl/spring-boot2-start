package com.github.springboot.starter.dto;

import com.github.springboot.starter.domain.User;

public class UserDTO {
	
	private String login;
	
	private String name;

	public UserDTO() {}
	
	public UserDTO(User user) {
		// TODO 使用BeanUtils转换
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
