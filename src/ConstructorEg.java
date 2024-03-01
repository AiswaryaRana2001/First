class Aa{
	int i = 4;
	
	Aa(int i){
		this.i = i;
		System.out.println("inside");
	}
	//same name as class and no method type
	Aa(){}
}

public class ConstructorEg {
	public static void main(String[] args) {
		
		Aa a = new Aa(10);
		System.out.println(a.i);
		
		Aa a2 = new Aa();
		System.out.println(a2.i);
		
	}

}
