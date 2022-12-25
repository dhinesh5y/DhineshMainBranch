package org.c.scanner;

import java.util.Scanner; // use utill scanner 

public class ScannerTypes {  // Scanner Types

	public static void main(String[]args){
	@SuppressWarnings("resource")//unused object
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Name");
	String j =s.nextLine();  // nextline 1st use this code
	System.out.println("Name: "+j);
	
	System.out.println("Father Name");
	String a =s.next();   // next 2nd use this code
	System.out.println("Father: " +a);
	
	System.out.println("Enter Roll Num");
	byte b =s.nextByte();
	System.out.println("Roll Num: " +b);
	
	System.out.println("Enter Age");
	int c =s.nextInt();
	System.out.println("Age "+c);
	
	System.out.println("Birth Year");
	short d =s.nextShort();
	System.out.println("Birth Year: "+d);
	
	System.out.println("Pin Number");
	long e =s.nextLong();
	System.out.println("PIN: "+e);
	
	System.out.println("enter Mark");
	float f =s.nextFloat();
	System.out.println("Mark: "+f);
	
	System.out.println("Percentage");
	double g =s.nextDouble();
	System.out.println("Percentage: "+g);
	
	System.out.println("Details True or False ");
	boolean h =s.nextBoolean();
	System.out.println("Details: "+h);
}
}