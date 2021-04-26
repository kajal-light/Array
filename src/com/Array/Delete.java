package com.Array;

import java.util.Scanner;



//DELETING AN ARRAY BY VAULE

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int element;
		int position = 0;
		boolean found = false;

		int[] arr = new int[50];

		Scanner sc = new Scanner(System.in);

		// taking the size of an array
		System.out.println("enter the array size");

		int n = sc.nextInt();
		// taking the elements for array
		System.out.println("enter" + n + "elements");

		for (i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			// printing the array
		}
		System.out.println("aray");

		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("enter the element");

		element = sc.nextInt();
		for (i = 0; i <= n; i++) {
			if (arr[i] == element) {

				found = true;
				position = i;
				break;

			}

//the element to be deleted
		}
		if (found) {

			for (i = position; i < n - 1; i++) {

				arr[i] = arr[i + 1];

			}

		} else {

			System.out.println("not found");
			// array size get reduces

		}
		System.out.println("array");

		for (i = 0; i <= n - 1; i++) {

			System.out.println(arr[i]);
		}
	}

}
