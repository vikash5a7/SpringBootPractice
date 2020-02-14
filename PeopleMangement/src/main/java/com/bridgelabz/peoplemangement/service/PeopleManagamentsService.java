package com.bridgelabz.peoplemangement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.peoplemangement.dao.PoepleManagements;
import com.bridgelabz.peoplemangement.entities.Person;

@Service
public class PeopleManagamentsService {

	@Autowired
	private PoepleManagements poepleManagements;

	public Person createPerson(Person person) {
		poepleManagements.save(person);
		return person;

	}

}
