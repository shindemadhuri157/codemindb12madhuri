package hellopackage;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.addition();
		child.addition(10, 20, 30);
		child.addition(10.20f);
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

class Child extends methodoverloading {

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	

	}

}
