package mkt;

interface Demo{
	void add();
}
interface Demo1 extends Demo{
	void sub();
}

public class Interfac222 implements Demo, Demo1 {

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}
public static void main(String[] args) {
	Interfac222 a=new Interfac222();
	a.add();
	a.sub();
}
}
