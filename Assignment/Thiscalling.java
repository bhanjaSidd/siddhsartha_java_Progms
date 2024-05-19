package Assignment;

public class Thiscalling {
	Thiscalling(){
		this(3);
		System.out.println("no parameter");
	}
	Thiscalling(int a){
		this(5,'a');
		System.out.println("Single parameter");
	}
	Thiscalling(int a,char b){
		System.out.println("Double parameter");
	}
	
	

	public static void main(String[] args) {
		Thiscalling t=new Thiscalling();

	}

}
