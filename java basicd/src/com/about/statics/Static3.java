package com.about.statics;

public class Static3 {
	static int a;
	public static void staticTest() {
		a=11;
		System.out.println(a);
	}
	public static void main(String[] args) {
		staticTest();
		System.out.println(a);
	}
}


//a static variable can be used inside all  the methods of a class