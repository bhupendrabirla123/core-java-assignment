package methods;

public class variablesiinjava {
	int i =10;//instance variable
	public void show() {
		System.out.println(i);
		i=90;
		System.out.println(i);
		int i = 89;// local variable
		System.out.println(i);
	}
	public void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesiinjava obj = new variablesiinjava();
		obj.show();
		obj.display();
		
	}

}
