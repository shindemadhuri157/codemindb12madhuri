package hellopackage;

public class fullyencapsulatedprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation e= new encapsulation();
		e.setA(30);
		System.out.println(e.getA());
		e.setB(50);
		System.out.println(e.getB());
		
	}

}
 class encapsulation{
	 private int a;
	 private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	 
	 
 }