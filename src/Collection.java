import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
//public class Collection {
//	
//	public String toString() {return "Hi, Ais";}
//public static void main(String[] args) {
//	
//	
//	List list = new ArrayList();
//	//reference variable should be of interface type
//	System.out.println(list.isEmpty());
//	System.out.println(list.size());
//	Integer i1 = 4;
//	Integer i2 = 5;
//	
//	list.add(i1);
//	list.add(i2);
//	list.add(10);
//	list.add(3,30);
//	list.add("aiswarya");
//	System.out.println(list.isEmpty());
//	System.out.println(list.size());
//	System.out.println(list);
//	System.out.println(list.get(2)); 
//	
//	for (Object o:list)
//	{System.out.println(o);}
//	
//	List <Integer> a = new ArrayList<Integer>();
//	a.add(10);
//	a.add(20);
//	a.add(30);
//	
////	for(int i = 0; i < list.size(); i++) {
////		System.out.println(list.get(i));
////	}
//	for(int val:a) {System.out.println(val);}
//}
//}

//public class Collection{
//	public static void main(String[] args) {
//		 List<Integer> list1 = new ArrayList<Integer>();
//		 List<Integer> list2 = new ArrayList<Integer>();
//		 
//		 list1.add(3);
//		 list1.add(11);
//		 
//
//		 list2.add(3);
//		 list2.add(11);
//		 System.out.println(list1 == list2);
//		 System.out.println(list1.equals(list2));
//		 
//		 list1.set(1, 21);
//		 System.out.println(list1);
//	}
//}

//class a{ int i =4;
//
//public boolean equals(Object o) {
//	
//	System.out.println("inside equals");
//	a a1 = (a)o;
//	boolean status = false;
//	if(this.i == a1.i) 
//	{status = true;}
//	return status;
//}
//public int hashCode() {return 43;}
//	
//	}
//
//
//public class Collection{
//	public static void main(String[] args) {
//		Set <a> set = new HashSet<a>();
//		a a1 = new a();
//		a a2 = new a();
//		a a3 = new a();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//		System.out.print(set.size());
//	}
//}

class NameSalary{
	int id;
	int salary;
	String name;
	
public NameSalary(int id,String name,int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;	
}
}


public class Collection{
	public static void main(String[] args) {
		
		NameSalary ns1 = new NameSalary(101,"Aiswarya",50000 );
		NameSalary ns2 = new NameSalary(102,"Maddy",55000);
		NameSalary ns3 = new NameSalary(103,"Neha",40000);
		Map<Integer,NameSalary> map = new HashMap<Integer,NameSalary>();
		map.put(ns1.id,ns1);
		map.put(ns2.id,ns2);
		map.put(ns3.id,ns3);
		
		int sal[]=new int[2];
		int i=0;
		Set<Integer> keySet = map.keySet();
		for(int key:keySet) {
			NameSalary ns=map.get(key);
			if(ns.salary>=50000) {
				sal[i]=ns.salary;
				i++;
			}
		}
		for(int h:sal) {
			System.out.println(h);
		}
		
		
		
		
	}
}
