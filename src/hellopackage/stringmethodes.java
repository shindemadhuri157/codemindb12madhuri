package hellopackage;

public class stringmethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "string is a sequence of character";
		char w = q.charAt(7);// charAt method
		System.out.println("#charAt method#");
		System.out.println(w);
		char e = q.charAt(12);
		System.out.println(e);
		System.out.println("#concat method#");
		String b = q.concat(" or bunch of character");// concat method
		System.out.println(b);
		System.out.println("#contains method#");
		System.out.println(q.contains("is"));// contains
		System.out.println(q.contains("told"));
		System.out.println(b.contains("bunch"));
		System.out.println("#endwith method#");
		System.out.println(q.endsWith("character"));// endwith
		System.out.println(q.endsWith("of"));
		System.out.println(b.endsWith("character"));
		System.out.println(b.endsWith("bunch"));
		System.out.println("#compare strint with another string#");
		System.out.println(q.compareTo("or bunch of character"));
		// s=115,o=111,s-o=115-111=4
		System.out.println(q.compareTo("string is a sequence of character"));
	}

}
