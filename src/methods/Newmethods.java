package methods;

public class Newmethods {
	public int  sum(int i,int j) {
		int c=i+j;
		return  c;
		
	}
	public int sub(int i,int j) {
		int c =i-j;
		return c;
	}
	public int mul(int i,int j) {
		int c = i*j;
		return c;
	}
	public float div(float i, int j) {
		float c = i/j;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Newmethods obj = new Newmethods();
		int c = obj.sum(12, 13);
		System.out.println(c);
	
	int c1 =	obj.sub(51, 17);
	
		System.out.println(c1);
		int c2 = obj.mul(5, 7);
		System.out.println(c2);
		
		float c3 = obj.div(7, 5);
		System.out.println(c3);
		


	}

}
