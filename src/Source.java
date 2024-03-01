//import java.util.Scanner;
//
///*Problem Statement - Utility Static Methods
//Complete the static methods in the class Utility as per following requirements
//
//Option 1 : Method fahrenheitToCelcius :
//
//
//
//This method should convert farhenheit in to celcius based on the formula [celcius = (farhenheit - 32) X 5 / 9]
//The method takes farhenheit(double) as input parameter
//Method should return calculated temperature celcius rounded to an integer
//Option 2 : Method getLevel :
//
//
//
//Takes an integer array as input parameter
//Should calculate the sum of all array elements and return a String as per below rules
//HIGH - when sum is greater than or equal to 100, MEDIUM - when sum is greater than or equal to 70, LOW - when sum is less than 70
//
//
//Complete the main method in class Source as below
//
//
//
//Program should take console input and call appropriate methods of Utility class based on the input
//Input and Output sample formats are given below in Example section
//First input should be option 1 or 2. Option 1 is for Celcius calculation;Option 2 for finding Level
//In case of option 1, the second input should be temperature in farhenheit
//In case of option 2, the second input should be number of elements in the array, followed by the array elements
//In case of incorrect option, program should display 'Invalid Option'*/
//
//class Utility {
//	public static int fahrenheitToCelcius(double farhenheit) {
// 
//		double celcius =(farhenheit - 32) * (5 / 9);
//		int c = (int)celcius;
//		System.out.println(c);
//		return c;
//
// 
//	}
//
//	public static String getLevel(int[] array) {
// 
//		int sum =0;
//		String s = "";
//		for(int i = 0;i <array.length; i++)
//		{
//			sum = sum + array[i];
//		}
//		if (sum>=100){
//			return s = "HIGH";}
//		else if (sum>=70) {
//			return s = "MEDIUM";}
//		else if (sum<70){
//			return s = "LOW";}
//		return s;
//	
//	}
//}
//public class Source {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter 1 or 2");
//		int n = s.nextInt();
//		switch (n) {
//		case 1:
//			System.out.println("Enter the temparature");
//			double fahrenheit = s.nextDouble();
//			Utility.fahrenheitToCelcius(fahrenheit);
//			break;
//		case 2:
//			System.out.println("Enter the number of array elements");
//			int a = s.nextInt();
//			int[] arr = new int[a];
//			for (int i =0;i<arr.length;i++) {
//				arr[i] = s.nextInt(); 
//			}
//			Utility.getLevel(arr);
//			break;
//		default:
//			System.out.println("Invalid Option");
//			break;
//		}
//	}
//}
// 

//import java.util.ArrayList;
//import java.util.List;
//public class Source {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> result = new ArrayList<>();
//        if (s == null || s.length() == 0 || p == null || p.length() == 0 || p.length() > s.length()) {
//            return result;
//        }
//        int[] count = new int[26];
//        for (char c : p.toCharArray()) {
//            count[c - 'a']++;
//        }
//        int start = 0, end = 0, counter = p.length();
//        char[] arrS = s.toCharArray();
//        while (end < s.length()) {
//            if (count[arrS[end++] - 'a']-- > 0) {
//                counter--;
//            }
//            if (counter == 0) {
//                result.add(start);
//            }
//            if (end - start == p.length() && count[arrS[start++] - 'a']++ >= 0) {
//                counter++;
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Source source = new Source();
//        String s = "cbaobabacd";
//        String p = "abc";
//        System.out.println(source.findAnagrams(s, p)); // Output: [0, 6]
//    }
//}
//import java.util.TreeMap;
// 
//class Source {
//    TreeMap<String, String> data;
//    public Source() {
//        data = new TreeMap<>();
//    }
//    public String getNumber(String name) {
//        return data.get(name);
//    }
//    public boolean getName(String number) {
//        return data.containsValue(number);
//    }
//    public String putNumber(String name, String number) {
//        try {
//            if (name == null || number == null) {
//                throw new IllegalArgumentException("Name or Number: NULL Exception");
//            }
//            data.put(name, number);
//            return "True";
//        } catch (IllegalArgumentException e) {
//            return e.getMessage();
//        }
//    }
//    public TreeMap<String, String> print() {
//        return data;
//    }
//    public static void main(String[] args) {
//        Source directory = new Source();
//        directory.putNumber("A1", "1111");
//        directory.putNumber("A2", "2222");
//        directory.putNumber("A3", "3333");
//        System.out.println(directory.print());
//        System.out.println(directory.getNumber("A1"));
//        System.out.println(directory.getNumber("A2"));
//        System.out.println(directory.getNumber("A3"));
//    }
//}
 
// Java code to check whether two strings 
// are Anagram or not using HashMap 

//import java.io.*; 
//import java.util.*; 
//
//class Source { 
//
//	// Function to check whether two strings 
//	// are an anagram of each other 
//	static boolean areAnagram(String str1, String str2) 
//	{ 
//
//		HashMap<Character, Integer> hmap1 
//			= new HashMap<Character, Integer>(); 
//		HashMap<Character, Integer> hmap2 
//			= new HashMap<Character, Integer>(); 
//
//		char arr1[] = str1.toCharArray(); 
//		char arr2[] = str2.toCharArray(); 
//
//		// Mapping first string 
//		for (int i = 0; i < arr1.length; i++) { 
//
//			if (hmap1.get(arr1[i]) == null) { 
//
//				hmap1.put(arr1[i], 1); 
//			} 
//			else { 
//				Integer c = (int)hmap1.get(arr1[i]); 
//				hmap1.put(arr1[i], ++c); 
//			} 
//		} 
//
//		// Mapping second String 
//		for (int j = 0; j < arr2.length; j++) { 
//
//			if (hmap2.get(arr2[j]) == null) 
//				hmap2.put(arr2[j], 1); 
//			else { 
//
//				Integer d = (int)hmap2.get(arr2[j]); 
//				hmap2.put(arr2[j], ++d); 
//			} 
//		} 
//
//		if (hmap1.equals(hmap2)) 
//			return true; 
//		else
//			return false; 
//	} 
//
//	// Test function 
//	public static void test(String str1, String str2) 
//	{ 
//
//		System.out.println("Strings to be checked are:\n"
//						+ str1 + "\n" + str2 + "\n"); 
//
//		// Find the result 
//		if (areAnagram(str1, str2)) 
//			System.out.println("The two strings are "
//							+ "anagrams of each other\n"); 
//		else
//			System.out.println("The two strings are not"
//							+ " anagrams of each other\n"); 
//	} 
//
//	// Driver program 
//	public static void main(String args[]) 
//	{ 
//
//		// Get the Strings 
//		String str1 = "geeksforgeeks"; 
//		String str2 = "forgeeksgeeks"; 
//
//		// Test the Strings 
//		test(str1, str2); 
//
//		// Get the Strings 
//		str1 = "geeksforgeeks"; 
//		str2 = "geeks"; 
//
//		// Test the Strings 
//		test(str1, str2); 
//	} 
//} 

 // Java program to Print all pairs of 
// anagrams in a given array of strings
//public class Source
//{
//	static final int NO_OF_CHARS = 256;
//	
//	/* function to check whether two 
//	strings are anagram of each other */
//	static boolean areAnagram(String str1, String str2)
//	{
//		// Create two count arrays and initialize
//		// all values as 0
//		int[] count = new int[NO_OF_CHARS];
//		int i;
//
//		// For each character in input strings, 
//		// increment count in the corresponding 
//		// count array
//		for (i = 0; i < str1.length() && i < str2.length();
//												i++)
//		{
//			count[str1.charAt(i)]++;
//			count[str2.charAt(i)]--;
//		}
//
//		// If both strings are of different length.
//		// Removing this condition will make the program 
//		// fail for strings like "aaca" and "aca"
//		if (str1.length() != str2.length())
//		return false;
//
//		// See if there is any non-zero value in 
//		// count array
//		for (i = 0; i < NO_OF_CHARS; i++)
//			if (count[i] != 0)
//				return false;
//		return true;
//	}
//
//	// This function prints all anagram pairs in a 
//	// given array of strings
//	static void findAllAnagrams(String arr[], int n)
//	{
//		for (int i = 0; i < n; i++)
//			for (int j = i+1; j < n; j++)
//				if (areAnagram(arr[i], arr[j]))
//					System.out.println(arr[i] + 
//					" is anagram of " + arr[j]);
//	}
//
//	/* Driver program to test to print printDups*/
//	public static void main(String args[])
//	{
//		String arr[] = {"geeksquiz", "geeksforgeeks",
//						"abcd", "forgeeksgeeks", 
//						"zuiqkeegs"};
//		int n = arr.length;
//		findAllAnagrams(arr, n);
//	}
//}
// This code is contributed by Sumit Ghosh
// A Simple Java program to count anagrams of a
// pattern in a text.
import java.io.*;
import java.util.*;

public class Source {

	// Function to find if two strings are equal
	static boolean araAnagram(String s1,
							String s2)
	{
		// converting strings to char arrays
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		// sorting both char arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// Check for equality of strings
		if (Arrays.equals(ch1, ch2))
			return true;
		else
			return false;
	}

	static int countAnagrams(String text, String word)
	{
		int N = text.length();
		int n = word.length();

		// Initialize result
		int res = 0;

		for (int i = 0; i <= N - n; i++) {

			String s = text.substring(i, i + n);

			// Check if the word and substring are
			// anagram of each other.
			if (araAnagram(word, s))
				res++;
		}
	
		return res;
	}

	// Driver code
	public static void main(String args[])
	{
		String text = "forxxorfxdofr";
		String word = "for";
		System.out.print(countAnagrams(text, word));
	}
}

