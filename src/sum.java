class Maths{
	int first = 4;
	int second = 5;
	int result;
	
	public void add(Maths a ) {
		
		a.result = first + a.second;
		System.out.println(a.result);
		
	}
}

public class sum {
	public static void main(String[] args) {
	 
		Maths a1 = new Maths();
		a1.first=100;
		a1.second=200;
		a1.add(a1);
		
		
	}

}



