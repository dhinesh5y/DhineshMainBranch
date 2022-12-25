package org.h.constructor;

public class ConstructorSuper extends ConstructorThis {
	
    public ConstructorSuper () {
    	this('F');
	    System.out.println ("Method: Yes") ;
    }
	public ConstructorSuper (char e) {
	    this (true);
		System.out.println ("Female: "+e) ;
	}
	public ConstructorSuper (boolean f) {
		super();
	//	super();  // Parent class Use Extends
		System.out.println ("Result: "+f) ;
	}
	
	public static void main (String[]args) {
		@SuppressWarnings("unused") // unused object
		ConstructorSuper C = new ConstructorSuper ();
	}
}