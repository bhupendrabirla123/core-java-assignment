package Inheritance;

class F {
	int x = 50;
	private A() {
		System.out.println(x);
	}
	
}

public class D extends F{
	public static void main(String[] args) {
		D d = new D();
	}
	
	

}



