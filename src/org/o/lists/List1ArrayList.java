package org.o.lists;

import java.util.ArrayList;
import java.util.List;

public class List1ArrayList {
	
	public static void main(String[] args) {
		
		System.out.println("Array List: Inserition Order");
		
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(20); // ArrayList Allow Duplicates
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		List<Integer> a2 = new ArrayList<Integer>();
		a2.add(11);
		a2.add(22);
		a2.add(22); // ArrayList Allow Duplicates
		a2.add(33);
		a2.add(44);
		a2.add(50);
		
		int s = a1.size();
		System.out.println(s);
		
		int g = a1.get(3);
		System.out.println(g);
		
		a1.remove(2);
		System.out.println(a1);
		
		a1.add(2, 20);
		System.out.println(a1);
		
		a1.set(2, 25);
		System.out.println(a1);
		
		boolean b = a1.contains(40);
		System.out.println(b);
		
		int i = a2.indexOf(22);
		System.out.println(i);
		
		int l = a2.lastIndexOf(22);
		System.out.println(l);
		
	//	a1.addAll(a2);
	//	System.out.println(a1);
		
		// removeAll means same value removed
	//	a1.removeAll(a2);
	//	System.out.println(a1);
		
		// same value print
		a2.retainAll(a1);
		System.out.println(a2);
		
		a2.clear();
		System.out.println(a2);

	}
}