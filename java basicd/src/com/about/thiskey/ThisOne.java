package com.about.thiskey;

public class ThisOne {
	int a;
	
	public void test() {
		System.out.println("current object address" +this);
		System.out.println("non static variable" +this.a);
	}
	public static void main(String[] args) {
		ThisOne one=new ThisOne();
		System.out.println("address of obect" + one);
		one.test();
		
		ThisOne one2=new ThisOne();
		System.out.println("address of object" + one2);
		one2.test();
	}

}
