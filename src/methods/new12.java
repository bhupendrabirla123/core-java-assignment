package methods;

import java.util.Scanner;

public class new12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
		
		Scanner in = new Scanner(System.in);
		int v=0;
		System.out.println("Enter a no.");
		int n = in.nextInt();
		for (int i=1; i<=n;i++) {
			if (n%i==0) {
				v++;
				
			}
		}
		if(v==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}
}

}
