package com.jackson.model;

public class Customer {
	private long id;
	private String firstname;
	private String lastname;
	
	public Customer(){
		
	}
	
	public Customer(long id, String firstname, String lastname){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		String info = String.format("Customer Info: id = %d, firstname = %s, lastname = %s", id, firstname, lastname);
		return info;
	}
}
