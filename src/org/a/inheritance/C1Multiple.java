package org.a.inheritance;

public class C1Multiple implements C2Mother, C2Father, C2Brother {

	public void childsFlat() {
		System.out.println("Childs Flat");
	}

//	@Override
//	public void flat() {
//		System.out.println("Father Flat");
//	}
//
//	@Override
//	public void flat() {
//		System.out.println("Mother Flat");
//	}
	
	
	
	

	public static void main(String[] args) {
		C1Multiple m = new C1Multiple();
		System.out.println(s);
//		 s=20;
		int a =s;
		 a=1000;
		System.out.println(a);
		m.childsFlat();
	}

@Override
public void flat2() {
	// TODO Auto-generated method stub
	
}

@Override
public void flat3() {
	// TODO Auto-generated method stub
	
}

@Override
public void flat1() {
	// TODO Auto-generated method stub
	
}
}