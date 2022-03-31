package Inheritance;

public class Bus extends Vehicle{
	public void fuelAmount() {
		System.out.println("fuelamount method from Bus class");
	}
	public void capacity() {
		System.out.println("capacity method form Bus class");
	}
	public void applybreaks() {
		System.out.println("applybreaks method from Bus class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.fuelAmount();
		b.capacity();
		b.applybreaks();

	}

}
