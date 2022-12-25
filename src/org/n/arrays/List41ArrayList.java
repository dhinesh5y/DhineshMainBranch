package org.n.arrays;

import java.util.ArrayList;
import java.util.List;

public class List41ArrayList {
	
public static void main (String [] args){
	
	// Two Objects a & b
	// Use Methods in addAll, removeAll, retainAll
	
		List<Integer> a = new ArrayList<Integer>(); 
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(40);
		
		System.out.println(a);
		System.out.println("****");
		
		List<Integer> b =new ArrayList<Integer>();
		b.add(11);
		b.add(22);
		b.add(33);
		b.add(44);
		b.add(40);
		b.add(40);
		
		System.out.println(b);
		System.out.println("****");
		
		a.removeAll(b);
		System.out.println(b);
		
		b.removeAll(a);
		System.out.println(a);
		
		
		
	//	a.addAll(b);
	//	System.out.println("add all - "+a);
	//	a.removeAll(b);
	//	System.out.println("remove all - "+b);
	//	a.retainAll(b);
	//	System.out.println("retain all - "+a);		
}
}