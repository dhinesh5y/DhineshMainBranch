package org.k.strings;

public class StringOne {
			
	public static void main(String[] args) {
		String s = "Welcome to java";
		String s1 = "    Welcome to java   ";
		//System.out.println(s1);
		
		//length
		int len = s.length();
		System.out.println("Length: "+len);
		
		//equals
		boolean equ= s.equals(s1);
		System.out.println("Equals: "+equ);
		
		//equalsIgnoreCase
		boolean equig = s.equalsIgnoreCase(s1);
		System.out.println("equalsIgnoreCase: "+equig);
		
		//contains
		boolean con = s.contains("ja");
		System.out.println("contains: "+con);
		
		//trim
		String trim = s1.trim();
		System.out.println("trim: "+trim);
		
		//indexof
		int ind = s.indexOf("a");
		System.out.println("Index Of: "+ind);
		
		//LastIndexoF
	    int lastind = s.lastIndexOf("a");
	    System.out.println("Last Index Of: "+lastind);
	    
	    //ToUpperCase
	    String upper = s.toUpperCase();
		System.out.println("ToUpperCase: "+upper);
		
		//ToLowerCase
		String lower = s.toLowerCase();
		System.out.println("ToLowerCase: "+lower);
		
		//startsWith
		boolean start = s.startsWith("Welcom");
		System.out.println("startsWith: "+start);
		
		//endsWith
		boolean end = s.endsWith("jav");
		System.out.println("Ends With: "+end);
		
		//char at
		char ch = s.charAt(0);
		System.out.println("Char At: "+ch);
		
		//subString
		String  sub= s1.substring(15,19);
		System.out.println("Sub String: "+sub);
		
		//replace
		String replace = s.replace("a", "y");
		System.out.println("Replace: "+replace);
		
		//Compare to
		int com = s.compareTo(s1);
		System.out.println("Compare: "+com);
}
}
