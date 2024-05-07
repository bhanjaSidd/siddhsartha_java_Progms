package mkt;




public class Thiscalling {
	
	Thiscalling(){
		this(2);
		System.out.println("Sidd");
	}
	Thiscalling(int a){
		this(678765l);
		
		System.out.println(a);
		
	}
	Thiscalling(long a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Thiscalling();
		
	}

	}


