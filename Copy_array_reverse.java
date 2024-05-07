package array;

import java.util.Arrays;

public class Copy_array_reverse {
	public static void main(String[] args) {
		int []a= {12,37,87,90};
		int []b =new int[a.length];
		int c=0;
		for(int i=a.length-1;i>=0;i--) 
		{
			b[c++]=a[i];
			
		}
		System.out.println("Original array is "+Arrays.toString(a));
		System.out.print("Reverse array is "+Arrays.toString(b));
	}
	}


