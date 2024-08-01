package hellopackage;

public class arrayascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ascending order
		int e[] = { 10, 30, 4, 8, 90, 100 };
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i] > e[j]) {
					int temp;
					temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}

			}
		}
		System.out.println("*ascending order*");
		for (int k = 0; k < e.length; k++) {
			System.out.print(e[k] + " ");

		}
		System.out.println();
		System.out.println("*descending order*");

		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i] < e[j]) {
					int temp;
					temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}

			}
		}

		for (int k = 0; k < e.length; k++) {
			System.out.print(e[k] + " ");
			
		}
		System.out.println();
		System.out.println("length of array="+e.length);
		System.out.println();
		System.out.println("#############################################");
		System.out.println("First smallest value=" + e[e.length - 1]);
		System.out.println("First largest value=" + e[0]);
		System.out.println("Third smallest value=" + e[3]);
		System.out.println("Third largest value=" + e[2]);
	}

}
