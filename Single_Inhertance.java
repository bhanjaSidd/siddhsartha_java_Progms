package mkt;
class Parent1 
{
	void mul()
	{
		int a=5;
		int b=6;
		int c=a*b;
		System.out.println(c);
	}
}
	class Parent extends Parent1
	{
		static int add() 
		{
			int a=7;
			int b=7;
			int c=a+b;
			System.out.println(c);
			return c;
			
		}	
	}
public class Single_Inhertance extends Parent{
	public static void main(String[] args) {
		add();
		Single_Inhertance s1=new Single_Inhertance();
		
	}

}



