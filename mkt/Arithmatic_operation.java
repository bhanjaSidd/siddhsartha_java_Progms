package mkt;

import java.util.Scanner;

public class Arithmatic_operation {
	
	
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int k ;
	public  void add() {
		k=a+b;
		System.out.println("The addition of two numbers: "+k);
		
	}
public  void sub() {
	k=a-b;
	System.out.println("The substruction of two numbers: "+k);
	}
	
public  void mul() {
	k=a*b;
	System.out.println("The multyplication of two numbers: "+k);
}

public  void div() {
	k=a/b;
	System.out.println("The division of two numbers: "+k);
}
public  void mod() {
	k=a%b;
	System.out.println("The modulus of two numbers: "+k);
}
	public static void main(String[] args) {
		Arithmatic_operation h=new Arithmatic_operation();
		h.add();
		h.sub();
		h.mul();
		h.div();
		h.mod();
		
		
	}

}
