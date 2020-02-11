package com.bridgelabz.SpringCommonNotation.service.servimpli;

import org.springframework.stereotype.Component;

import com.bridgelabz.SpringCommonNotation.service.Teacher;

@Component
public class ScienceTeacher implements Teacher {
	
	@Override
	public void teach() {
		System.out.println("hi, I'm your Science teacher ");
		System.out.println("I'm Dhoni ");
	}

}
