package com.Array;

//Write a method named findMaxVal() to find the maximum integer value stored in an Array of any size.

public class MaxArray {

	public static int findMax(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] abs = { 2, 4, 3, 1, 5 };

		System.out.println("MAX VALUE IS:" + findMax(abs));

	}
}