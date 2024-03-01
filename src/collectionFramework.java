import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.print.DocFlavor.STRING;

public class collectionFramework {
public static void main(String[] args) {
//	List<String> l = new ArrayList<>();
//	l.add("Aiswarya");
//	l.add("Rana");
//	l.add("Durgapur");
//	l.add("Kolkata");
//	l.add("Bangalore");
//
//	System.out.println(l);
//
//	l.remove(3);
//	System.out.println(l);
//	System.out.println(l.get(2));
//	
//	 Iterator<String> itr=l.iterator();//getting the Iterator  
//	  while(itr.hasNext()){//check if iterator has the elements  
//	   System.out.println(itr.next());//printing the element and move to next  
//	  }
//	
//	  List <Integer> li = new ArrayList <Integer>();
//	  li.add(10);
//	  li.add(20);
//	  li.add(30);
//	  li.add(40);
//	  li.add(80);
//	  li.add(90);
//	  li.add(50);
//	  
//	  System.out.println(li);
//	  for(Integer n:li)
//	  {
//		  System.out.println(n);
//	  }
//	  System.out.println("Returning element: "+li.get(1));//it will return the 2nd element, because index starts from 0  
//	  //changing the element  
////	  li.set(2,100);  
//	  System.out.println(li);
////	  Collections.sort(li);  
//	  
//	  System.out.println("Traversing list through List Iterator:");  
//      //Here, element iterates in reverse order  
//	  ListIterator <Integer> i = li.listIterator(li.size());
//	  while(i.hasPrevious()) {
//		  System.out.println(i.previous());
//	  }
//	  
//	  System.out.println("Traversing list through For Loop:");  
//      for (int j = 0; j<li.size();j++)
//      {
//    	  System.out.println(li.get(j));
//      }
//	  
	List l = new ArrayList();
//	l.add(10);
//	l.add(11.22);
//	l.add(11.22);
//	l.add("java");
//	l.add("java");
//	l.add(null);
//	l.add('$');
	
	l.add(10);
	l.add(20);
	l.add(30);
	
	System.out.println(l);
	LinkedList l2 = new LinkedList(l);
	l2.add(30);
	l2.add(40);
	System.out.println(l2);
	Vector v = new Vector(l2);
	v.add(50);
	v.add(60);
	System.out.println(v);
	LinkedList l3 = new LinkedList(v);
	l3.add(70);
	l3.add(80);
	System.out.println(l3);
	
	for(Object o: l3) {
	System.out.println(o);}
	

	ArrayList <Integer> i = new ArrayList<Integer>();
	i.add(100);
	i.add(200);
	i.add(300);
	i.add(400);
	for(Integer a: i) {System.out.println(a);}
	System.out.println("--------------------------");
	
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("java");
	ll.add("sql");
	ll.add("web");
	for (String n: ll) {System.out.println(n);}
	
	LinkedHashSet<String> h = new LinkedHashSet();
	h.add("java");
	h.add("java");
	h.add("sql");
	h.add("sql");
	h.add("web");
	System.out.println(h);
	
	for(String st:h) {
		System.out.println(st);
	}
	System.out.println(h.size());
//	
//	System.out.println(l);
//	l.add(1,50);
//	System.out.println(l);
//	l.add(2,60);
//	System.out.println(l);
//	
//	for(Object o: l) {
//		System.out.println(o);
//	}
//	for(int i = 0;i<l.size();i++) {
//		System.out.println(l.get(i));
//	}
//	System.out.println("-------------------------------------");
//	Collections.sort(l);
//	System.out.println(l);
//	for(int i =0;i<l.size();i++) {
//		System.out.println(l.get(i));
//	}
	
//	
//	System.out.println(l);
//	System.out.println(l.size());
//	System.out.println(l.get(2));
//	System.out.println(l.contains(20));
//	System.out.println(l.contains(999));
//	System.out.println(l.indexOf(10));
//	System.out.println(l.lastIndexOf(10));
//	System.out.println(l);
//	System.out.println(l.remove(1));
//	System.out.println(l);
//	System.out.println(l.isEmpty());
//	l.clear();
//	System.out.println(l);
	
	
//	for(int i =0;i<l.size();i++) {System.out.println(l.get(i));}
//	System.out.println("---------------------------------");
//	for(int i =l.size()-1;i>=0;i--) {System.out.println(l.get(i));}
//	
//	System.out.println(l+ " "+ l.size());
//	LinkedList a =new LinkedList();
//	a.addAll(l);
//	a.add(50);
//	a.add(60);
//	System.out.println(a + " " + a.size());
//	System.out.println(a.containsAll(l));
//	System.out.println(a.removeAll(l));
//	System.out.println(a);
////	
//	comparator interface is used for custom sorting,present in java.util pacakage,it has abstract 
//	method known as compare ()
	
}

	}
