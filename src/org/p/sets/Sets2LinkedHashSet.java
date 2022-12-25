package org.p.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sets2LinkedHashSet {
	
	public static void main(String[] args) {
		
		System.out.println("LinkedHashSet: Inserition Order");
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(505);
		s.add(40);
		
	//	System.out.println(s);
		
		for (Object a: s){
			System.out.println(a);
	}
	}
}
