package com.bridgelabz.peoplemangement.dao;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.peoplemangement.entities.Person;

public interface PoepleManagements extends CrudRepository<Person, Integer> {
	

}
