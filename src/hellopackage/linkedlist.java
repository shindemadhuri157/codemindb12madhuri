package hellopackage;
import java.util.Iterator;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		// add
		l.add(10);
		l.add(100);
		l.add(110);
		l.add(20);
		l.add(300);
		l.add(10);
		for (Integer i : l)
			System.out.println(i);
		System.out.println("##################################");
		// contains
		System.out.println(l.contains(100));
		System.out.println("##################################");
		// size
		System.out.println(l.size());
		System.out.println("##################################");
		// empty
		System.out.println(l.isEmpty());
		System.out.println("##################################");
		// get
		System.out.println(l.get(1));
		System.out.println("##################################");
		// remove
		
		l.remove(1);
		for (Integer j : l) {
			System.out.println(j);
		}
		System.out.println("##################################");
		LinkedList<Integer> m = new LinkedList<Integer>();
		m.add(10);
		m.add(100);
		m.add(40);
		// remove all
		l.removeAll(m);
		Iterator<Integer> n = l.iterator();
		System.out.println(l);
		System.out.println("##################################");
		l.clear();
	}

}
