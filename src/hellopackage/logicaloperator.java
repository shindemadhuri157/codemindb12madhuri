package hellopackage;

public class logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=50,c=20;
System.out.println(a<b && b>c);
System.out.println(a<b && a>c);
System.out.println(a>b && a<c);
System.out.println(a>c && a<c);
System.out.println(b>c && a>c);
System.out.println("####################################################");

System.out.println(a>b || a>c);
System.out.println(a<b || a>c);
System.out.println(a>b || a<c);
System.out.println(a>b || b<c);
System.out.println(a>c || b>c);
	}

}
