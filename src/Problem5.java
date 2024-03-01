import java.util.*;
/*Read the question carefully and follow the input and output format.

In a company there are some managers working on two different projects (MetLife and Hardfort). 
When the feedback was taken their feedback was present in both 
MetLife Feedback as well as Hardfort Feedback. 
Write a method to create a consolidated feedback for the managers for MetLife and HardForts. 
For those working on both the projects the highest feedback is taken. 
In the 2 given arrays, the First Index represents the Employee id and second one Represents 
The Feed Back Score and so on....

Input and Output Format:

First line corresponds to n, the size of the array. 
The next n lines correspond to the elements of the first array. 
The next n lines correspond to the elements in the second array. 
Output corresponds to the consolidated feedback score.

1) Print "Invalid array size" when size of the array is a negative number and
 terminate the program

2) Print "Invalid input" when there is any negative number available in the 
input array and terminate the program



Include a method named highestFeedBack(int metlife[],int hardfort[],int size) whose return type is void.

The output array is stored in a global variable named fedback.*/


// Class name should be "Source",
// otherwise solution won't be accepted
public class Problem5 {
	int fedback[];
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        // Output the variable to STDOUT
        System.out.println(a);

        int ar1[] = new int[a];
        for(int i = 0; i<a; i++)
        {
            ar1[i] = in.nextInt();
            if(a<0)
                break;
                {System.out.println("Invalid array size");}
       }
   

        int ar2[] = new int[a];
        for(int i = 0; i<a; i++)
        {
            ar2[i] = in.nextInt();
            if(a<0)
                break;
                {System.out.println("Invalid array size");}
       }
        }
    
   public void highestFeedBack(int metlife[],int hardfort[],int size) {
       
   }
}

