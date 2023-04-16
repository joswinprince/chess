package com.javalambdas;

public class Employee {
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
	public int getYearOfService() {
		return yearOfService;
	}
	public void setYearOfService(int yearOfService) {
		this.yearOfService = yearOfService;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public int getNumberOfDirectReports() {
		return numberOfDirectReports;
	}
	public void setNumberOfDirectReports(int numberOfDirectReports) {
		this.numberOfDirectReports = numberOfDirectReports;
	}
	private String firstName;
	private String lastName;
	int yearOfService;
	private Employee manager;
	private int numberOfDirectReports;

}
