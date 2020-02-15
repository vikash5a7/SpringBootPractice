package com.bridgelabz.blogapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bridgelabz.blogapp.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	public UserDto createUser(UserDto userDto);

}
