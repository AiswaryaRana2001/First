/*Substring
 * import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        System.out.println(A.length()+ B.length()) ;
        int res = A.compareTo(B);
        if(res<1)
        {
        	System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+ " " +B.substring(0, 1).toUpperCase()+B.substring(1) );
        
    }
}*/
//--------------------------------------------------------------------------------------------
//Anagrams
//import java.util.Scanner;
//
//public class Solution {
//
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//        if(a.length()!=b.length()){return false;}
//        char[] arrayS1 = a.toLowerCase().toCharArray();    
//        char[] arrayS2 = b.toLowerCase().toCharArray();
//        java.util.Arrays.sort(arrayS1);
//        java.util.Arrays.sort(arrayS2);
//        return java.util.Arrays.equals(arrayS1,arrayS2) ? true : false;
//        
//    }
//
//  public static void main(String[] args) {
//    
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//}--------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

      

        public class Solution {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
                // Write your code here.
                
                String[] stringArray = s.split("[^a-zA-Z]+");
                System.out.println(stringArray.length);
                for (int i = 0; i <stringArray.length ; i++) {
                    System.out.println(stringArray[i]);
                }
                scan.close();
                
            
        

        scan.close();
    }
}
