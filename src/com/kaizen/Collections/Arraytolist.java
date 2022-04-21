package com.kaizen.Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraytolist {
	public static void main(String[] args) {
		List list = new ArrayList();
		int arr[] = { 35, 5, 6, 4, 5, 4, 34, 3, 53 };

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		list.add("hello");
		System.out.println(list);

		Object ar[] = list.toArray();

		for (int i = 0; i < list.size(); i++) {

			System.out.print(ar[i] + " ");
		}

	}

}
