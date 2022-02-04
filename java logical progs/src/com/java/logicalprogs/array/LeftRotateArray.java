package com.java.logicalprogs.array;

import java.util.Iterator;

public class LeftRotateArray {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60};
		int rotate=2;
		
		System.out.println("the given array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
			for (int i = 0; i < rotate; i++) {
				int first =arr[0];
				int j;
				for (j = 0; j < arr.length-1; j++) {
					arr[j]=arr[j+1];
					}
				arr[j]=first;
				
				
			}
			System.out.println("the left rotated array");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
			
	}

}
