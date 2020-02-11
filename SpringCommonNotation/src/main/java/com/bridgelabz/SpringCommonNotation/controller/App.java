package com.bridgelabz.SpringCommonNotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgelabz.SpringCommonNotation.model.College;
import com.bridgelabz.SpringCommonNotation.repo.CollegeConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		System.out.println("bean loaded");
		College college = context.getBean("college", College.class);
		System.out.println(college);
		college.display();
		((AbstractApplicationContext) context).close();

	}
}
