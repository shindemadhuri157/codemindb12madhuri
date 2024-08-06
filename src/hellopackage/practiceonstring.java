package hellopackage;

public class practiceonstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "welcome";
		System.out.println(a);
		a.concat("to india");
		System.out.println(a);
		System.out.println(a.concat(" to india"));
		String b = "pune";
		char m=b.charAt(1);
		System.out.println(m);
		System.out.println(a.compareTo("pune"));
		System.out.println(a.contains("come"));
		System.out.println(a.endsWith("a"));
		char d[]= {'m','u','m','b','a','i'};
		String s3=new String (d);
		System.out.println(s3);
		

	}

}
