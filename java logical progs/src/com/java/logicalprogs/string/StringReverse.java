package com.java.logicalprogs.string;

public class StringReverse {
	public static void main(String[] args) {
		
		String stringInput="bangalore";
		int stringLength;
		
		for(stringLength=stringInput.length(); stringLength>0; --stringLength) {
			char reversed=stringInput.charAt(stringLength-1);
			System.out.println(reversed);
		}
	}

}
