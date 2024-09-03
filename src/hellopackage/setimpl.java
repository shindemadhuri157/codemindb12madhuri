package hellopackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setimpl {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("arti");
		s.add("madhuri");
		s.add("priya");
		s.add("puja");
		s.add("sayli");
		s.add("kalyani");
		s.add("yogita");
		// not allowed duplicate element
		s.add("arti");
		// not maintain insertion order
		Iterator<String> b = s.iterator();
		while (b.hasNext()) {
			System.out.println(b.next());

		}
		System.out.println("*contains method*");
		System.out.println(s.contains("puja"));
		System.out.println(s.contains("veda"));
		System.out.println("*size method *");
		System.out.println(s.size());
		System.out.println("*is empty method *");
		System.out.println(s.isEmpty());
		System.out.println("*remove method*");
		s.remove("arti");
		Iterator<String> br = s.iterator();
		while (br.hasNext()) {
			System.out.println(br.next());
		
		}
		System.out.println("##############################################");
		//add mew elements
		Set<String> d = new HashSet<String>();
		d.add("madhuri");
		d.add("puja");
		d.add("manasvi");
		
		Iterator<String> z = d.iterator();
		while (z.hasNext()) {
			System.out.println(z.next());
	}
		System.out.println("*remove all method*");
		s.removeAll(d);
		Iterator<String> y = s.iterator();
		while (y.hasNext()) {
			System.out.println(y.next());}
		System.out.println("*clear method*");
		s.clear();
	}
}
