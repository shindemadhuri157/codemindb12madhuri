package hellopackage;

public class stringclassmethode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="class is a blueprint for creating a object";
System.out.println(" # convertin a string to upper case #");
System.out.println(a.toUpperCase());
System.out.println();

System.out.println(" # convertin a string to lower case #");
System.out.println(a.toLowerCase());
System.out.println();

System.out.println(" # replace the char b to B #");
System.out.println(a.replace('b', 'B'));
System.out.println(a.replace("blueprint", "template"));
System.out.println();

System.out.println("#string start with specified prefix#");
System.out.println(a.startsWith("object"));
System.out.println(a.startsWith("class"));

System.out.println("#string ends with #");
System.out.println(a.endsWith("object"));
System.out.println(a.endsWith("array"));
System.out.println();

System.out.println("# return a string that is substring of this string#");
System.out.println(a.substring(11));
System.out.println(a.substring(21));
System.out.println(a.substring(11,20));
System.out.println();

String b ="  codemind";
System.out.println();
System.out.println("#returns a string whose value is this string ,with any leading and trailing,remove white space#");
System.out.println(b);
System.out.println(b.trim());

	}

}
