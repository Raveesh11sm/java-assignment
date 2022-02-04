package com.java.logicalprogs.array;

public class SecondLargest {
	public static void main(String[] args) {
		
		int []arr= {10,22,45,26,50,72,8,14};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("the second largest element in the array is");
		System.out.println(arr[arr.length-2]);
}
}