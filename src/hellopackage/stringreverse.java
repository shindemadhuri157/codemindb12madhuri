package hellopackage;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse the given string
		String a = "class is a template";
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		System.out.println("#######################################3");
		// reverse the words from given string
		String c = "class is a blueprint";
		String d[] = c.split(" ");
		for (int i = 0; i < d.length; i++) {
			String ss = d[i];
			for (int j = ss.length() - 1; j >= 0; j--) {
				System.out.print(ss.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
