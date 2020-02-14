package com.bridgelabz.peoplemangement;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bridgelabz.peoplemangement.entities.Person;
import com.bridgelabz.peoplemangement.service.PeopleManagamentsService;

@SpringBootApplication
public class PeopleMangementApplication implements CommandLineRunner{
	@Autowired
	private PeopleManagamentsService peopleManagamentsService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleMangementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createPerson();
		
	}

	private void createPerson() {
		Person person1=new Person("radha", "kumari", new Date(), "radh@gmail.com");
		Person personDb = peopleManagamentsService.createPerson(person1);
		System.out.println(personDb);
	}

}
