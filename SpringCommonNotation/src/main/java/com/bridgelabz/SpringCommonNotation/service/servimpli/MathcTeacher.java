package com.bridgelabz.SpringCommonNotation.service.servimpli;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bridgelabz.SpringCommonNotation.service.Teacher;

@Component
@Primary
public class MathcTeacher implements Teacher {
	
	@Override
	public void teach() {
		System.out.println("hi, I'm your math teacher ");
		System.out.println("I'm saurbh");
	}

}
