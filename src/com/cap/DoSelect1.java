
package com.cap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class ExceptionCheck{
	static List<String> numberCheck(String str){
		List <String> list = new ArrayList<String>();
		
		for (int i = 0; i< str.length(); i++)
		{
			try {
			if(Character.isDigit(str.charAt(i))){
				list.add(""+str.charAt(i));
			}
		else {
			String errorstr = "For input string:"+"\""+str.charAt(i)+"\"";
			list.add(errorstr);
		throw new NumberFormatException(); 
		
		}
		
	}
			catch (Exception e) {
				System.out.println("inside catch");
		}
	}
	return list;
}
	static String fileCheck(String filename){
	File file= new File(filename);
	String msg = "FileNotFoundException";
	try{
	if(file.exists()){
	return "File Found";
	}
	else{
	throw new FileNotFoundException();
	}
	}
	catch(Exception e ){
	System.out.println("Inside catch...");
	
	}
	return msg;
	}
	
	}

public class DoSelect1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	
	List <String> l = ExceptionCheck.numberCheck(str);
	System.out.println(l);
	String filename = ExceptionCheck.fileCheck("SumofArray.txt");
	
}
}
