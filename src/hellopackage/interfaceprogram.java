package hellopackage;

public class interfaceprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeclass W = new employeeclass();
		W.name();
		W.designation();
		W.salary();
		W.play();
		W.work();
	}

}

interface emplyoee {
	String name = "VEDANGI";
	int id = 101;
	int age = 30;
	int salary = 50000;
	String designation = " API DEVELOPER";

	// methods
	public void name();
	public void salary();

	public abstract void designation();

	public abstract void work();

	public abstract void play();

}

class employeeclass implements emplyoee {
	public void salary() {
		System.out.println(50000);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("VEDANGI is working");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("VEDANGI is playing");
	}

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		System.out.println("API DEVELOPER");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("VEDANGI ");
	}
}
