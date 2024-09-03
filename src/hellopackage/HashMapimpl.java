package hellopackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapimpl {

	public static void main(String[] args) {
		HashMap<Integer,String> e=new HashMap<>();
		e.put(128930, "vansh");
		e.put(123456, "vedangi");
		e.put(124456, "prithvi");
		e.put(120456, "sanvi");
		e.put(127456, "vidya");
		//key allows a single null value
		e.put(null, "satish");
		e.put(null, "mukta");
		// it not allowed duplicate key 
		// it may have duplicate value.
		e.put(128930, "vidhi");
		e.put(128456, "sanvi");
		// it allowed multiple null value.
		e.put(674593, null);
		e.put(437098, null);
		
		Set<Entry<Integer,String>> s=e.entrySet();	
		Iterator<Entry<Integer,String>> mn=s.iterator();
		while(mn.hasNext()) {
			Entry<Integer,String> p=mn.next();
			System.out.println(p.getKey()+" :"+ p.getValue());
			
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("putall method");
		HashMap<Integer,String> e2=new HashMap<>();
		e2.putAll(e);
		Set<Entry<Integer,String>> s1=e2.entrySet();
		Iterator<Entry<Integer,String>> mn1=s1.iterator();
		while(mn1.hasNext()) {
			Entry<Integer,String> p1=mn1.next();
			System.out.println(p1.getKey()+" :"+ p1.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("clear method");
		e.clear();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("isempty method");
		System.out.println(e.isEmpty());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("contains method");
		System.out.println(e2.containsKey(674593));
		System.out.println(e2.containsKey(12345));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("remove method");
		e2.remove(437098);
		Set<Entry<Integer,String>> s2=e2.entrySet();
		Iterator<Entry<Integer,String>> mn2=s2.iterator();
		while(mn2.hasNext()) {
			Entry<Integer,String> p2=mn2.next();
			System.out.println(p2.getKey()+" :"+ p2.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("replace method_-the value vedangi is replace by manasi");
		e2.replace(123456, "manasi");
		Set<Entry<Integer,String>> s3=e2.entrySet();
		Iterator<Entry<Integer,String>> mn3=s3.iterator();
		while(mn3.hasNext()) {
			Entry<Integer,String> p3=mn3.next();
			System.out.println(p3.getKey()+" :"+ p3.getValue());
			}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//Returns the value to which the specified key is mapped
		System.out.println("get method");
		System.out.println(e2.get(127456 ));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("size method");
		int size = e2.size();
		System.out.println(size);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("get all values");
		Collection<String> values = e2.values();
		for (String value : values) {
			System.out.println(value);
		}
	}
	
}

