package com.kaizen.arrays;

public class Arrayreversepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5};
		for (int i =0;i<array.length;i++) {
			System.out.print(array[i]);
			
		}
		System.out.println();
		System.out.println("reversed array ");
		for (int j=array.length-1;j>=0;j--) {
			System.out.print(array[j]);
		}
	}

}
