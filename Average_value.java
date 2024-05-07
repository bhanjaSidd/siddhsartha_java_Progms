package array;

import java.util.Arrays;

public class Average_value 
{
public static void main(String[] args) {
	int[]a= {20,40,50};
	int b=0;
	int c;
	for(int i=0;i<a.length;i++) {
		b=b+a[i];	
	}
	System.out.println(b/a.length);
}
}
