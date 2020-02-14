package com.bridgelabz.peoplemangement.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "person_table")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer Id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name", length = 60, nullable = false)
	private String lastName;

	@Column(name = "creation_date", length = 60, nullable = false)
	private Date creationdate;

	@Column(name = "email")
	@Email
	private String email;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", creationdate="
				+ creationdate + ", email=" + email + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public Person(String firstName, String lastName, Date creationdate, @Email String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationdate = creationdate;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
