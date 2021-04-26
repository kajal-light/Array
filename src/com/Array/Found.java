package com.Array;

import java.util.Scanner;

public class Found {

	public static void main(String[] args) {
		int arr[] = { -1, 5, 6, 7, 0, 2 };
		Scanner sc = new Scanner(System.in);
		int found = -1;

		System.out.println("enter the number");
		int n = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {

			if (n == arr[i]) found = i;
				
			

		}
		// variable = (condition) ? if case : else case
		String result = (found != -1) ? "Yes, input is present at "+ found : "no";
		System.out.println(result);
		
		int result2 = (found != -1) ?  found : 0;
		System.out.println(result2);
		
		
		if (found != -1) {
			System.out.println("yes no is present at " + found);
		} else {
			System.out.println("no");
		}

		sc.close();
	}
}