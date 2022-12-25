package org.p.sets;

import java.util.HashSet;
import java.util.Set;

public class Sets1HashSet {
	
	public static void main(String[] args) {
		
		System.out.println("HashSet: Random Order");
		
		Set<Object> s = new HashSet<Object>();
		s.add(true);
		s.add(20);
		s.add("Dhinesh");
		s.add(12.5f);
		s.add(505);
		s.add('M');
		
	//	System.out.println(s);
		
		for (Object a: s){
			System.out.println(a);
			
		}
		
	}

}
/*hashset its a class it will print Random order*/