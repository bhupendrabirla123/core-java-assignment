package com.kaizen.overriding;

import java.util.Scanner;

public class Manager extends Employees {
	
	private int bonus; 
	
	public int setbonus(int bonus) {
		this.bonus= bonus;
		return bonus;
	}
	
	public int getbonus() {
		return bonus;
	}
	public int getsalary() {
		System.out.println("Managers salary is: ");
		return  super.getsalary() + bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Specify bonus amount in int: ");
		int n = in.nextInt();
		Manager M = new Manager();
		M.setbonus(n);
		M.setsalary(12000);
		
		System.out.println(M.getsalary());
	}

}
