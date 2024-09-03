package hellopackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapimpl {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.put(12, "sarthak");
		tree1.put(13, "sarthak");
		tree1.put(19, "manasvi");
		tree1.put(10, "null");
		tree1.put(17, "mohini");
		tree1.put(18, "null");
		tree1.put(20, "kartik");
		Set<Entry<Integer, String>> s = tree1.entrySet();
		Iterator<Entry<Integer, String>> mn = s.iterator();
		while (mn.hasNext()) {
			Entry<Integer, String> p = mn.next();
			System.out.println(p.getKey() + " :" + p.getValue());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44");
		System.out.println("putall method");
		TreeMap<Integer, String> tree2 = new TreeMap<Integer, String>();
		tree2.putAll(tree1);
		Set<Entry<Integer, String>> s1 = tree2.entrySet();
		Iterator<Entry<Integer, String>> mn1 = s1.iterator();
		while (mn1.hasNext()) {
			Entry<Integer, String> p1 = mn1.next();
			System.out.println(p1.getKey() + " :" + p1.getValue());
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("clear method");
		tree1.clear();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("isempty method");
		System.out.println(tree1.isEmpty());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("contains method");
		System.out.println(tree2.containsKey(674593));
		System.out.println(tree2.containsKey(12345));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("remove method: 107:ketan");
		tree2.remove(20);
		Set<Entry<Integer, String>> s2 = tree2.entrySet();
		Iterator<Entry<Integer, String>> mn2 = s2.iterator();
		while (mn2.hasNext()) {
			Entry<Integer, String> p2 = mn2.next();
			System.out.println(p2.getKey() + " :" + p2.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("replace method_-the value null is replace by om");
		tree2.replace(18, "om");
		Set<Entry<Integer, String>> s3 = tree2.entrySet();
		Iterator<Entry<Integer, String>> mn3 = s3.iterator();
		while (mn3.hasNext()) {
			Entry<Integer, String> p3 = mn3.next();
			System.out.println(p3.getKey() + " :" + p3.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// Returns the value to which the specified key is mapped
		System.out.println("get method");
		System.out.println(tree2.get(108));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("size method");
		int size = tree2.size();
		System.out.println(size);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("get all values");
		Collection<String> values = tree2.values();
		for (String value : values) {
			System.out.println(value);
		}

	}

}
