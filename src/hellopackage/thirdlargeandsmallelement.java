package hellopackage;

public class thirdlargeandsmallelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 20, 60, 10, 4, 6, 90, 70 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");

		}
		System.out.println();
		System.out.println("lenth of given array=" + a.length);
		System.out.println("############################################33");
		System.out.println("Third largest element=" + a[2]);
		System.out.println("Third smallest element=" + a[4]);
	}

}
