package Inheritance;

public class Employee {
	
	int a;
	public Employee() {
		a=11;
		System.out.println(a);
	}
	
	public Employee(int a) {
		this.a= a;
		//a= 10;
		System.out.println(a);
	}
	
	public void name() {
		System.out.println("Inside name");
	}
	public void Age() {
		System.out.println("Inside Age");
	}
	public void Salary() {
		System.out.println("In salary");
	}
	public void Address() {
		System.out.println("In Address");
	}
	

}
