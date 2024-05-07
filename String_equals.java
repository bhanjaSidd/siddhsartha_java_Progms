package array;

import java.util.Arrays;
import java.util.Scanner;



public class String_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
		System.out.println("default size of array");
		String r[]=new String[s1.nextInt()];
		for(int i=0;i<=3;i++) {
			System.out.println("Enter 1st string");
			r[i]=s1.next();
			
			}
		System.out.println(Arrays.toString(r));
		System.out.println("default size of array");
		String r1[]=new String[s1.nextInt()];
		for(int i=0;i<=3;i++) {
			System.out.println("Enter 2nd string");
			r1[i]=s1.next();
			
			}
		System.out.println(Arrays.toString(r1));
		if( Arrays.equals(r, r1	) ==true) {
			System.out.println("magic");
		}else {
			System.out.println("sorry");
		}
	}
	}


