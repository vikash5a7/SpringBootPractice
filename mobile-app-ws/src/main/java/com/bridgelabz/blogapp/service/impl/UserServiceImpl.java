package com.bridgelabz.blogapp.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bridgelabz.blogapp.UserRepository;
import com.bridgelabz.blogapp.entity.UserEntity;
import com.bridgelabz.blogapp.service.UserService;
import com.bridgelabz.blogapp.shared.Util;
import com.bridgelabz.blogapp.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	Util util;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto user) {

		UserEntity storedDetails = userRepository.findByEmail(user.getEmail());
		if (storedDetails != null)
			throw new RuntimeException("Record already exit");

		UserEntity userEntity = new UserEntity();

		BeanUtils.copyProperties(user, userEntity);

		String userPublicKey = util.generateUserId(20);
		// EncryptedPassword for user
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		
		userEntity.setUserId(userPublicKey);
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
