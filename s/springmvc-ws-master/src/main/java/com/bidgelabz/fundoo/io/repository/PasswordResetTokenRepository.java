package com.bidgelabz.fundoo.io.repository;

import org.springframework.data.repository.CrudRepository;

import com.bidgelabz.fundoo.io.entity.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
	PasswordResetTokenEntity findByToken(String token);
}
