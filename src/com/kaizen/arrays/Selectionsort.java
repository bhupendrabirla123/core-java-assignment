package com.kaizen.arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a = { 1, 44, 6, 77, 8, 6, 4, 5, 84, 3 };
		for (int i = 0; i < a.length; i++) {
			int temp = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[temp] > a[j]) {
					temp = j;
				}
			}
			int temp1 = a[temp];
			a[temp] = a[i];
			a[i] = temp1;
			System.out.println(a[i]);
		}
	}

}
