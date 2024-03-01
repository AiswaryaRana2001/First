package com.cap;
import java.io.File;

public class FileHandling {
public static void main(String[] args) {
	File f = new File("c:\\hello");
	if (f.exists()==false)
	{
	f.mkdir();//create a folder 
	System.out.println("folder created");
	}
	else
	{
	System.out.println("folder already exist");
	}
	}
	}