package com.java.logicalprogs.array;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayDuplicateRemove {
	public static void main(String[] args) {
		
		int [] arr= {1,2,1,3,2,3,2,6,20};
		int length=arr.length;
		if(length==1 || length==0) {
			for (int i : arr) {
				System.out.println(i);
				
			}
		}
		Arrays.sort(arr);
		int [] temp=new int[length];
		int j=0;
		for (int i = 0; i < length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[length-1];
		
		for (int k = 0; k < j; k++) {
			System.out.println(temp[k]+ " ");
		}
	}

}
