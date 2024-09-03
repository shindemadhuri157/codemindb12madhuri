package hellopackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetimpl {

	public static void main(String[] args) {
LinkedHashSet<Integer> a= new LinkedHashSet<Integer>();
a.add(10);
a.add(80);
a.add(70);
a.add(20);
a.add(60);
a.add(1);
// not allow Duplicate element
a.add(1);
// maintain insertion order
Iterator<Integer>  i=a.iterator();
while (i.hasNext()) {
	System.out.println(i.next());
}
System.out.println("*contains method*");
	System.out.println(a.contains(20));
	System.out.println(a.contains(100));
	System.out.println("*size method *");
	System.out.println(a.size());
	System.out.println("*is empty method *");
	System.out.println(a.isEmpty());
	System.out.println("*remove method*");
	a.remove(10);
	Iterator<Integer> g = a.iterator();
	while (g.hasNext()) {
		System.out.println(g.next());
	}
	System.out.println("##############################################");
	LinkedHashSet<Integer> b= new LinkedHashSet<Integer>();
	b.add(80);
	b.add(70);
	b.add(30);
	Iterator<Integer> d= b.iterator();
	while(d.hasNext()) {
		System.out.println(d.next());
	}
	System.out.println("*remove all method*");
	a.removeAll(b);
	Iterator<Integer> y = a.iterator();
	while (y.hasNext()) {
		System.out.println(y.next());}
	System.out.println("*clear method*");
	a.clear();
	}
	
	}
	


