import java.util.Scanner;
//public class ExceptionHandling {
//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("Inside try Block");
//			int i = 4/0;
//			System.out.println(i);
//			
//			}catch(Exception e) {
//				e.printStackTrace();
//				System.out.println("Inside Catch Block");
//			}
//	}
//
//}
//------------------------------------------------------------------------------
//import java.util.Scanner;
//public class ExceptionHandling {
//	public static void main(String args[]) {
//		int counter=0;
//		try {
//			Scanner sc= new Scanner(System.in);
//			if (counter==0) {
//				System.out.println("Enter divider but not 0!!");
//			}
//		int divider = sc.nextInt();
//		int dividend = 4;
//		int result= dividend/divider;
//		System.out.println("The result is "+result);
//	}
//	catch (Exception e ) {
//		System.out.println("Inside catch block");
//		System.out.println("I have told you not to give zero");
//		counter++;
//		main(null);
//	}
//
//	}
//}

//public class ExceptionHandling{
//	public static void main(String[] args) {
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter divider but not 0!");
//			int divider = sc.nextInt();
//			int dividend = 4;
//			int result = dividend/divider;
//			System.out.println("The result is " +result);
//			
//			int[] ar = {3,5,1};
//			System.out.println("Enter index of an array");
//			int index = sc.nextInt();
//			System.out.println(ar[index]);
//			
//			System.out.println("Enter the name");
//			String name = sc.next();
//			System.out.println("Enter the index of string ");
//			int indexString = sc.nextInt();
//			System.out.println(name.charAt(indexString));
//			
//			
//			}
//		catch(ArithmeticException e) {
//			System.out.println("Inside Arithmetic Exception");
//			main(null);
//			}
//		catch(IndexOutOfBoundsException e) {
//			System.out.println("Inside IndexOutofBounds Exception");
//			}
//		
//		
//	}
//}----------------------------------------------------------------------------

public class ExceptionHandling{
	public static void main(String[] args) {
		
	}
	public void display() {
		int dividend = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divider");
	}
}