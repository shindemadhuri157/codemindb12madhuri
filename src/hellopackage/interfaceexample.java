package hellopackage;

public class interfaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass Z= new ImplClass();
		Z.add();
	Z.age();
	}

}
interface firstinterface{
	//variables
	public static final int a=40;
	public static final int b=30;
	//methods
	public abstract void add ();
	public abstract void age();
	
	
	
}
class ImplClass implements firstinterface{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println(50);
	}

	
	}
	
