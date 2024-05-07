package mkt;

public class Global_Variable {
	
	static int a=10;
	static int b=5;
	static int k;
	public static void add() {
		k=a+b;
		System.out.println(k);
	}
	public static void sub() {
		k=a-b;
		System.out.println(k);
	}public static void mul() {
		k=a*b;
		System.out.println(k);
	}
	public static void div() {
		k=a/b;
		System.out.println(k);
	}
	public static void mod() {
		k=a%b;
		System.out.println(k);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
		
		
		

	}

}
