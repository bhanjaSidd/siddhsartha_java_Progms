package array;

import java.util.Arrays;

public class Check_Starts {

	public static void main(String[] args) {
		String s="sunny Bhanja";
		System.out.println(s.matches(".*y"));
		String ip="school";
		int res=ip.lastIndexOf('o');
		System.out.println(res);
		String []arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
	}

}
