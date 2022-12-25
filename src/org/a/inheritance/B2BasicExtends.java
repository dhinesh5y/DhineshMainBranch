package org.a.inheritance;

public class B2BasicExtends {

	public void classRoom() {
		System.out.println("1.Class Room");
	}

	public void staffRoom() {
		System.out.println("2.Staff Room");
	}

	public static void main(String[] args) {
		B2BasicExtends e = new B2BasicExtends();
		e.classRoom();
		e.staffRoom();
	}
}