//import java.util.Scanner;
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////class Customer {
////  // Write code from here..
////  int id;
////  String name;
////  double walletBalance;
////  String address;
////
////  public Customer(int id,String name,double walletBalance,String address){
////    this.id =id;
////    this.name = name;
////    this.walletBalance=walletBalance;
////    this.address= address;
////  }
////}
////class Item {
////  // Write code from here..
////    int id;
//// 	  String name;
////  	String companyName;
////  	double price;
////  	boolean isInStock;
////
////    public Item(int id,String name,String companyName,double price,boolean isInStock){
////      this.id = id;
////      this.name= name;
////      this.companyName=companyName;
////      this.price=price;
////      this.isInStock=isInStock;
////    }
////}
////
////class ShoppingWebsite {
////  // Write code from here..
////  
////  public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException,InsufficientBalanceException{
////    if(!i.isInStock){throw new ItemOutOfStockException("item is out of stock");}
////    else if(i.price>c.walletBalance) {throw new InsufficientBalanceException("customer wallet balance is not sufficient");}
////    else{return "Order Successful";}
////  }
////}
////
////
////class InsufficientBalanceException extends Exception {
////  InsufficientBalanceException(String message){super(message);}
////  // Write code from here..
////}
////class ItemOutOfStockException extends Exception{
////  // Write code from here..
////   public ItemOutOfStockException(String message){super(message);}
////}
////public class DoSelect10 {
////	public static void main(String args[] ) throws Exception {
////		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
////    Customer cusDet = new Customer(927392, "Steve" ,5000.0, "USA");
////Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
////ShoppingWebsite obj = new ShoppingWebsite();
////try {
////String out = obj.purchaseItem(itemDet, cusDet);
////System.out.println(out);}
////catch(ItemOutOfStockException|InsufficientBalanceException e){
////  System.out.println(e.getMessage());
////}
////}
////}
//
//
//class MovieRatingException extends Exception {public MovieRatingException(String message){super(message);
//	}
//}
//
//class Rating {
//	int imdbRating;
//        int nominee;
//    public Rating(int imdbRating, int nominee){
//		this.imdbRating = imdbRating;
//		this.nominee = nominee;
//
//	}
//}
//
//class Validator {
//
//public static String canBeConsideredForTheAward(Rating rating) throws MovieRatingException{
//		if(rating.imdbRating<7){throw new MovieRatingException("Movie not eligible for Filmfare award");}
//		else if (rating.nominee<4){throw new MovieRatingException("Minimum 4 nominee required");}
//		else{ return "Considered for the award"; }
//	}
//
//public static String sendInvite(Rating rating)throws Exception{
// try{
//	 canBeConsideredForTheAward(rating);
//	 return "Actors and Directors Invited";
//	}catch(MovieRatingException e){ return "Not invited";}
//	catch(Exception e){return "other exception";}}
//
//
//
//public class DoSelect10 {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc = new Scanner(System.in);
//		int imdbRating = sc.nextInt();
//		int nominee = sc.nextInt();
//	Rating rating = new Rating(imdbRating,nominee);
//		Validator validator = new Validator();
//
//try {
//	String result = Validator.sendInvite(rating);
//} catch (Exception e) {
//
//}
//
//catch(MovieRatingException e){System.out.println(e.getMessage());}
//	}
//}
//import java.util.Scanner;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class DoSelect10{
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array size");
//		int size = sc.nextInt();
//		System.out.println("Enter array elements");
//		String designations[] = new String[size];
//		for(int i =0;i<size;i++) {designations[i] = sc.next();}
//		int count = 0;
//		for(String designation:designations)
//		{
//			if(designation.toUpperCase().contains("HR")){
//				
//				System.out.println(designation.toUpperCase());
//				++count;
//				System.out.println("Total "+ count + " designations in HR Department");
//			    }}
//		
//		
//		
//	}
//	}

