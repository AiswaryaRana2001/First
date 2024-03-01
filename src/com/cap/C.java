package com.cap;

public class C extends B {
	
	@Override
	public void m1() {
		System.out.println("CG1");
		
	}

	@Override
	public void m3() {
		System.out.println("CG2");
		
	}

	
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		
	}

}
