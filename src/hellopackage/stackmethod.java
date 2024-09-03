package hellopackage;

import java.util.Iterator;
import java.util.Stack;
public class stackmethod {

	public static void main(String[] args) {
		Stack<Integer> h= new Stack<Integer>();
		h.add(10);
		h.add(100);
		h.add(56);
		h.add(300);
		h.add(104);
		h.add(10);
		
	for(Integer i:h)
		System.out.println(i);
	System.out.println("########################################3");
	// contains
	System.out.println(h.contains(100));
	System.out.println("##################################");
	// size
	System.out.println(h.size());
	System.out.println("##################################");
	// empty
	System.out.println(h.isEmpty());
	System.out.println("##################################");
	// get
	System.out.println(h.get(1));
	System.out.println("##################################");
	// remove
	h.remove(2);
	for (Integer j : h) {
		System.out.println(j);
	}
	System.out.println("##################################");
	Stack<Integer> z= new Stack<Integer>();
	
	 z.add(30);
	 z.add(10);
	 z.add(300);
	 for (Integer k:z)
		 System.out.println(k);
	 System.out.println("##################################");
	 h.removeAll(z);
	 Iterator<Integer> b=h.iterator();
	 System.out.println(h);
	 System.out.println("##################################");
	 // clear 
	z.clear();
		}
	
		
	}

