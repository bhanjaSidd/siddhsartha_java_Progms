package Assignment;
abstract class home{
	abstract void add();
	abstract void sub();
}
public class ConcreteMethod extends home {

	public static void main(String[] args) {
		
		ConcreteMethod c=new ConcreteMethod();
		c.add();
		c.sub();
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("Add method");
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("Sub method");
	}

}
