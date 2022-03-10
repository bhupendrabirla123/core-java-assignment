package com.kaizen.controllstatements;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 25;
		int z = 26 ;
		if ((i==j) || (j<i) && (z>j))
		{
			System.out.println("true");
		
		}
		else
		{
			System.out.println("false");
		}
		if ((i==j) && (j>i))
		{
			System.out.println("true");
		
		}
		else
		{
			System.out.println("false");
		}
		
		int day = 1;
		if (day==1)
		{
		System.out.println("monday");
		}
		else if (day==2)
		{
			System.out.println("tuesday");
		}
		else if (day==3)
		{
			System.out.println("wednesday");
		}
		else if (day==4 )
		{
			System.out.println("thursday");
		}
		else if (day==5)
		{
			System.out.println("friday");
		}
		else if (day ==6)
		{
			System.out.println("saturday");
		}
		else 
		{
			System.out.println("sunday");
		}
			

	}

}
