package hellopackage;

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchild c= new Superchild();
		c.add();
	}

}
class Superparent{
	int a=20;
	int b=90;
	public void add() {
		System.out.println("add");
	}
	
}
class Superchild extends Superparent{
	int p=20;
	int b=20;
	public void add () {
		System.out.println("chlid add method");
		System.out.println(super.b+b);
	}
}
