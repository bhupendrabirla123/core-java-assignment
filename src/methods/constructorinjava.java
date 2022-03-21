package methods;

public class constructorinjava {
	int i;
	public constructorinjava() {
		i =100;
		System.out.println("in constructor");
		
	}
	public constructorinjava(int p) {
		i=p;
		System.out.println("in parameteric constructor");
	}
	public void init() {
		i=10;
	}
	public void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorinjava obj = new constructorinjava();// can call parametric constructor here using constructorinjava(and value can be assigned here
		// obj.init();
		obj.display();
		

	}

}
