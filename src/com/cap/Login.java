package com.cap;
import java.util.*;

public class Login {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a name");
	String name = s.next();
	System.out.println("Enter a pssword");
	int pw = s.nextInt();
	if(name.equalsIgnoreCase("Aiswarya")) {
		if(pw==12345)
		{
			System.out.println("Login Successful");
		}
		else {
			try {
				InvalidPasswordException i = new InvalidPasswordException();
				throw i;
			}catch(InvalidPasswordException e) {
				System.out.println("Invalid Password");
				}
		}
	}else {
		try {
			throw new InvalidIdException();
		}catch(InvalidIdException e) {System.out.println("Invalid ID");}
	}
	
}

}
