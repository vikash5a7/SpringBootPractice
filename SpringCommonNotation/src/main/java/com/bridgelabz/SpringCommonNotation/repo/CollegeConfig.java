package com.bridgelabz.SpringCommonNotation.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bridgelabz.SpringCommonNotation.model.College;
import com.bridgelabz.SpringCommonNotation.model.Principal;
import com.bridgelabz.SpringCommonNotation.service.Teacher;

@ComponentScan(basePackages = "com.bridgelabz.SpringCommonNotation")
@Configuration
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

//	@Bean
//	public Teacher mathTeacher() {
//		return new MathcTeacher();
//	}
//
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//
//	}
//
//	@Bean(name = "colBeans")
//	public College collegeBeans() {
//		College college = new College(principalBean());
//		college.setTeacher(mathTeacher());
//		return college;
//
//	}

}
