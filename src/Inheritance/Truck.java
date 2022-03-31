package Inheritance;

public class Truck extends Vehicle {
	
	public void fuelAmount() {
		super.fuelAmount();
		System.out.println("fuelamount method from Truck class");
	}
	public void capacity() {
		System.out.println("capacity method form Truck class");
	}
	public void applybreaks() {
		System.out.println("applybreaks method from Truck class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t = new Truck();
		t.fuelAmount();
		t.capacity();
		t.applybreaks();
		Vehicle v;
		v= new Truck();
		v.applybreaks();
		
	}

}
