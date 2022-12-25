package org.n.arrays;

public class ArraySplit {
	
	public static void main(String[] args) {
		
		    String s = "ABCD EFGH IJKL ";
			
			String[] a =s.split(" "); //use space
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			
			System.out.println("--------");
			
			String[] b = s.split("FG"); // use letter
			System.out.println(b[1]);
			System.out.println(b[0]);

	}
}
