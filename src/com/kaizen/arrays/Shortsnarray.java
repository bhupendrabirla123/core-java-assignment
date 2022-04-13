package com.kaizen.arrays;

public class Shortsnarray {

	public static void main(String[] args) {
		int[] a = new int[] { 12, 13, 4, 15, 36, 2, 5 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			}
		for (int b : a) {
			System.out.println(b);
		}
	}

}
