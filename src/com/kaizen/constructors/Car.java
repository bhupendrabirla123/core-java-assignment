package com.kaizen.constructors;

public class Car {
	String colour;
	String manufacturername ;
	String model;
	public Car() {
		System.out.println("Non paramaterised");
	}
	public Car(String colour, String manufacturername,String model) {
		this.colour = colour;
		this.manufacturername = manufacturername;
		this.model = model;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.colour = "Red";
		car.manufacturername = "Ford";
		car.model = "Mustang";
		car.describeCar();
		
		
		Car toyota = new Car("Blue", "Toyota", "Prius");
		toyota.describeCar();
		
		
		Car Wolkswagen = new Car("Green", "Wolkswagen","Golf");
		Wolkswagen.describeCar();

	}
	public void describeCar() {
		System.out.println("Car [colour=" + colour + ", manufacturername=" + manufacturername + ", model=" + model + "]");
		
		
	}
}