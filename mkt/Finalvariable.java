package mkt;

public class Finalvariable {
	
static 	final double pi =3.14;
	static int r=3;
	static double k;
	
	public static void area() {
		k=pi*r*r;
		System.out.println(k);
	}
	public static void circumference() {
		k=2*pi*r;
		System.out.println(k);
	}
	public static void main(String[]args) {
		area();
		circumference();
		
	}


}


