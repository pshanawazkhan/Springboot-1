package com.example.demo.dto;

public class UserResponse {

	
    private int id;
	
	private String name;
	
	private String dept;
	
	private double salary;
	
	private String place;

	public UserResponse() {
	}

	public UserResponse(int id, String name, String dept, double salary, String place) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
