package org.f.abstraction;

public class FullyAbs3 implements FullyAbs2, FullyAbs1 {

	@Override
	public void iciciBank () {
		System.out.println("ICICI Bank");
	}

	@Override
	public void hdfcBank () {
		System.out.println("HDFC Bank");
	}

	@Override
	public void axisBank () {
		System.out.println("AXIS Bank");
	}

	@Override
	public void sbiBank () {
		System.out.println("SBI Bank");
	}
	
	public void cubBank () {
		System.out.println("CUB Bank");
	}
	
	public static void main(String[] args) {
		FullyAbs3 f = new FullyAbs3 () ;
		f.iciciBank();
		f.hdfcBank();
		f.axisBank();
		f.sbiBank();
		f.cubBank();
		
		System.out.println(" ");
		
		FullyAbs1 f2 = new FullyAbs3 () ;
		f2.iciciBank();
		f2.hdfcBank();

		System.out.println(" ");
		
		FullyAbs2 f1 = new FullyAbs3 () ;
		f1.axisBank();
		f1.sbiBank();
	}
}