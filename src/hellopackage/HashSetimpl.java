package hellopackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> q= new HashSet<Integer>();
q.add(10);
q.add(40);
q.add(45);
q.add(30);
q.add(90);
q.add(300);
q.add(20);
q.add(48);
// does not allow duplicate element
q.add(10);
// not maintain insertion order
 Iterator<Integer> e=q.iterator();
 while(e.hasNext()) {
	 System.out.println(e.next());
 }
 System.out.println("*contains method*");
	System.out.println(q.contains(10));
	System.out.println(q.contains(100));
	System.out.println("*size method *");
	System.out.println(q.size());
	System.out.println("*is empty method *");
	System.out.println(q.isEmpty());
	System.out.println("*remove method*");
	q.remove(45);
	Iterator<Integer> g = q.iterator();
	while (g.hasNext()) {
		System.out.println(g.next());
	}
	System.out.println("##############################################");
	//add mew elements
	HashSet<Integer> p = new HashSet<Integer>();
	p.add(10);
	p.add(40);
	
	Iterator<Integer> z = p.iterator();
	while (z.hasNext()) {
		System.out.println(z.next());
}
	System.out.println("*remove all method*");
	q.removeAll(p);
	Iterator<Integer> y = q.iterator();
	while (y.hasNext()) {
		System.out.println(y.next());}
	System.out.println("*clear method*");
	p.clear();

	}

}
