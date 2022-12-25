package org.n.arrays;

public class ArrayMethod {
	
	public static void main(String[] args) {
		
		// Array Use Integer
		int  a []  = new int[5];
	
		a[0]=15;
		a[1]=25;
		a[2]=35;
		a[3]=45;
		a[4]=55;
//		a[5]=56;
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		System.out.println("----");
		
//		try{
//			System.out.println(a[6]);
//		} catch(ArrayIndexOutOfBoundsException e){
//			System.out.println(e);
//		}
//		// itrate
//		for (int i=0; i<5; i++ ) {
			
		for (int i=a.length-1; i>=0; i-- ) {
			System.out.println(a[i]);
		}
	}
}
