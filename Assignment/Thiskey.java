package Assignment;

public class Thiskey {
	
	int a;
	int b;
	public  void add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+"   "+b);
	}

	public static void main(String[] args) {
		Thiskey t=new Thiskey();
		t.add(12, 23);

	}

}
