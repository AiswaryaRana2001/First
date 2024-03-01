package com.cap;
import java.util.*;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		System.out.println("Enter an amount");
		int amt = sc.nextInt();
		
		if(amt<=balance) {
			System.out.println("Withdrawl Successfull");
		}
		else 
		{
			try {
				InsufficientBalanceException i = new InsufficientBalanceException();
				throw i;
				//throw new InsufficientBalanceException();
			}catch(InsufficientBalanceException e) {
				System.out.println("Not enough balance");
			}
		}
	}

}
