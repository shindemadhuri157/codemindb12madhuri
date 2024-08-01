package hellopackage;
class calculator {
	int A= 150;
	int B= 100;
	int C;
	// no return type ,no argument
	void ADDITION() {
		C=A+B;
		System.out.println("ADDITION IS:"+C);
	}
		// no return type ,with argument
		
	void SUBSTRACTION(int A,int B) {
		C=A-B;
		System.out.println("SUBSTRACTION IS:"+C);
	}
	// with return type ,no argument
	int MULTIPLICATION() {
		C=A*B;
		System.out.println("MULTIPLICATION IS:"+C);
		return C;
	}
	// with return type ,with argument
	
	int DIVISION(int A,int B) {
		C=A/B;
		System.out.println("DIVISION IS:"+C);
		return C;
	}
	
	
}
public class calculatorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator V= new calculator();
		V.ADDITION();
		V.SUBSTRACTION(150,100);
		int I=V.MULTIPLICATION();
		System.out.println("integer value return is:"+I);
		int D=V.DIVISION(150,100);
		System.out.println("integer value return is:"+D);
	}
		
		
		
		

	}


