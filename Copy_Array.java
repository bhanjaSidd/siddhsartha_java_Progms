package array;

import java.util.Arrays;

public class Copy_Array {
public static void main(String[] args) {
	String[]a= {"12","76","87","98"};
	String []b=new String[a.length];
	
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
		
	}System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(a));
}
}
