package com.bridgelabz.blogapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bridgelabz.blogapp.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto userDto);
	UserDto getUser(String Email);
	UserDto getUserById(String id);

}
