class Arithmetic{
	//overloading method name must be same in same class and argument list must be different but return type might change
	
	void add(int i, int j) {
		System.out.println(i+j);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void add (double i, double j)
	{
		System.out.println(i+j);
	}
	
}




public class overloading {
public static void main(String[] args) {
	Arithmetic a = new Arithmetic();
	a.add(40, 60);
	a.add(20,10, 20);
	a.add(18.5, 45);
}
}
