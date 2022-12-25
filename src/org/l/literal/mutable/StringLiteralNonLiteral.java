package org.l.literal.mutable;

public class StringLiteralNonLiteral {
	

	public static void main(String[] args) {
		
		System.out.println("---------------");
		// Literal String
		String s1 = "DHINESH";
		String s2 = "DHINESH";
		
		System.out.println("Literal String:");
                        // Find Memory storage use this
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("---------------");
		// Non Literal String
		String s3 = new String ("DHINESH");
		String s4 = new String ("DHINESH");
		
		System.out.println("Non Literal String:");

		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
	}
}
