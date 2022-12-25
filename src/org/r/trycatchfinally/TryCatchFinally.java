package org.r.trycatchfinally;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
	// output should be wrong method that time intimate in console
		
		try {  
			System.out.println(2/0);
			
			try { 
				String s = "Dhinesh";
				System.out.println(s.length());
			}
			catch (Exception e){
				System.out.println("inner try catch error");
			}
		}
		
		catch (ArithmeticException e) {
			System.out.println("Outer try catch Error");
		}
		
		finally {
			System.out.println("Program Over");
		}
	}
}
