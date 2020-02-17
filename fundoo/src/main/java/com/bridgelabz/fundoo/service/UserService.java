package com.bridgelabz.fundoo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bridgelabz.fundoo.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto userDto);
	UserDto getUser(String Email);
	UserDto getUserById(String id);

}
