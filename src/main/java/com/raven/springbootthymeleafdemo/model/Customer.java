package com.raven.springbootthymeleafdemo.model;

public class Customer {
	private int id;
	private String fullName;
	private String phone;
	private String email;
	private String address;

	public Customer() {
	}

	public Customer(int id, String fullName, 
			String phone, String email, 
			String address) {
		this.id = id;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullName=" + fullName + 
				", phone=" + phone + ", email=" + email + ", address="
				+ address + "]";
	}

}
