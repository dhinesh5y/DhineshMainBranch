package org.n.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

public static void main(String[] args) {
		
	    // ArrayList Allows Duplicates
		List<Integer> a = new ArrayList<Integer> ();
		a.add(10);
	    a.add(20);
	    a.add(30);
	    a.add(40);
	    a.add(40);
	    
	    System.out.println(a);
	    System.out.println("--------------------");
	  
	    List<Integer> b = new ArrayList<Integer> ();
		b.add(11);
	    b.add(22);
	    b.add(33);
	    b.add(44);
	    b.add(40);
	    
	    System.out.println(b);
	    System.out.println("--------------------");
	
}	
}
