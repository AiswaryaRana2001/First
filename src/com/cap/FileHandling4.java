//package com.cap;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileHandling4 {
//	public static void main(String[] args) {
//		
//		String path = "C:\\hello/hello.txt";
//		File f = new File(path);
//		FileReader fr = null;
//		try 
//		{
//			fr = new FileReader(path);
//			int size = (int)f.length();
//			System.out.println(f.length());
//			char[] ch = new char[size];
//			fr.read(ch);
//			System.out.println(ch);
//			System.out.println("reading data is completed");
//			fr.close();
//			
//		}catch(IOException e) 
//		{
//			System.out.println("Error in reading the file");
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//}
