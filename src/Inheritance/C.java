package Inheritance;

public class C extends B{

	public void m1() {
		System.out.println("In m1 method of class c");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.m1();
		
		A a = new A();
		a.m1();
		

	}

}
