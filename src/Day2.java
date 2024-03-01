//
//public class Day2 {
//
//	int i = 4, j = 5, k;
//
//	public static void main(String[] args) {
//
//		Day2 d = new Day2();
//		d.add();
//	}
//
//	void add() {
//		k = i + j;
//		System.out.println(k);
//	}
//
//}

//public class Day2 {
//
//	public static void main(String[] args) {
//
//		Day2 d = new Day2();
//		int returned_v = d.add();
//		System.out.println(returned_v);
//	}
//
//	int add() {
//		int v = 100;
//		System.out.println("I am from add()" + v);
//		return v;//return statement must be the last statement...
//	}
//
//}

//public class Day2 {
//	int i = 4, j = 5, k;
//
//	public static void main(String[] args) {
//
//		Day2 d = new Day2();
//		int rv = d.add();
//		System.out.println(d.k);
//		System.out.println(rv);
//	}
//
//	int add() {
//		int v = 100;
//		v = i * v + j * i;
//		return v;
//		
//	}
//	}

//public class Day2 {
//	
//	public static void main(String[] args) {
//
//	Day2 d = new Day2();
//	d.add(20, 40);
//	}
//	
//
//	void add(int val1, int val2) {
//		int result = val1+val2;
//		System.out.println("Inside add()..."+result);
//	}
//
//}

//public class Day2 
//{
//	int height = 1;
//	int aptitude = 20;
//	int mascularStrength = 10;
//	int firstNo = 4, secondNo = 5;
//	int result;
//
//	public static void main(String args[])
//	{
//
//		Day2 obj = new Day2();
//		
//		System.out.println(obj.height);
//		System.out.println(obj.mascularStrength);
//		System.out.println(obj.aptitude);
//		System.out.println(obj.result);
//		
//		obj.studying();
//		obj.gyming();
//		obj.gyming();
//		obj.gyming();
//		
//		
//		System.out.println("After calling methods");
//		System.out.println(obj.mascularStrength);
//		System.out.println(obj.aptitude);
//		
//	}
//	void playingBasketBall(){height++;}
//	
//	void gyming() {mascularStrength++;}
//	
//	void studying() {aptitude++;}
//	
//	void add() {result = firstNo + secondNo; }
//}

//public class Day2
//{
//	static int firstNo=10;
//public static void main(String[] args) 
//{
//// Day2 d = new Day2();	
// System.out.println(firstNo);
//}
//
//}

//class Arithmetic {
//int i =4;
//}
//
//public class Day2 {
//	int j=5;
//	public static void main(String[] args) {
//		Arithmetic a = new Arithmetic();
//		System.out.println(a.i);
//		
//		Day2 d = new Day2();
//		System.out.println(d.j);
//
//	}
//}

//class Arithmetic {
//int i =4;
//
//}
//
//public class Day2 {
//	int j=5;
//	public static void main(String[] args) {
//		Arithmetic a = new Arithmetic();
//		System.out.println(a.i);
//		
//		Day2 d = new Day2();
//		System.out.println(d.j);
//
//	}
//}


//class Aircraft{
//	int altitude = 0;
//	
//	int fly() {
//		altitude = 35000;
//		return altitude;
//	}
//}
//
//class Human{
//double longitude = 23.45;
//double latitude = 6677.23423;
//double altitude = 0.0;
//void getAltitude() {
//	Aircraft a = new Aircraft();
//	altitude  = a.fly(); 
//}
//
//void walk() {
//	longitude = longitude +10;
//	latitude = latitude + 4565.23;
//}
//}
//
//public class Day2 {
//public static void main(String[] args) {
//	
//	Human h = new Human();
//	System.out.println(h.longitude);
//	System.out.println(h.latitude);
//	System.out.println(h.altitude);
//	
//	h.getAltitude();
//	h.walk();
//	
//	System.out.println(h.longitude);
//	System.out.println(h.latitude);
//	System.out.println(h.altitude);
//}
//
//}


//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car{
//	void streeringWheel() {
//		System.out.println("Inside steering Wheel() of Swift");
//	}
//	}
//public class Day2{
//	public static void main(String[] args) {
//		Swift s = new Swift();
//		s.streeringWheel();
//		s.tyres();
//		
//		Car c = new Car();
//		c.tyres();
//	}
//}

