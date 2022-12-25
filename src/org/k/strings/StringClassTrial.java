package org.k.strings;

public class StringClassTrial {
	
	public static void main(String[] args) {
		String s = "DHINESH Raj";
		String s1 = "Raj";
		
		int len = s.length();
		System.out.println("Length - "+len);
		
		boolean eq = s.equals(s1);
		System.out.println("Equals - "+eq);
		
		boolean eqig = s.equalsIgnoreCase(s1);
		System.out.println("Equalignore - "+eqig);
		
		boolean con = s.contains("Ra");
		System.out.println("Contains: "+con);
		
		String[] sp = s.split(" ");
		System.out.println("Split - "+sp[0]);
		System.out.println("Split - "+sp[1]);
		
		String trim = s.trim();
		System.out.println("Trim - "+trim);
		
		int ind = s.indexOf("H");
		System.out.println("Indexof - "+ind);
		
		int lastind = s.lastIndexOf("H");
		System.out.println("LastIndex - "+lastind);
		
		String UpCase = s1.toUpperCase();
		System.out.println("UpperCase - "+UpCase);
		
		String LwCase = s.toLowerCase();
		System.out.println("LowerCase - "+LwCase);
		
		boolean sw = s.startsWith("DH");
		System.out.println("StartsWith - "+sw);
		
		boolean ew = s1.endsWith("j");
		System.out.println("EndsWith - "+ew);
		
		char ch = s.charAt(4);
		System.out.println("Char is "+ch);
	
		String sub = s.substring(1,7); 
		System.out.println("Sub String - "+sub);
		
		String replace = s.replace("a", "i");
		System.out.println("Replace: "+replace);
		
		int com = s.compareTo(s1);
		System.out.println("Compare: "+com);
	}
}