package com.cap;
import java.util.*;

public class Mobile{
public static void main(String[] args) {
//	Mobile m = new Mobile();
//	System.out.println(m);
//	System.out.println(m.toString());
//	
//	System.out.println(m.hashCode());
//	System.out.println("------------");
//	Mobile m1 = new Mobile();
//	Mobile m2 = new Mobile();
//	System.out.println(m1.equals(m2));
//	System.out.println(m1==m2);
	
//	String s = "Java";
//	System.out.println(s);
//	
//	String s1 = new String("Java");
//	System.out.println(s1);
//	System.out.println(s1.toString());
//	
//	System.out.println(s.hashCode());
//	System.out.println("----------------");
//	
//	String s3 = new String("Java");
//	String s4 = new String("Java");
//	System.out.println(s3.equals(s4));
//	System.out.println(s3==s4);
//	System.out.println(s3.hashCode());
//	System.out.println(s4.hashCode());
	
//	String s = new String();
//	System.out.println(s);
//	
//	String s1 = new String("java");
//	System.out.println(s1);
//	
//	char ch[] = {'j','a','v','a'};
//	String s2 = new String(ch);
//	System.out.println(s2);
	
//	String s1= "java";
//	String s2= "JaVa";
//	String s3 = "jaVa";
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.equals(s3));
//	System.out.println("---------------------");
//	System.out.println(s1.equalsIgnoreCase(s2));
//	String s = "Software Engineer";
//	System.out.println(s.substring(8));
//	System.out.println(s.substring(8,13));
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a alphanumeric");
//	String st = sc.next();
//	int j=0;
//	char[] ch = st.toCharArray();
//	for(int i =0;i<ch.length;i++)
//	{
//		if(ch[i]>=48 && ch[i]<=57) {
//			j+=ch[i]-48;
//		}
//	}
//	System.out.println(j);
//	
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	
	String st =sc.nextLine();
	char ch[] = st.toCharArray();
	for(int i =0;i<ch.length;i++)
	{
		if(ch[i]>=65 && ch[i]>=90)
		{
			ch[i] = (char) (ch[i]+32);
		}
		else if(ch[i]>=97 && ch[i]<=122)
		{
			ch[i]=(char)(ch[i]-32);
		}
		
	}
	st = new String(ch);
	System.out.println(st);
	
}

}
