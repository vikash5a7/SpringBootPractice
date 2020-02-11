package com.bridgelabz.SpringCommonNotation.service.servimpli;

import org.springframework.stereotype.Component;

import com.bridgelabz.SpringCommonNotation.service.Teacher;

@Component
public class BioTeacher implements Teacher {
	
	@Override
	public void teach() {
		System.out.println("hi, I'm your Bio teacher ");
		System.out.println("I'm Ravi");
	}

}
