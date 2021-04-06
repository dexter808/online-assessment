package com.online.entities;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String organization;
	private String role;
	private String address;
	private int phoneNumber;
	public User() {
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public User(String firstName, String lastName, String email, String organization, String role, String address,
			int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.organization = organization;
		this.role = role;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
}
