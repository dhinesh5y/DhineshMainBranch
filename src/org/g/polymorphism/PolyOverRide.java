package org.g.polymorphism;

public class PolyOverRide extends PolyOverLoad {
	
	// Polymorphism Over Ride
	
	@Override
	public void busCompany(String a) {
		super.busCompany(a);
		System.out.println("PolyRide Name: "+a);
		System.out.println("");
	}
	@Override
	public void busCompany(float b) {
		super.busCompany(b);
		System.out.println("PolyRide Value: "+b);
		System.out.println("");
	}
	@Override
	public void busCompany(int c) {
		super.busCompany(c);
		System.out.println("PolyRide No: "+c);
		System.out.println("");
	}
	@Override
	public void busCompany(boolean d) {
		super.busCompany(d);
		System.out.println("PolyRide Bus: "+d);
		System.out.println("");
	}
	public void busCompany (char e) {
		System.out.println("PolyRide: "+e);
	}
	
	public static void main(String[] args) {
		PolyOverRide or = new PolyOverRide();
		or.busCompany("KPN");
		or.busCompany(4.3f);
		or.busCompany(654321);
		or.busCompany(false);
		or.busCompany('Y');
	}	
}