package com.examen.entelgy.entities.produces;

public class UserProduces {
	
	private int id;
	private String lastName;
	private String email;
	
	public UserProduces() {
	}
	
	public UserProduces(int id, String lastName, String email) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserProduces [getId()=" + getId() + ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail()
				+ "]";
	}
	
}
