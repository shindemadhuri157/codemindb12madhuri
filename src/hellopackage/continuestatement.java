package hellopackage;

public class continuestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using for loop
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // skip odd no
				continue;

			}
			System.out.println(i);// print even no
		}
		System.out.println("###########################################");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // skip even no
				continue;

			}
			System.out.println(i);// print odd no
		}
		System.out.println("###########################################");
		// using while loop
		 int j=1;
		 while(j<=10) {
			 if (j % 2 == 0) {
				 j++;
				 continue;
			 }
			 System.out.println(j);
			 j++;
		 }
		
		
		
	}

}
