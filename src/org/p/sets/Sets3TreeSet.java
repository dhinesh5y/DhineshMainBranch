package org.p.sets;

import java.util.Set;
import java.util.TreeSet;

public class Sets3TreeSet {
	
	public static void main(String[] args) {
		
		System.out.println("TreeSet: Ascending Order");
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(505);
		s.add(40);
		
		System.out.println(s);
		
		for (Object a: s){
			System.out.println(a);
	}
	}
}
/*set is an interface. its a value based. wont allow duplicates
 * tree set its a class it will print ascending order
 * 
 * */