//package com.cap;
//import java.io.File;
//import java.io.IOException;
//
//public class FileHandling2 {
//	public static void main(String[] args) {
//		File f = new File("C:\\hello/hello.txt");
//		if(f.exists()==false) {
//			try {
//				f.createNewFile();
//				System.out.println("File Created");
//				
//			}catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//		}
//		else {
//			System.out.println("file already exist");
//		}
//		
//	}
//
//}
