package array;

import java.util.Arrays;

public class Swap_1st_Last {
	public static void main(String[] args) {
		int[]d= {1,2,3,4,5,6};
		int [] b=new int [d.length];
		b[0]=d[d.length-1];
		System.out.println(Arrays.toString(b));
		for(int i=0;i<d.length-2;i++) {
			b[i]=d[i];
		}System.out.println(Arrays.toString(b));
		b[b.length-1]=d[0];
		for(int k:b) {
			System.out.println(k);
		}
	}

}
