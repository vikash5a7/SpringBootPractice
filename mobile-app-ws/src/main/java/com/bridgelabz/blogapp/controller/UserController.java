package com.bridgelabz.blogapp.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.blogapp.model.request.UserDetailsRequestModel;
import com.bridgelabz.blogapp.model.response.UserRest;
import com.bridgelabz.blogapp.service.UserService;
import com.bridgelabz.blogapp.shared.dto.UserDto;

@RestController
@RequestMapping("users") //
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/{id}")
	public UserRest getUser(@PathVariable String id) {
		UserRest returnValue = new UserRest();
		UserDto userDto = userService.getUserById(id);
		BeanUtils.copyProperties(userDto, returnValue);
		return returnValue;
	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

		UserRest returnValue = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createUser, returnValue);
		return returnValue;
	}

	@PutMapping
	public String udpateUser() {
		return "update user";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}

}
