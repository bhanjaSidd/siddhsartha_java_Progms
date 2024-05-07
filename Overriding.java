package mkt;



class Kochi{
	
	void add(){
		System.out.println("Kochi");
	}
	
}

public class Overriding extends Kochi {
	
	void add(){
		System.out.println("Main");
		super.add();
	}

	public static void main(String[] args) {
		
		
		Overriding o=new Overriding();
		o.add();

	}

}
