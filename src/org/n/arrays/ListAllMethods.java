package org.n.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethods {
	
	public static void main(String[] args) {
		
		List<Integer> s = new ArrayList<Integer>();
	    s.add(10);
	    s.add(20);
	    s.add(30);
	    s.add(40);
	    s.add(30);
	    
	    System.out.println(s);
	    
	  //  int rm = s.remove(1);
	  //  System.out.println(rm);
	    s.remove(1); // remove 
	    System.out.println(s);
	    
	    int size = s.size(); // value Size
	    System.out.println("size "+size);
	    
	    int a = s.get(1);    // get 1 value
	    System.out.println("Index of 1 - " +a);
	    
	    s.add(1, 15);  // add one vale
	    System.out.println("One Value add "+s);
	    
	    s.set(4, 30);  // last value change 50 to 60
	    System.out.println(s);
	    
	    boolean con = s.contains(15); // value contain check
	    System.out.println(con);
	    boolean con1 = s.contains(12);  // value contain check
	    System.out.println(con1);
	    
	    int i = s.indexOf(30);
	    System.out.println(i);
	    
	    int i1 = s.lastIndexOf(30);
	    System.out.println(i1);
	    
	    int size1 = s.size(); // value Size
	    System.out.println("size "+size1);
	    
	    s.clear();
	    System.out.println(s);
	    
	    
	}	
}
