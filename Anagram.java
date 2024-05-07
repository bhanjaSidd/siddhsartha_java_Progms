package array;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="beard";
		String s1="brgjhjead";
		if(s.length()==s1.length()) {
			System.out.println("arrays is not equal");
		}
		
		else {
		
		char[] c1=s.toCharArray();
		char[] c2=s1.toCharArray();
	
		Arrays.sort(c2);
		Arrays.sort(c1);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Given string is anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
		
		
	}

}
}