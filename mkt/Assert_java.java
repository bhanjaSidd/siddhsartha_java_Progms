package mkt;

import java.util.Arrays;
import java.util.Scanner;

public class Assert_java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[]a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter");
			 a[i]=sc.nextInt();
		assert	a[1]==9;
			
		}System.out.println(Arrays.toString(a));
		

	}

}
