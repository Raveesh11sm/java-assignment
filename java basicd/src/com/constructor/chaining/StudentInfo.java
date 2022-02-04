package com.constructor.chaining;

public class StudentInfo {
	int id;
	int age;
	String name;
	
	StudentInfo(){
		
	}
	
	public StudentInfo(int id) {
		this();
		this.id = id;
	}

	public StudentInfo(int id, String name) {
		this(id);
		this.name = name;
	}

	public StudentInfo(int id, int age, String name) {
		this(id,name);
		this.age = age;
	}
	
	public void display() {
		System.out.println("employee id:" +id);
		System.out.println("employee name"+name);
		System.out.println("employee age" +age);
		
	}
	
	
	
	

	
	

}
