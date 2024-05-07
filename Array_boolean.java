package array;

import java.util.Scanner;

public class Array_boolean {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        boolean[] arr = new boolean[3];

	        System.out.println("Enter three boolean values (true/false):");

	        for (int i = 0; i < 3; i++) {
	            arr[i] = scanner.nextBoolean();
	        }

	        System.out.println("Array values:");

	        for (int i = 0; i < 3; i++) {
	            System.out.println(arr[i]);
	        }

	        scanner.close();
	    }

	}


