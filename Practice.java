package mkt;

public class Practice {
	
	String name;
	int id;
	int age;
		public  Practice(String name,int id,int age) {
			this.name=name;
			this.id=id;
			this.age=age;
			display();
		}
		public void display() {
			System.out.println(name);
			System.out.println(id);
			System.out.println(age);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p=new Practice("rag",7,10);
		
		

	}

}
