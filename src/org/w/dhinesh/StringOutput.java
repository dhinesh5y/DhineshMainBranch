package org.w.dhinesh;

public class StringOutput {
	
   public void srmTravels () {
	   int a = 250;
	   int b = 350;
	   String s = " rupees"; // String Value Use Last of Sysout
	   System.out.println(a+b+s); 
	   // Ex - a+b+s use  // s+a+b Dont use 
	   }
   
   public void kpnTravels () {int a = 250;
   
		 int b = 350;
		 String s = "100";
		 int i = Integer.parseInt(s);
		 // String Value Convert to Integer Value
		 // Integer only take numeric Value not Letters
		 System.out.println(a+b+i);
		 }
   
  public static void main (String[]args) {
		 StringOutput o = new StringOutput();
		 o.srmTravels();
		 o.kpnTravels();
	 }
 }
