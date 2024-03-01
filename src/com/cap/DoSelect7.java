package com.cap;
import java.io.*;
import java.util.*;
class Person{}

class Employee{
  // Define the code here
  String name;
  String projectName;
   int workingHrs;
   int bonus;

   public Employee(String name,String projectName,int workingHrs){
	   this.name = name;
	   this.projectName = projectName;
	   this.workingHrs = workingHrs;
	   this.bonus = 0;
   }
   public String setBonus(){
	   String[] projects = {"web","tech","hack","SD","PD"};
	   

	   for(String p:projects){
	   if(p.equalsIgnoreCase(projectName) && workingHrs>=30)
	   {
		   bonus = workingHrs/10;
		   return "Congrats";
	   } 
} return "Work hard";
   }

}

public class DoSelect7 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String projectName = sc.next();
		int workingHrs = sc.nextInt();
		Employee e = new Employee(name,projectName,workingHrs);
		e.setBonus();
	}
}


























//Task:10
//
//-Implement class Customer according to the above specifications
//
//-Implement class Item according to the above specifications
//
//-Class ShoppingWebsite
//
//String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException:
//
//Throw an ItemOutOfStockException when the item is out of stock with the message "item is out of stock".
//Throw an InsufficientBalanceException when customer wallet balance is not sufficient(Item price is greater than the wallet balance) with the message "customer wallet balance is not sufficient".
//If no exception found then return "Order Successful".
//-class InsufficientBalanceException
//
//define custom exception class InsufficientBalanceException by extending the Exception class.
//define a parameterized constructor with a String argument to pass the message to the super class.
//-class ItemOutOfStockException
//
//define custom exception class ItemOutOfStockException by extending the Exception class.
//define a parameterized constructor with a String argument to pass the message to the super class.
