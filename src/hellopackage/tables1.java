package hellopackage;

public class tables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(2);table(3);table(4);table(5);
		table(6);table(7);table(8);table(9);
		table(10);
			
	}

	public static void table(int a) {
		for (int i = 1; i <= 10; i++) {
			int result = a * i;
			System.out.println(result);
		}
		System.out.println("#########################");
	}

}
