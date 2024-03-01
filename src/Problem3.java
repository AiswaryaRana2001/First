
/*Read the question carefully and follow the input and output format.

Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.
Input and Output Format :

First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of maximum of odd and even sum.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.

2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.

Include a method named maximumSum(int numbers[], int size) whose return type is an integer.

*/
import java.io.*;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Problem3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        // Output the variable to STDOUT
        System.out.println(a);
        if(a<0)
        {
     	 System.out.println("Invalid array size");
     	   System.exit(0);
        }
        int array[] = new int[a];
        for(int i = 0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        for(int i = 0; i < array.length;i++){
            if(array[i]<0)
       
            {System.out.println("Invalid input");
            System.exit(0);}
            }
            
        
      
        Problem3.maximumSum(array, a);
        
   }

   public static int maximumSum(int numbers[], int size){

       int evenSum=0;
       int oddSum =0;
       int max=0;
       for (int i = 0; i< numbers.length; i++)
       {
    	  
           if(numbers[i]%2 == 0)
           {
           
           evenSum = evenSum + numbers[i];}
           
           if(numbers[i]%2 != 0)
          
           {oddSum = oddSum + numbers[i];}}
       

           if(oddSum>evenSum)
           {max = max+ oddSum;}
           else 
           {max = max+ evenSum;}
           
           System.out.print(max);
           return max;
           
    	   
      
	
       }
	
           
   } 


