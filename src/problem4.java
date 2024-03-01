

// Class name should be "Source",

// otherwise solution won't be accepted
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class problem4 {
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
            System.out.println("Number too small");
            }
        else if (a>32767)
        {
            System.out.println("Number too large");
            }
        else if ((a&(a-1))==0)
        {
            System.out.println("Yes");
            }
        else {
            System.out.println("No");
            }
    }
	}