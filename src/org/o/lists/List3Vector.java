package org.o.lists;

import java.util.List;
import java.util.Vector;

public class List3Vector {
	
	public static void main(String[] args) {
		
		System.out.println("Vector: ");
		
		List<Integer> l = new Vector<Integer>();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(40);
		
		System.out.println(l);
		
		
		l.remove(4);
	//	System.out.println(l);
		
	}

}
