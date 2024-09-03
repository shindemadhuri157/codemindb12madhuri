package hellopackage;

import java.util.Stack;

public class stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	System.out.println(h.get(1));
	System.out.println(h.isEmpty());
	System.out.println();
	}

}
