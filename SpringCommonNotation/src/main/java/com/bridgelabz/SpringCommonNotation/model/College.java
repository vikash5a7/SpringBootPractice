package com.bridgelabz.SpringCommonNotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bridgelabz.SpringCommonNotation.service.Teacher;

//import org.springframework.stereotype.Component;

//@Component("CollegeBean")  creating object and store in IOC container

@Component
public class College {
	@Value("${college.name}")
	private String name;
	private Principal principal;

	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	@Autowired
	@Qualifier("scienceTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public College(Principal principal) {
		super();
		this.principal = principal;
	}

	public Principal getPrincipal() {
		return principal;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [name=" + name + "]";
	}

	public void display() {
		System.out.println("Testing Method of the college class");
		System.out.println("College name is " + name);
		principal.principalInfo();
		teacher.teach();

	}
}
