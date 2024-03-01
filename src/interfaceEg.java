//interface A{//All your methods should be un-implemented,you cannot create object of interface
//	//but you  can have objects of its implementation in the reference variable of interface type...
//	
//	void add();
//	void sub();
//	
//}
//class B implements A {
//
//	@Override
//	public void add() {
//		System.out.println("Inside Add of B");
//		
//	}
//
//	@Override
//	public void sub() {
//		System.out.println("Inside Sub of B");
//		
//	}
//	
//	
//}
//
//
//
//public class interfaceEg {
//	public static void main(String[] args) {
//		B b = new B();
//		b.add();
//		b.sub();
//		
////		A a = new A();//This is illegal since interface cannot be instantiatd
//		A a = new B();//Can hold the object of the implementation class
//		a.add();
//	}
//
//}


//-------------------------------------------------------------------------------------------------

//interface A{//All your methods should be un-implemented,you cannot create object of interface
//	//but you  can have objects of its implementation in the reference variable of interface type...
//	
//	void add();
//	void sub();
//	
//}
//
//interface B extends A{
//	void mul();
//}
//class C implements A,B {
//
//	@Override
//	public void add() {
//		System.out.println("Inside Add of B");
//		
//	}
//
//	@Override
//	public void sub() {
//		System.out.println("Inside Sub of A");
//		
//	}
//
//	@Override
//	public void mul() {
//		System.out.println("Inside Mul of B");
//	}
//	
//	
//	
//}
//
//
//
//public class interfaceEg {
//	public static void main(String[] args) {
//		
//		C c = new C();
//		c.add();
//		c.sub();
//		c.mul();
//	}
//
//}
//--------------------------------------------------------------------------------------


//interface A {
//	//You can have implemented methods in interface java 1.8 onwards and that is done with
//	//the help of default or static keywords
//	int i = 5;
//	void add();
//	default void sub() {
//		
//	}
//}
//public class interfaceEg{
//	public static void main(String args[]) {
//		System.out.println(A.i);
//	}
//}
//

