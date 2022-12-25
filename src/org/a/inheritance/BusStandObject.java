package org.a.inheritance;

import org.w.dhinesh.BasicSchool;

public class BusStandObject { // PascalNotation ClassName
	
    public void pallavaram() { // camelNotation methodName
    	System.out.println("Right Side Stop");
    	}
    public void santorium() {
    	System.out.println("Left Side Stop");
    	}
    public void hasithinapuram() {
    	System.out.println("Use MIT Bridge");
    	}
    public static void main(String[] args) {
    BusStandObject BS=new BusStandObject(); // object creation
    BS.pallavaram();
    BS.santorium();
    BS.hasithinapuram();
    BasicSchool e = new BasicSchool ();  // object creation
    e.classRoom();
    e.libraryRoom();
    e.computerRoom();
    }
}