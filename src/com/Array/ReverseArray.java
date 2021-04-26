package com.Array;

import java.util.Scanner;
//Program to reverse an array 
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter tha elemnt of an array");
		for (i = 0; i < 5; i++) {

			arr[i] = sc.nextInt();

		}

		System.out.println("element in reverse order");

		for (i = 4; i >= 0; i--) {

			System.out.println(arr[i]);
		}
	}
}