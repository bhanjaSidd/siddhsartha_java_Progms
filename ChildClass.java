package mkt;
 class Parent123{
	 static void add() 
	 {
		 
		 System.out.println("add method");
	 }
 }
public class ChildClass extends Parent123 {
	 static void sub() 
	 {
		 
		 System.out.println("sub method");
	 }
	public static void main(String[] args) {
		Parent123 p=new ChildClass();
		p.add();
		ChildClass c=(ChildClass) p;
		c.sub();
	
	}

}
