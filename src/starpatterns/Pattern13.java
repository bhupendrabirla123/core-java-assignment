package starpatterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i =n-1;i>=1;i--) {
			for (int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for (int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =1;i<=n;i++) {
			for (int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
