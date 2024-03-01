/*Write a Java program that accepts two integer values from the user and
prints the larger value if both the values are prime numbers.
otherwise it prints smaller value and
it prints 0 if both the values are same.*/

	import java.util.Scanner;

	// Class name should be "Source",
	// otherwise solution won't be accepted
	public class Problem2 {
		public static void main(String args[] ) throws Exception {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT */

			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if(checkNum(a)&&checkNum(b))
			{
				if (a>b){System.out.println(a);}
				else {System.out.println(b);}
			}
			else if(a==b)
			{
				System.out.println("0");
			}
			else 
			{
				if (a<b){System.out.println(a);}
				else {System.out.println(b);}
			}
				
		
				
	}
			
				
			
			

			private static boolean checkNum(int p){
				if (p<1)
				{return false;}

				for( int i = 2;i<p;i++)
				{
					if(p%i==0)
					return false;
				}
				return true;

			

			
		}

		
	}