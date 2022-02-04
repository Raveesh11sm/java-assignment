package com.about.constructor.demo;

public class Student {
	int empId;
	int empAge;
	String empName;
	String empAdress;
	public Student(int empId, int empAge, String empName, String empAdress) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
		this.empAdress = empAdress;
	}
	
	public void DisplayDetails() {
		System.out.println("employee id"+ empId);
		System.out.println("employee age"+ empAge);
		System.out.println("employee name"+ empName);
		System.out.println("employee adress"+ empAdress);
	}
	
}



