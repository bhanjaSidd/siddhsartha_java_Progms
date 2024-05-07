package array;



public class Name_Rollno_Genderex {
	public static void main(String[] args) {
		
		String []name=new String[3];
		name[0]="RahulG";
		name[1]="Puja M";
		name[2]="Bhanja";
		
		System.out.println("Sname"+"   "+"Srollno"+"   "+"Sgender");
		int []rollno=new int[3];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		
		char []gender=new char[3];
		gender[0]='M';
		gender[1]='F';
		gender[2]='M';
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"     "+rollno[i]+"       "+gender[i]);
		}
		
		
		
		
	}

}
