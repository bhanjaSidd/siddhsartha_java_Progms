package Assignment;
class Parent{
	static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
}
class Child extends Parent{
	static void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
}
public class EXMultilevelInheritance extends Child {
public static void main(String[] args) {
	EXMultilevelInheritance m=new EXMultilevelInheritance();
	m.add(14,45);
	m.sub(45,23);
}
}
