//abstract class Cars{
//	
//	//Abstract is a keyword which is used with the class and with method....
//	//Abstract method says you must not have body to method....
//	//u can have implemented as well as un-implemented in the abstract class....
//	//u can have all methods un-implemented in the abstract class.....
//	//u can have all the methods implemented yet the class is abstract
//	void steeringWheel() {
//		System.out.println("Inside steering wheel().....");
//		
//	}
//	
//	abstract void ac();
//}
//
//class Polo extends Cars{
//	
//	void ac() {
//		System.out.println("Inside AC of the polo");
//	}
//}
//
//
//public class abstraction {
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		polo.steeringWheel();
//		polo.ac();
//		
//		Cars car = new Polo();
//		car.ac();
//		
//		//Cars c = new Cars();//cannot create object with abstract class
//	}
//
//}
