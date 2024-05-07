package mkt;


class Math{
	
	void add() {
		
		int a=5;
		int b=8;
		int c=a*b;
		System.out.println(c);
	}	
}
public class Supercalling extends Math {
	void add(){
		int a=5;
		int b=8;
		int c=a+b;
		System.out.println(c);
		super.add();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supercalling t= new Supercalling();
		t.add();
		

	}

}
