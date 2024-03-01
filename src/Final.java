//final class Car{
//	void abc(){}
//	
//	final void tyres() {// This is over ridden
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {//final class cannot be extended
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	void tyres() {//This is overriding method
//		System.out.println("Inside tyres() of Swift");
//		//This is illegal since final method cannot be over ridden
//	}
//	
//}
//
//
//public class Final{
//	public static void main(String[] args) {
//		Car swift = new Swift();
//		swift.tyres();
//		
//	}
//
//}



//class Swift{
//	final int i =10;//final variable cannot be left un-initialized
//	
//	void tyres() {
//		i = 20;//you cannot assign new value to final variable
//		System.out.println("Inside tyres of swift");
//	}
//	
//	}
//public class Final{
//	public static void main(String[] args) {
//		
//		Swift c = new Swift();
//		c.tyres();
//	}
//}


final class Employee  
{    
final String pancardNumber;    
public Employee(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber(){    
return pancardNumber;    
}    
}    
public class Final
{  
public static void main(String ar[])  
{  
Employee e = new Employee("ABC123");  
String s1 = e.getPancardNumber();  
System.out.println("Pancard Number: " + s1);  
}  
}  
