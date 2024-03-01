//
//public class Feb5 {
//public static void main(String[] args) {
//	char c = 'a';
//	double d = c;
//	System.out.println(d);
//	int a = 10;
//	byte b = (byte) a;
//	System.out.println(b);
//	
//	int m = 237;
//	byte d1 = (byte) m;
//	System.out.println(d1);
//	
//	int feb = 28;
//	String result = feb == 29 ?"leapyear":"normalyear";
//	System.out.println(result);
//	
//	System.out.println(10+20+"Java"+10+20);
//	System.out.println(10+20+"Java"+(10+20));
//}
//}

//public class Feb5{
//	static int a;
//	static
//	{
//		System.out.println("Capgemini1");
//	}
//	public static void main(String[] args) {}
//		
//		static {System.out.println("Capgemini2");}
//		static {System.out.println("Capgemini3");}
//		
//	
//}

//public class Feb5{
//	{
//		System.out.println("multiline");
//		System.out.println("non static");
//		System.out.println("initializer");
//	}
//	Feb5()
//	{
//		System.out.println("CG");
//	}
//	public static void main(String[] args) {
//		Feb5 f = new Feb5();
//	}
//}

//public class Feb5{
//	String brand;
//	int ram;
//	public Feb5(String brand,int ram) {
//		super();
//		this.brand = brand;
//		this.ram = ram;
//	}
//	public void m1() {
//		System.out.println(brand);
//		System.out.println(ram);
//	}
//	public static void main(String[] args) {
//		Feb5 f = new Feb5("Asus",16);
//		f.m1();
//		
//	}
//}

public class Feb5{
	String brand = "Kitkat";
}
class Chocolate extends Feb5{
	String brand1 = "5 star";
	public static void main(String[] args) {
		Chocolate c = new Chocolate();
		System.out.println(c.brand);
		System.out.println(c.brand1);
	}
} 