package com.kaizen.arrays;

public class Descendingorder {
	public static void main(String[] args) {
		int[] array = { 2, 44, 54, 6, 75, 7, 75, 4, 34, 44, 65, 5};
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int shorted : array) {
			System.out.println(shorted);
		}
	}

}
