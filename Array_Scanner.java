package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner {
	public static void main(String[] args) {
		
		int f=0;
		int g=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int [] a=new int[sc.nextInt()];
	for(int i=0;i<a.length;i++) {
		System.out.println("enter the values");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	System.out.println("choose the operation to be perform 1 for add,2 for sub,3 for mul,4 for div,5 for mod");
	int o=sc.nextInt();
	switch(o) {
	case 1:{
		for(int k:a) {
			f=f+k;
			System.out.println(f);
		}
	}
	case 2:{
		for(int k:a) {
			f=f-k;
			System.out.println(f);
		}
	}
	case 3:{
		for(int k:a) {
			g=f*k;
			System.out.println(g);
		}
	}
	case 4:{
		for(int k:a) {
			g=g/k;
			System.out.println(g);
		}
	}
	case 5:{
		for(int k:a) {
			g=g%k;
			System.out.println(g);
		}
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	}	
	

}
