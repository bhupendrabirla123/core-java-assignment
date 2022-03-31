package Inheritance;

public class Manager extends Employee{
	
	public void bonus() {
		System.out.println("In bonus");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager M = new Manager();
		M.name();
		M.Age();
		M.Address();
		M.Salary();
		M.bonus();
	}

}
