package org.b.datatypes;

public class DataTypes {
	
public void ebReadings () {
    
    byte eb1 = 45; // upto 127
    byte eb2 = 23;

    short wire1 = 12345; // 5 digits
    short wire2 = 23456;
    
    int mobile = 1234567890; // 10 digits & put l
   
    long contact = 123456789123456789l; // more than 10 digits
    
    float weight1 = 255.1245335f; // decimal total 8 value only & put f
    
    double weight2 = 452.52454645222; // decimal more values
    
    char maleFemale = 'M'; // letter symbols
    
    String password = "java@*>>"; // Non Primitive data type
    
    boolean sunrise = true; // ture or false 
    	
	System.out.println(eb1+" units");
	System.out.println(eb2+" units");
	System.out.println(wire1+" meter");
	System.out.println(wire2+" meter");
	System.out.println("Mobile - "+mobile);
	System.out.println(contact+" persons");
	System.out.println(weight1+" grams");
	System.out.println(weight2+" kilo grams");
	System.out.println(maleFemale);
	System.out.println(password);
	System.out.println(sunrise);
}
   public static void main(String[]args){
	   DataTypes main = new DataTypes();
	   main.ebReadings();
}
}
