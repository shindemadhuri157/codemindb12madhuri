package hellopackage;

public class exceptionhandlingthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=4;
int c;
c=a/b;

try {
	b=0;
	throw new ArithmeticException();
}catch (Exception e){
	System.out.println("Arithmatic exception arieses");
	System.out.println(e.getMessage());
	
 }
	}

}
