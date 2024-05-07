package mkt;

public class Finally_blockEx {

	public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException a) {
		System.out.println("divide by a valid num");
	}
	finally{
		System.out.println("Thank you for visit ous !!!! visit again");
	}

	}

}
