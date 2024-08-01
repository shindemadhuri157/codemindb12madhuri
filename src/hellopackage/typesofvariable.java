package hellopackage;

public class typesofvariable {
	int p=20;// instance member variable.
	float q=10.5f;
    static int a=20;// static variable.
    public void methodtest() {
    	int c=10;
    	int d=20;
    	int m;
    	m=c+d;
    	System.out.println("value of m is:" +m);
    	
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typesofvariable var= new typesofvariable();
		
		System.out.println("value of static variable  is:" +typesofvariable.a);
		System.out.println("value of instance  variable  is:" +var.p);
		System.out.println("value of instance  variable  is:" +var.q);
		System.out.println("value of instance  variable  is:" +var.p);
		var.methodtest();
	}

}
