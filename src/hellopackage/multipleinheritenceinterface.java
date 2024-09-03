package hellopackage;

public class multipleinheritenceinterface {

	public static void main(String[] args) {
		cars_1 c=new cars_1();
		c.run();
		c.strat();
	}
}
interface car1 {
	String carname="ertiga";
	String cartype="manual";
	int price=900000;
	public void run();
}
interface car2{
	String carname="nexon";
	String cartype="manual";
	int price=700000;
	public void strat();
}
interface cars extends car1,car2{
}
class cars_1 implements cars  {
	@Override
	public void run() {
		System.out.println("car is running fast");
	}
	@Override
	public void strat() {
		System.out.println("car is start now");
	}
	
}
