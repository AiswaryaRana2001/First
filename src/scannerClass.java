import java.util.*;


public class scannerClass {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("The entered name is: "+name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("The entered age is: "+age);
		
	}

}
