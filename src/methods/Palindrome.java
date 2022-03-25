package methods;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
			
	
		Scanner palin = new Scanner(System.in);
		System.out.println("Enter a number to check palin or not ");
		int n = palin.nextInt();
		int m=n;
		int sum=0;
		int a;
		
		for (;m!=0;){
			a= m%10;
			
			 sum =(sum*10)+a;
			m=m/10;
			
			
		}
	
		if (n == sum) {
			System.out.println("palin");
		}
		else {
			System.out.println("not palin");
		}
	}

}
}
