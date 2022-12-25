package org.e.access.modifiers;

 public class VariablesBus {
	
    static int k = 50; // Static Variable use Any where in class
                       // using system.out.println(i)
    
	static int t = 950;  // Global Variable use All Method in this Class
	
		public static void srm () {
			int s = 750; // Local Variable use this Method only
		System.out.println("Kumbakonam - " +s);
	}
	    public void kpn () { // Using local Variable
	    int k = 850;
	    System.out.println("Thanjavur - " +k);
    }
	    public void srs () { // using Golbal Variable
		    System.out.println("Trichy - " +t);
	}
	    public void ybm () { // using Golbal & Local Variable
	    	int y = 200;  
		    System.out.println(y+t);
	}
	    public static void main(String[]args) {
//	    	VariablesBus v = new VariablesBus();
//	    	srm();
//	    	v.kpn();
//	    	v.srs();
//	    	v.ybm();
//	    	System.out.println(i+t); // Static Variable Use after object syntax 
	    }
}
