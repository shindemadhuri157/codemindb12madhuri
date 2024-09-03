package hellopackage;

public class lowertouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert all lower case ch to upaar case
String a = "class is a template";
System.out.println("     #lower  to upper case#    ");
 System.out.println(a.toUpperCase());
 
 String b = "ARRAY IS AN OBJECT";
 System.out.println("     #upper to lower case#     ");
 System.out.println(b.toLowerCase());
 System.out.println();
 System.out.println("     #convert only upper case to lower case#    ");
 String c ="wElcome to inDia";
  for (int i=0;i< c.length();i++) {
	 if(Character.isUpperCase(c.charAt(i))) {
		 
	System.out.print(Character.toLowerCase(c.charAt(i)));	 
	continue;
	
	 }else {
		 System.out.print(c.charAt(i));
	 }
	  }
  System.out.println();
  System.out.println("     #convert only lower case to upper case#    ");
 String d ="Welcome To NAshik";
 for(int i =0;i<d.length();i++) {
	 if(Character.isLowerCase(d.charAt(i))) {
		 System.out.print(Character.toUpperCase(d.charAt(i)));
		 continue;
	 }else {
		 System.out.print(d.charAt(i));
	 }
 }
  
}
}

