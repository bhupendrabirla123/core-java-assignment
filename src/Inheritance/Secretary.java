package Inheritance;

public class Secretary extends Employee {
	
	public Secretary(){
		super(70);
	}
	
	public void call(){
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretary S = new Secretary();
		S.name();
		S.Age();
		S.Address();
		S.Salary();
	
		
	
	}

}
