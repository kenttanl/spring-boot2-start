package com.github.springboot.starter.service.mapper;

import org.springframework.stereotype.Service;

import com.github.springboot.starter.domain.User;
import com.github.springboot.starter.dto.UserDTO;


@Service
public class UserMapper {
	
	public UserDTO userToUserDTO(User user) {
        return new UserDTO(user);
    }
	
}
