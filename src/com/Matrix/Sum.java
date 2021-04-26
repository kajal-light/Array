package com.Matrix;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mata[][] = new int[3][3];
		int matb[][] = new int[3][3];

		int matc[][] = new int[3][3];

		int i, j;
		Scanner sc = new Scanner(System.in);
		// taking no for matrix a
		System.out.println("enter the vaule in mata");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				mata[i][j] = sc.nextInt();

			}

		}
		//// taking no for matrix b
		System.out.println("enter the vaule in matb");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				matb[i][j] = sc.nextInt();

			}

		}

//adding matrix a and matrix b

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				matc[i][j] = mata[i][j] + matb[i][j];

			}

		} // printing  additin in mat c
		System.out.println("sum of the matrix");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.println(matc[i][j]);

			}

			System.out.println();

		}

	}
}
