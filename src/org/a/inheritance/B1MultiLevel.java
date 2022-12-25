package org.a.inheritance;

public class B1MultiLevel extends A1Single {
	
	public void srsBus () {
		System.out.println("1.Pickup Point");
		}
	public void kpnBus () {
		System.out.println("2.Drop Point");
		}
	
	public static void main(String[]args ) {
		B1MultiLevel mi = new B1MultiLevel ();
		mi.srsBus();
		mi.kpnBus();
		mi.Pallavaram();
		mi.Santorium();
	}
}
