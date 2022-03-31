package Inheritance;

public class Car extends Vehicle{
	public void fuelAmount() {
		System.out.println("fuelamount method from Car class");
	}
	public void capacity() {
		System.out.println("capacity method form Car class");
	}
	public void applybreaks() {
		System.out.println("applybreaks method from Car class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.fuelAmount();
		c.capacity();
		c.applybreaks();

	}

}
