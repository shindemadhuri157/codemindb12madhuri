package hellopackage;

import java.util.Iterator;
import java.util.Vector;

public class vectormethod {

	public static void main(String[] args) {
		Vector<Integer> m= new Vector<Integer>();
m.add(10);
m.add(40);
m.add(50);
m.add(30);
m.add(50);
m.add(500);
m.add(300);

for(Integer i:m)
System.out.println(i);
System.out.println("##################################");
// contains
System.out.println(m.contains(100));
System.out.println("##################################");
// size
System.out.println(m.size());
System.out.println("##################################");
// empty
System.out.println(m.isEmpty());
System.out.println("##################################");
// get
System.out.println(m.get(1));
System.out.println("##################################");
// remove
m.remove(1);
for (Integer j : m) {
	System.out.println(j);
}
System.out.println("##################################");
 Vector<Integer> n =new Vector<Integer>();
 n.add(20);
 n.add(10);
 n.add(50);
 for (Integer k:n)
	 System.out.println(k);
 System.out.println("##################################");
m.removeAll(n);
Iterator<Integer> b=m.iterator();
System.out.println(m);
System.out.println("##################################");
// clear
n.clear();
	}

}
