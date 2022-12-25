package org.e.access.modifiers;

public class AccessModifiers extends VariablesBus { // static not use class level
	// static, final use any class, method & variable level
	// (abstract method is hidden purpose)
	
	static int i = 10; // another class aslo use this int 
	static int j = 10; // classname.int
	
    public void pallavaram() {
    	// use static with directly method calling
    	System.out.println(k);
    	}
    public void santorium() {
    	System.out.println(i+j);
    	}
    public final void hasithinapuram() {
    	// final is end of logic
    	// did not use any other class 
    	int a = 20;
    	System.out.println(a+i);
    	}
    
    public static void main(String[] args)  {
//    AccessModifiers am=new AccessModifiers ();
//    	VariablesBus.srm();
////    	VariablesBus.k=20;
//    	System.out.println(k);
//    	VariablesBus v = new VariablesBus();
//    	v.srm();
    	
//    pallavaram();  // directly Method calling
//    am.santorium();
//    am.hasithinapuram();
//    System.out.println(i+i+j+j); 
    }
}

