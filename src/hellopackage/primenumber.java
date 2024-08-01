package hellopackage;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;
		boolean prime = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}

		}
		if (prime) {
			System.out.println("number is prime =" + number);
		} else {
			System.out.println("number is not prime = " + number);
		}
		System.out.println("########################################################");
		int a = 0;
		int b = 1;
		

		{
			System.out.print(a + " " + b);
			for (int i = 1; i <= 10; i++){
			int result = a + b;
			System.out.print(" " + result+" ");
			a = b;
			b = result;
			}
			
		}
	}

}
