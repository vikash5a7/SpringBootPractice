package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RestController;

//@RestController
public class SimpleEmailController {
	
	

	public static void main(String[] args) {
		System.out.println("email : " + System.getenv("email"));
	}
}
