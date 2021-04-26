package com.Array;

//Implement a method in Java called sortAsc() which will sort an array of any size
//having integer values in an ascending order and return the sorted array in the output.

public class Sort {

	public static void sortArray(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}

			}

		}
	}

	public static void main(String[] args) {

		int[] array = { 0, 2, 4, 1, 45 };

		System.out.println("Array values before sorting:");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		System.out.println();
		sortArray(array);
		System.out.println("Array values after sorting:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");

		}

	}

}
