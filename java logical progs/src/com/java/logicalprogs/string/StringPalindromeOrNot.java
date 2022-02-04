package com.java.logicalprogs.string;

import java.util.Scanner;

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=scanner.next();
		String rev="";
		
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
			
			if(str.equals(rev)) {
				System.out.println("palindrome");
			}else {
				System.out.println("not palindrome");
			}
		}
	}

}
