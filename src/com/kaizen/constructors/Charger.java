package com.kaizen.constructors;

public class Charger {
	String Brand;
	String Capacity;
	int price;
	public Charger() {
		
	}
	public Charger(String Brand, String Capacity, int price) {
		this.Brand = Brand;
		this.Capacity = Capacity;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub8
		Charger mobile = new Charger();
		mobile.Brand = "Vivo";
		mobile.Capacity = "4A";
		mobile.price = 800;
		

	}
	public void Chargerinfo() {
		System.out.println("Charger [Brand=" + Brand + ", Capacity=" + Capacity + ", price=" + price + "]");
	}
}
