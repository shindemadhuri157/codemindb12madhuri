package hellopackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapimpl {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linked = new LinkedHashMap<Integer, String>();
		linked.put(123, "vasu");
		linked.put(456, "vayu");
		linked.put(104, "vidhi");
		linked.put(108, "bheem");
		linked.put(107, "ketan");
		linked.put(null, "vansh");
		linked.put(298, "vansh");
		Set<Entry<Integer, String>> s = linked.entrySet();
		Iterator<Entry<Integer, String>> mn = s.iterator();
		while (mn.hasNext()) {
			Entry<Integer, String> p = mn.next();
			System.out.println(p.getKey() + " :" + p.getValue());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44");
		System.out.println("putall method");
		LinkedHashMap<Integer, String> linked1 = new LinkedHashMap<Integer, String>();
		linked1.putAll(linked);
		Set<Entry<Integer, String>> s1 = linked1.entrySet();
		Iterator<Entry<Integer, String>> mn1 = s1.iterator();
		while (mn1.hasNext()) {
			Entry<Integer, String> p1 = mn1.next();
			System.out.println(p1.getKey() + " :" + p1.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("clear method");
		linked.clear();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("isempty method");
		System.out.println(linked.isEmpty());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("contains method");
		System.out.println(linked1.containsKey(674593));
		System.out.println(linked1.containsKey(12345));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("remove method: 107:ketan");
		linked1.remove(107);
		Set<Entry<Integer, String>> s2 = linked1.entrySet();
		Iterator<Entry<Integer, String>> mn2 = s2.iterator();
		while (mn2.hasNext()) {
			Entry<Integer, String> p2 = mn2.next();
			System.out.println(p2.getKey() + " :" + p2.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("replace method_-the value vasu is replace by manasi");
		linked1.replace(123, "manasi");
		Set<Entry<Integer, String>> s3 = linked1.entrySet();
		Iterator<Entry<Integer, String>> mn3 = s3.iterator();
		while (mn3.hasNext()) {
			Entry<Integer, String> p3 = mn3.next();
			System.out.println(p3.getKey() + " :" + p3.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// Returns the value to which the specified key is mapped
		System.out.println("get method");
		System.out.println(linked1.get(108));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("size method");
		int size = linked1.size();
		System.out.println(size);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("get all values");
		Collection<String> values = linked1.values();
		for (String value : values) {
			System.out.println(value);
		}
	}
}
