package com.kaizen.arrays;

import java.util.Arrays;

public class Usingsort {
	public static void main(String[] args) {
		String[] colours = { "orange","red", "blue", "black", "yellow", "green" };
		System.out.println("Before sorting...");

		for (int i = 0; i < colours.length; i++) {
			System.out.println(colours[i]);
			Arrays.sort(colours);
		}
		System.out.println("After sorting.....");
		for (String sorted : colours) {
			System.out.println(sorted);
		}

	}

}
