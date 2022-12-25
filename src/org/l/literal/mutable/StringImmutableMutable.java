package org.l.literal.mutable;

public class StringImmutableMutable {

	public static void main(String[] args) {
		
		System.out.println("---------------");
		// Immutable String
		String s1 = "Dhinesh";
		String s2 = "Raj";
		
		System.out.println("Immutable String:");
                        // Find Memory storage use this
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
		
		String x = s1.concat(s2); // Merge Key Word
		System.out.println(x);
//		System.out.println(System.identityHashCode(x));
	
		System.out.println("---------------");
		// Mutable String
		StringBuffer s3 = new StringBuffer ("Dhinesh");
		StringBuffer s4 = new StringBuffer ("Dhinesh");
		
		System.out.println("Mutable String:");

//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
		          
		StringBuffer y = s3.append(s4); // Merge Key Word
		System.out.println(" "+y);
//		System.out.println(System.identityHashCode(y));
	}
}
