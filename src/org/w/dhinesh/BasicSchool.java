package org.w.dhinesh;

public class BasicSchool { // PascalNotation ClassName

	public void classRoom() { // camelNotation methodName
		System.out.println("1.Class Room");
        }
	public void libraryRoom() {
		System.out.println("2.Library Room");
		}
    public void computerRoom() { 
    	System.out.println("3.Computer Room");
    	}
    public void staffRoom() {
    	System.out.println("4.Staff Room");
    	}
    
    public static void main(String[] args) {
    	BasicSchool e = new BasicSchool ();
    	e.classRoom();
    	e.libraryRoom(); 
    	e.computerRoom();
    	e.staffRoom();
    	}
    }