package com.cap;

class Meesho {
String product = "electronics";
}
class Flipkart extends Meesho{
	String grocceries="Vegetables";
}
class Ecommerce extends Flipkart{
	String company = "ecommerce";
	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		System.out.println(e.product);
		System.out.println(e.grocceries);
		System.out.println(e.company);
		
	}
} 