package hellopackage;

public class finalkeyword {
	final int p=20;
	int w=10;
	final String pan="dsfr45362";
	final int empid= 201;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalkeyword g =new finalkeyword();
		g.add();	
	}
public  void add() {
	//p=56;
	System.out.println(p+w);
}
}
final class finalkeywoed1 extends finalkeyword{
	public void add() {
		int c;
		c=p+w;
		System.out.println(c);
	}
}
// when we declare class with final keyword we cant override the class.
class newfinalkeyword extends finalkeywoed1{
	
}