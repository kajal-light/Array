package com.Array;

//import java.util.Scanner;

public class Duplicates {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,3,0};
int i ,j;
		//Scanner sc = new Scanner(System.in);

		//System.out.println("enter the elements");

		//for (i = 0; i < 5; i++) {

		//	arr[i] = sc.nextInt();

		//}
//
		//for ( i = 0; i < 5; i++) {
////
			//arr[i] = sc.nextInt();

			//System.out.println(arr[i]);

		//}

		for ( i = 0; i < 5; i++) {

			for ( j = 1 ; j < 5; j++) {
//
				if (arr[i] == arr[j]) {

					return true;

				} else {

					return false;

				}
			}
		}
		return false;
	}
}
		
			
			
			
			
			

