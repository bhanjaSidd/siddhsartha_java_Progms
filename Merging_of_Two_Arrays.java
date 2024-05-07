package array;

import java.util.Arrays;

public class Merging_of_Two_Arrays {
	public static void main(String[] args) {
		int[] a= {1,2,8,5};
		int[]b= {8,7,5,9};
		int []c=new int [a.length+b.length];
		int d=0;
		for(int k:a) {
			c[d++]=k;
			
		}System.out.println(Arrays.toString(c));
		
		for(int k:b) {
			c[d++]=k;
			
		}System.out.println(Arrays.toString(c));
		
	}

}
