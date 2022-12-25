package org.m.convert.String.Integer;

public class ConvertionStringInteger {
	
	public static void main(String[] args) {
		
		System.out.println("----");
		
		// Integer to String Convertion
		int i =25;
		String s = String.valueOf(i);  // Use valueOf
		System.out.println("Integer to String - "+i+s);
		// not add this value 'i' is string
		
		System.out.println("----");
		
		// String to Integer Convertion
		String s1 = "23";
		int j = 13; // additional value
		int k = Integer.parseInt(s1);  // use parseInt
		System.out.println("String to Integer - "+(k+j));
		// add this value 's1' is Integer
		
		System.out.println("----");		
	}
}
