package mkt;



class Cons{
	 Cons(){
		 System.out.println("1");
	 }
}
class Cons1 extends Cons{
	Cons1(int a){
		System.out.println("2");
		
	}
}
public class Super_Constructor extends Cons1 {
	
	Super_Constructor(){
		super(8);
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_Constructor s=new Super_Constructor();

	}

}
