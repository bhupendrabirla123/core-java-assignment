package com.kaizen.Collections;

public class Containsmethod {

	public static boolean check(Object arr[], Object a) {
		for (int i =0; i<arr.length;i++) {
			if (arr[i]==a) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Object arr[] = { 'a', "hello", 12, true };
		Object a = "hello";
		boolean b= check(arr,a);
		if (b) {
			System.out.println(a+": is available");
		}
	}
}
