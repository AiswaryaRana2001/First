/*Write a program which accepts designations in an String array.


Check the given array elements contain “HR” and

display the total number of elements which contains “HR” and display the elements in upper case also.

Display the message as given in Expected output.*/


import java.util.Scanner;
//
//Class name should be "Source",
//otherwise solution won't be accepted
  public class Problem6{
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		String designations[] = new String[size];
		for(int i =0;i<size;i++) {designations[i] = sc.next();}
		int count = 0;
		for(String designation:designations)
		{
			if(designation.toUpperCase().contains("HR")){
				
				System.out.println(designation.toUpperCase());
				++count;
			
			    }System.out.println("Total "+ count + " designations in HR Department");}
		
		
		
	}
	}


