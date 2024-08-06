package hellopackage;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 10, 40, 60 }, { 30, 65, 90 }, { 30, 89, 76 } };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 60) {
					count++;
				}
			}
		}
		System.out.println("count of element 60 in 2D array=" + count);
		System.out.println("#################################################");
		int q[][] = { { 10, 20, 30 }, { 10, 50, 60 }, { 20, 30, 50 } };
		for (int l = 0; l < q.length; l++) {
			for (int m = 0; m < q[l].length; m++) {
				System.out.print(q[l][m] + " ");

			}
			System.out.println();
			
		}

		int d[][] = { { 10, 20, 30 }, { 10, 50, 60 }, { 20, 30, 50 } };
		int add = 0;
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if (i == j) {
					add += d[i][j];
				}
			}

		}
		System.out.println("#################################################");
		System.out.println("Addition of  diagonal array ="+" "+add);
	}

}
