package array;

import java.util.Arrays;

public class String_containes {

	public static void main(String[] args) {
		int count=0;
		 boolean num;
		String name="sunny987";
		char[] ch=name.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			num=Character.isAlphabetic(ch[i]);
			if(num==true) {
				count++;
			}		
			
			
		}System.out.println(count);
		if(count==5) {
			System.out.println("Count is match");
		}
		else {
			System.out.println("Count is not match");
		}
		
		

	}

}
