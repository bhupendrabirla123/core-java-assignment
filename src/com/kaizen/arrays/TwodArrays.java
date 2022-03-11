package com.kaizen.arrays;

public class TwodArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5};
		for (int x: array) {
			System.out.println(x);
		}
		int [] [] array2D = {
							{1,2,3,4,5},
							{7,2,3,7,9}
		};
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<array2D[i].length; j++) {//array2D[i].length can replace this with 5 here
				System.out.print(array2D[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
