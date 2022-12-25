package org.h.constructor;

public class ConstructorThis {

	public ConstructorThis () {
	    this(31);
		System.out.println("Name - Dhinesh");
	}
	public ConstructorThis (int a) {
		this("Chrompet");
		System.out.println("Age - "+a);
	}
	public ConstructorThis (String b) {
	   this(true);
		System.out.println("Place - "+b);
	}
	public ConstructorThis (boolean c) {
		this ('M');
		System.out.println("Answer - "+c);
	}
	public ConstructorThis (char d) {
		System.out.println("Male - "+d);
	}
	
	public static void main (String[] args) {
		@SuppressWarnings("unused") // unused object
		ConstructorThis C = new ConstructorThis ();
	}
}