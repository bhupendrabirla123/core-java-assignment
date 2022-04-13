package com.kaizen.arrays;

public class Insertionsort {
	public static void main(String[] args) {
		int[] a = { 24, 43, 2, 4, 52, 42, 5, 3, 42, 4 };
		
		// insertion sort
		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			int j = i - 1;
			
			while (j >= 0 && current < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
