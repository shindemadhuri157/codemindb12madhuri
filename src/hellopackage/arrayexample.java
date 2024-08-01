package hellopackage;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// single dimensional array
		int p[] = { 10, 20, 30, 40, 400 };
		System.out.print(p[0] + " ");
		System.out.print(p[1] + " ");
		System.out.print(p[2] + " ");
		System.out.print(p[3] + " ");
		System.out.print(p[4] + " ");
		System.out.println();
		System.out.println("length of single dimensional=" + p.length);
		System.out.println("##################################################33");
		System.out.println("single dimensional array using for loop"+" ");
		// single dimensional array using for loop.
		
		int i;
		for (i = 0; i <= p.length-1; i++)
			
		{
			System.out.print(p[i] + " ");
		}

		
	}

}
