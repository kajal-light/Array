package com.Matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the vaule in a");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				a[i][j] = sc.nextInt();

			}
		}
		System.out.println("enter the vaule in b");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				b[i][j] = a[j][i];

			}
		}
		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.print(b[i][j]+" ");

			}System.out.println();
		}

	}

}
