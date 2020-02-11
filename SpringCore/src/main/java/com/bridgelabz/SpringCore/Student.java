package com.bridgelabz.SpringCore;

public class Student {
	private String name;
	private String email;
	private String cls;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", cls=" + cls + "]";
	}

}
