package hellopackage;

import java.util.ArrayList;
import java.util.List;

public class listimpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ArrayList= new ArrayList<String>();
ArrayList<Integer>ArrayList1=new ArrayList<Integer>();
finalkeyword g =new finalkeyword();
List<student3> l = new ArrayList<student3>();
l.add(new student3() );

System.out.println(l.get(0).rollno);
System.out.println(l.get(0).sname);
System.out.println(l.get(0).marks);
System.out.println("##################################");
ArrayList.add("aditya");
ArrayList.add("manasvi");
ArrayList.add("arya");
ArrayList.add("tushar");
ArrayList1.add(20);
ArrayList.add("manasvi");
ArrayList.add("aditya");
ArrayList.add("poonam");
ArrayList1.add(10);

for (String i : ArrayList ) {
	System.out.println(i);
}
for(Integer i :ArrayList1) {
	System.out.println(i);
}


	}
}
	
class student3{
	int rollno=21;
	String sname="sonali";
	int marks= 80;
	
}