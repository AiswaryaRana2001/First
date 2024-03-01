package com.cap;

//public class Program {
//
//static void display() throws InterruptedException
//
//{
//
//for(int i= 1;i<=5;i++)
//
//{
//
//System.out.println(i); 
//
//Thread.sleep(3000);
//
//}
//
//}
//
//public static void main(String[] args) {
//
//try
//
//{
//
//display();
//
//}
//
//catch (InterruptedException e)
//
//{
//
//System.out.println(e.getMessage());
//
//}
//
//}
//
//}

import java.io.FileNotFoundException;
import java.io.FileReader;
public class Program{
	void readData()throws FileNotFoundException{
		FileReader f = new FileReader("abc.txt");
	}
	public static void main(String[] args) {
		Program p = new Program();
		try {
			p.readData();
		}catch(FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
			System.out.println(e.getStackTrace());
			e.getStackTrace();}
	}
}
