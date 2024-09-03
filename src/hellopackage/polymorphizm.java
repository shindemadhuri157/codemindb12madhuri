package hellopackage;

public class polymorphizm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		polymorphizm s=new polymorphizm();
		s.addition();
		s.addition(10);
		s.addition(3, 4);
		
	}

	public void addition() {
		System.out.println("Without argument");
	}

	public void addition(int a) {
		System.out.println(a);
	}

	public void addition(int a, float b) {
		System.out.println(a + b);
	}

	void addition(float a) {
		System.out.println(a);
	}

	public int addition(int a, int b) {
		return a + b;

	
	}

}
