package array;

import java.util.Arrays;
import java.util.Scanner;

public class Size_of_Array {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		String r[]=new String[s1.nextInt()];
		for(int i=0;i<=r.length-1;i++) {
			r[i]=s1.next();
			
			}
		System.out.println(Arrays.toString(r));
	}

}

