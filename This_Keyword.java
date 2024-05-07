package mkt;
class This_use{
	
}
public class This_Keyword extends This_use  {
	int a;
	int b;
	int c;
	void add(int a,int b ,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("A is --> "+a+"B is --> "+b+"C is -->"+c);
		
	}
	public static void main(String[] args) {
		This_Keyword t=new This_Keyword();
		t.add(7,88 ,99);
		t.add(5, 98, 76);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		
	}
}
