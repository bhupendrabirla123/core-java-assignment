package methods;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
	
		Scanner palin = new Scanner(System.in);
		System.out.println("Enter a number to check palin or not ");
		int n = palin.nextInt();
		int sum=0;
		
		for (int i=n; i>0;i--){
			i = n%10;
			n=n/10;
			 sum =(sum*10)+i;
			
			
			
		}
		if (n == sum) {
			System.out.println("palin");
		}
		else {
			System.out.println(1%10);
		}
	}

}
}
