package org.f.abstraction;

public class PartialAbs2 extends PartialAbs1 {
	
	@Override
	public void iciciBank() {
		System.out.println("ICICI Bank");
	}

	@Override
	public void hdfcBank() {
		System.out.println("HDFC Bank");
	}
	
	public void sbiBank () {
		System.out.println("SBI Bank");
	}
	
	public static void main(String[] args) {
		PartialAbs2 p = new PartialAbs2 ();
		p.iciciBank();
		p.hdfcBank();
		p.axisBank();
		p.sbiBank();
		
	}
}