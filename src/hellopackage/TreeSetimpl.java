package hellopackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetimpl {

	public static void main(String[] args) {
	TreeSet<String> tree= new TreeSet<String>();
   tree.add("vansh");
   tree.add("arrav");
   tree.add("rahil");
   tree.add("mukta");
   tree.add("sai");
   tree.add("kartik");
   //Duplicate element
   tree.add("rahil");
   // ascending order
   Iterator<String> h= tree.iterator();
   while(h.hasNext()) {
	   System.out.println(h.next());
   }
   System.out.println("*contains method*");
	System.out.println(tree.contains("sai"));
	System.out.println(tree.contains("divya"));
	System.out.println("*size method *");
	System.out.println(tree.size());
	System.out.println("*is empty method *");
	System.out.println(tree.isEmpty());
	System.out.println("*remove method*");
	tree.remove("arrav");
	Iterator<String> g = tree.iterator();
	while (g.hasNext()) {
		System.out.println(g.next());
	}
	System.out.println("##############################################");
	TreeSet<String> tree1= new TreeSet<String>();
	tree1.add("sarthak");
	tree1.add("kartik");
	tree1.add("om");
	
	Iterator<String> d= tree1.iterator();
	while(d.hasNext()) {
		System.out.println(d.next());
	}
	System.out.println("*remove all method*");
	tree.removeAll(tree1);
	Iterator<String> y = tree.iterator();
	while (y.hasNext()) {
		System.out.println(y.next());}
	System.out.println("*clear method*");
	tree.clear();
	}

}
