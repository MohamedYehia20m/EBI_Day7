package com.EBI.controllers;

public class Employee {
	private int id;
	private String firstName;
	private int salary;
	private String lastName;
	
	public Employee ()
	{}
	
	public void setID (int id) {
		this.id = id;
	}
	
	public int getID () {
		return id;
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public void setSalary (int salary) {
		this.salary = salary;
	}
	
	public int getSalary () {
		return salary;
	}
	
	public void setLastName (String lastname) {
		this.lastName = lastname;
	}
	
	public String getLastName () {
		return lastName;
	}
}
