package com.kaizen.Overloading;

public class Overloadinginjava {
	
	public void sum(int i, int j) {
		System.out.println(i+j);
	}
	public void sum (int i, int j, int k) {
		System.out.println(i+j+k);
	}
	
	public void sum(int i, float f) {
		System.out.println(i+f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadinginjava o = new Overloadinginjava();
		o.sum(12, 13);
		o.sum(12, 13,5);
		o.sum(19,12.5f);
	}
}
