package org.a.inheritance;

import org.w.dhinesh.BasicSchool;

public class BusStandExtends extends BasicSchool {
	
    public void Pallavaram() {
    	System.out.println("Left Side Stop");
    	}
    public void Santorium() {
    	System.out.println("Right Side Stop");
    	}
    public void Hasithinapuram() {
    	System.out.println("Use MIT Bridge");
    	}
    
    public static void main(String[] args) {
    	BusStandExtends BS=new BusStandExtends();
    	BS.Pallavaram();
    	BS.Santorium();
    	BS.Hasithinapuram();
    	BS.classRoom();
    	BS.libraryRoom();
    	BS.staffRoom();
    }
}