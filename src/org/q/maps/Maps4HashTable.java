package org.q.maps;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Maps4HashTable {
	
	public static void main(String[] args) {
		
		System.out.println("Hashtable: Random Order");
		
		Map<Integer, String> m = new Hashtable<Integer, String>();
		m.put(10, "One");
		m.put(20, "Two");
		m.put(30, "Three");
		m.put(40, "Four");
		m.put(50, "Five");
		
		//get()
		String get = m.get(50);
		System.out.println(get);
		
		//keyset
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//value
		Collection<String> value = m.values();
		System.out.println(value);
		
		// entrySet use only for itrate purpose
		Set<Entry<Integer, String>> entry = m.entrySet();
		
		for(Entry<Integer,String> s:entry){
			//System.out.println(s);
			//System.out.println(s.getValue());
			  System.out.println(s.getKey());		
		}
	}

}
