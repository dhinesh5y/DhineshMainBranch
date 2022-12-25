package org.g.polymorphism;

public class PolyOverLoad {
	
	// Polymorphism Over Loading
	
	public void busCompany (String a) {
		System.out.println("PolyLoad Name: "+a);
		}
    public void busCompany (float b) {
    	System.out.println("PolyLoad Value: "+b);
    	}
    public void busCompany (int c) {
    	System.out.println("PolyLoad No: "+c);
    	}
    public void busCompany (boolean d) {
    	System.out.println("PolyLoad Bus: "+d);
    	}
    
    public static void main(String[] args) {
    	PolyOverLoad ol = new PolyOverLoad () ;
    	ol.busCompany("SRS");
    	ol.busCompany(2.5f);
    	ol.busCompany(123456);
    	ol.busCompany(true);
    }
}