package com.kaizen.arrays;

public class New {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
//		int arr[]= {2,3,5,1,4};
		
		int temp =2;
		temp=temp+2;
		temp++;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp;
			temp=temp+2;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
