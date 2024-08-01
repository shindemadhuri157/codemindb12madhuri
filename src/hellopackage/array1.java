package hellopackage;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" multidimensional array");
		int q[][] = { { 20, 30, 40 }, { 20, 39, 45 }, { 22, 3, 44 } };
		System.out.println(q[0][0]);
		System.out.println(q[0][1]);
		System.out.println(q[0][2]);
		
		System.out.println(" multidimensional array using for loop");
		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				System.out.print(q[i][j] + " ");
			}
			System.out.println();
		}
	}

}
