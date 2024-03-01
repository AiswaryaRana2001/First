
//public class Day1 {
//
//	public static void main(String[] args) {
//		int firstNo = 5;
//		int secondNo = 10;
//		int result = firstNo+secondNo;
//		System.out.println(result);
//		
//	}
//}

//public class Day1 {
//
//	int firstNo = 5;
//	int secondNo = 10;
////	int result = firstNo+secondNo;//logic should be written inside the main method even if it is working
//	
//	public static void main(String[] args) {
//		
//		Day1 d = new Day1();
//		int result = d.firstNo+d.secondNo;
//		
//		System.out.println(result);
//		
//	}
//}

//public class Day1 {
//
//	int firstNo = 5;
//	int secondNo = 10;
//	int result;
//	
//	public static void main(String[] args) {
//		
//		Day1 d = new Day1();
//		d. result = d.firstNo+d.secondNo;
//		
//		System.out.println(d.result);
//		
//	}
//}

//public class Day1 {
//
//	int firstNo = 5;
//	int secondNo = 10;
//	int result;
//	
//	public static void main(String[] args) {
//		
//		Day1 d1 = new Day1();
//		Day1 d2 = new Day1();
//		
//		System.out.println(d1.firstNo);
//		System.out.println(d1.secondNo);
//		System.out.println(d1.result);
//		
//		
//		System.out.println(d2.firstNo);
//		System.out.println(d2.secondNo);
//		System.out.println(d2.result);
//		
//		d1.result = d1.firstNo + d1.secondNo;
//		System.out.println(d1.result);
//		
//		d2.firstNo = 100;
//		d2.result = d2.firstNo + d2.secondNo;
//		System.out.println(d2.result);
//		
//	}
//}

//public class Day1 {
//
//	int firstNo = 5;
//	int secondNo = 200;
//	int result;
//	
//	public static void main(String[] args) {
//		
//		Day1 d1 = new Day1();
//		Day1 d2 = new Day1();
//		Day1 d3 = new Day1();
//		
//		d3. result = d1.firstNo+d2.secondNo;
//		
//		System.out.println(d3.result);
//		
//	}
//}


//public class Day1 {
//
//	int firstNo = 5;
//	int secondNo = 200;
//	int result;
//	
//	public static void main(String[] args) {
//		
//		Day1 d1 = new Day1();
//		Day1 d2 = new Day1();
//		Day1 d3 = new Day1();
//		
//		d3. result = d1.firstNo+d2.secondNo;
//		
//		System.out.println(d3.result);
//		
//	}
//}


//public class Day1 {
//
//	int i =4;
//	public static void main(String[] args) {
//		
//		Day1 d1 = new Day1();
//		System.out.println(d1);
//		d1.add();
//		
//	}
//	void add() {
//		int i = 5;
//		System.out.println(this);
//		System.out.println(this.i);//this is used when local and global variable has same name
//		System.out.println(i);
//	}
//}

public class Day1 {

	int i =4;
	public static void main(String[] args) {
		
		Day1 d1 = new Day1();
		Day1 d2 = new Day1();
		//d2.i=10;updated(executes first)
		d1.add();
		d2.add();
		d2.i=10;
		//d2.i=10;not update(executes last)
		System.out.println("After updating");
		d1.add();
		d2.add();
		
		
		
	}
	void add() {
		int i = 5;
		int j = 6;
		
		System.out.println(this.i);//this is used when local and global variable has same name
		System.out.println(i);
		System.out.println(j);
		
	}
}

