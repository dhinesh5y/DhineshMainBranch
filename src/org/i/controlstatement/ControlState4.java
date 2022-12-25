package org.i.controlstatement;

public class ControlState4 { // condition - if else

	public static void main(String[] args) {
		// loops - for (initialization; condition; increment or decrement)
		int a;
		for (a = 0; a <= 10; a++) {
			if (a == 6) {
				System.out.println("Value is 6");
			} else if (a == 3) {
				System.out.println("Value is 3");
			} else if (a == 5) {
				System.out.println("Value is 5");
			} else if (a == 8) {
				System.out.println("Value is 8");
			} else {
				System.out.println("Wrong Value is " + a);
			}
		}
	}
}