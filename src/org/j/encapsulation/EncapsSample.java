package org.j.encapsulation;

public class EncapsSample {
	
	int id;
	String name;
	long phone;
	
	public void Dhinesh () {
		id = 123;
		name = "Dhinesh";
		phone = 9952077422l;
		System.out.println(id+" "+name+" "+phone);
	}
	public void Raj () {
		id = 456;
		name = "raj";
		phone = 9952077432l;
		System.out.println(id+" "+name+" "+phone);
	}
	public void Suresh () {
		id = 789;
		name = "Suresh";
		phone = 9952077452l;
		System.out.println(id+" "+name+" "+phone);
	}
	
	public static void main(String[] args) {
		EncapsSample e = new EncapsSample ();
		e.Dhinesh();
		e.Raj();
		e.Suresh();
	}

}
