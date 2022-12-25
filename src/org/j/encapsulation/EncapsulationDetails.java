package org.j.encapsulation;

public class EncapsulationDetails {
	
	public static void main(String[] args) {
		
		// another class la method (types) irukkum
		// intha class la object creat panni output edukkalam
		
		EncapsulationData dhinesh = new EncapsulationData ();
		dhinesh.setId(123);
		dhinesh.setName("Dhine");
		dhinesh.setPhone(9952077422l);
		System.out.println(dhinesh.getId()+" "+dhinesh.getName()+" "+dhinesh.getPhone());
		
		EncapsulationData raj = new EncapsulationData ();
		raj.setId(456);
		raj.setName("Raj");
		raj.setPhone(9952077452l);
		System.out.println(raj.getId()+"  "+raj.getName()+"  "+raj.getPhone());
		
	}
}