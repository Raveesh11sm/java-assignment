package com.constructor.chaining;

import ConstructorOverloading.Employee;

public class StudentMain {
	public static void main(String[] args) {
		StudentInfo info=new StudentInfo(14);
		info.display();
		
		StudentInfo info2=new StudentInfo(125,"tsg");
		info.display();
	}

}
