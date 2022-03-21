package com.kaizen.constructors;

public class Person {
	String name;
	int age;
	String city;
	String gender;

	public Person() {
		System.out.println("testing");
	}

	public Person(String name, int age, String city, String gender) {
		System.out.println("testin2");
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.describePerson();
		
		person.name = "Dessy";
		person.age = 20;
		person.city = "Pune";
		person.gender = "female";
		
		
		Person john = new Person("John", 35, "Delhi","male");
		john.describePerson();
	}

	public void eat() {
		System.out.println("eating");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public void play() {
		System.out.println("playing");
	}

	public void study() {
		System.out.println("studying");
	}

	public void describePerson() {

		System.out.println("Person [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]");
	}
}
