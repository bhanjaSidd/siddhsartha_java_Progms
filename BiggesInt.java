package array;

public class BiggesInt {

	public static void main(String[] args) {
		int []a= {12,37,87,90,5};
		int big=a[0];
		for(int k:a) {
			if(k<big) {
				big=k;
			}
			
		}System.out.println(big);

	}

}
