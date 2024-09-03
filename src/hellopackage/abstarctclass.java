package hellopackage;

public class abstarctclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myimplementaion imp = new myimplementaion();
		imp.add(10, 50);
		imp.sub();
		imp.mul(7, 3);
		imp.div(90, 3);
	}

}

abstract class operations {
	// instance member variable
	int a = 10;

	// member functions
	public abstract void add(int a, int b);

	public abstract void mul(int a, int b);

	public abstract void div(int a, int b);

	public void sub() {
		System.out.println(35- 5);

	}
}

class myimplementaion extends operations {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a * b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a / b);
	}

}
