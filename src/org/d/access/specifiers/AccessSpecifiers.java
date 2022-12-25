package org.d.access.specifiers;

public class AccessSpecifiers { // public, protected, default, private
	
	public void classRoom() {     
		System.out.println("1.Class Room");
		}
	protected void libraryRoom() {
		//its use SamePack ext/obj DifPack ext only
		System.out.println("2.Library Room");
		}
	void computerRoom() { 
		// Only void its default Same Pack ext/obj DifPack not Access
		System.out.println("3.Computer Room");
		}
	private void staffRoom() { // its use this class only
		System.out.println("4.Staff Room");
		}
	
	public static void main(String[] args) { 
		AccessSpecifiers AS = new AccessSpecifiers (); 
		AS.classRoom();
		AS.libraryRoom(); 
		AS.computerRoom();
		AS.staffRoom();
		}	
}