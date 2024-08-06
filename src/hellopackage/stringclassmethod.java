package hellopackage;

public class stringclassmethod {

	public static void main(String[] args) {
		// compare to ignore case method
		String a = "array is a object";
		System.out.println(a.compareToIgnoreCase("ArraY is a Object"));
		System.out.println(a.compareToIgnoreCase("array not a object"));
		System.out.println("######################################");
		// equals method
		System.out.println(a.equals("Array is a Object"));
		System.out.println(a.equals("array is a object"));
		System.out.println("#####################################");
		// equal ignore case
		System.out.println(a.equalsIgnoreCase("Array is a Object"));
		System.out.println("######################################");
		// index method
		System.out.println(a.indexOf('a'));
		System.out.println(a.indexOf('a', 2));
		String s = "electronics";
		System.out.println(s.lastIndexOf('i'));
		System.out.println(a.lastIndexOf("is"));
		System.out.println("######################################");
		// length
		System.out.println(a.length());
		System.out.println(s.length());
		System.out.println("######################################");
		// blank
		System.out.println(a.isEmpty());
		String d = " ";
		System.out.println(d.isEmpty());
		String f = "";
		System.out.println(f.isEmpty());

	}

}
