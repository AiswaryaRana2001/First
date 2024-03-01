package com.cap;
public class A2{
	void Product(String product){System.out.println(product);}
	void Product(String product,int cost) {System.out.println(product + " "+ cost);}
	void Product(int cost,String product) {System.out.println(cost + " " + product);}
	
	public static void main(String[] args) {
		
		A2 a = new A2();
		a.Product("Watch");
		a.Product("Watch", 400);
		a.Product(400,"Phone");
		
	}
}