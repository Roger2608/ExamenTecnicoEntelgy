package com.examen.entelgy.entities.consumer;

public class UserConsumer {
	
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	public UserConsumer() {
	}

	public UserConsumer(int id, String email, String first_name, String last_name, String avatar) {
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.avatar = avatar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getFirst_name()=" + getFirst_name()
				+ ", getLast_name()=" + getLast_name() + ", getAvatar()=" + getAvatar() + "]";
	}
	
}
