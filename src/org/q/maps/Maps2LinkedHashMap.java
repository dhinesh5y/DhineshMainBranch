package org.q.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Maps2LinkedHashMap {
	
	public static void main(String[] args) {
		
		System.out.println("LinkedHashMap: Inserition Order");
		
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("11", "One");
		m.put(null, "Two");
		m.put(null, "Three");
		m.put("44", null);
		m.put(null, "20");  // value allow duplicate null
		// key allow only 1 null
		
		System.out.println(m);
		//get()
		String get = m.get(null);
		System.out.println(get);
		
		//keyset
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		//value
		Collection<String> value = m.values();
		System.out.println(value);
		
		// entrySet use only for itrate purpose
		Set<Entry<String, String>> entry = m.entrySet();
		
		for(Entry<String,String> s:entry){
			System.out.println(s);
			//System.out.println(s.getValue());
//			  System.out.println(s.getKey());		
		}
	}

}
