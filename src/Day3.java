//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car{
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//}
//
//public class Day3 {
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();
//		Swift swift = new Swift();
//		Car car2 = new Swift();
//		car1.tyres();
////		car2.steeringWheel();
//		
//		
//	}
//
//}


//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	
//}
//
//public class Day3{
//	public static void main(String args[]) {
//		Swift swift1 = new Swift();
//		Swift swift2 = new Swift();
//		Swift swift3 = new Swift();
//		
//		Swift swifts[]= {swift1,swift2,swift3};
//		for(Swift values: swifts)
//		{
//			System.out.println(values.tyres());
//		}
//		
//	}
//}


//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	
//}
//
//public class Day3{
//	public static void main(String args[]) {
//		Swift swift1 = new Swift();
//		Swift swift2 = new Swift();
//		Swift swift3 = new Swift();
//		
//		Swift swifts[]= {swift1,swift2,swift3};
//		for(Swift values: swifts)
//		{
//			values.tyres();
//			values.steeringWheel();
//		}
//		
//	}
//}
//
//

//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}

//class Swift {
//	int i =4;
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	
//}
//
//public class Day3{
//	public static void main(String args[]) {
//		Swift swift1 = new Swift();
//		Swift swift2 = new Swift();
//		Swift swift3 = new Swift();
//		
//		Swift swifts[]= {swift1,swift2,swift3};
//		for(Swift values: swifts)
//		{
//			
//		}
//		
//	}
//}


//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	
//}
//
//public class Day3{
//	public static void main(String args[]) {
//		
//		Car car1 = new Car();
//		Car car2 = new Car();
//		
//		Swift swift1 = new Swift();
//		Swift swift2 = new Swift();
//		
//		Car[] cars = {swift1,car1,car2,swift2};
//		for(Car car:cars) {
//			car.tyres();
////			car.steeringWheel();
//		}
//	}
//}
//
//class Car{
//	void tyres() {
//		System.out.println("Inside tyres() of Car");
//	}
//}
//
//class Swift extends Car {
//	void steeringWheel() {
//		System.out.println("Inside steeringWheel() of Swift");
//	}
//	
//}
//
//public class Day3{
//	public static void main(String args[]) {
//		
//		Car car1 = new Car();
//		
//		Swift swift1 = new Swift();
//		Swift swift2 = swift1;
////		System.out.println(swift1);
////		System.out.println(swift1);
//		Car car2 = new Car();
//		Car car3 = swift1;
//		//Here i am assigning reference variable and is implicit type casted since upcasting  is automatic
//		
//		//upcasting //implicit
//		System.out.println(car3);
//		System.out.println(car3);
//		System.out.println(swift1);
//		
//		System.out.println("Down Casting..........");
//		Car car = new Swift();
//		Swift swift = (Swift)car;//down casting is not automatic
//		
//		System.out.println(swift1);
//		System.out.println(car);
//		
//		
//		Car[] cars = {car1,swift1,car2,swift2};
//		for(Car c:cars)
//		{
//			car.tyres();
//			
//			if (car instanceof Car) {
//				System.out.println("Instance of Car");
//			}
//			
//			if(car instanceof Swift)
//			{
//				Swift sw = (Swift) car;
//				sw.steeringWheel();
//			}
//		}
//		
//		
//	}
//}
//
//
//
