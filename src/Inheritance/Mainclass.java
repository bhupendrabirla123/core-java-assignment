package Inheritance;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal An = new Animal();
		An.eat();
		An.sleep();
	
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.sleep();
		
		Babydog bd = new Babydog();
		bd.weep();
		bd.bark();
		bd.eat();
		bd.sleep();
		// here we can see animal class access only it's self methods or resources only
		// and other can access their parent class's resources

	}

}
