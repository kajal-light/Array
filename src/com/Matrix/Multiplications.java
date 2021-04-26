package com.Matrix;

import java.util.Scanner;

public class Multiplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		int i, j, k;
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

				b[i][j] = sc.nextInt();

			}
		}//performing the multiplication operation

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				c[i][j] = 0;
				for (k = 0; k < 3; k++) {

					c[i][j] = c[i][j] + (b[i][k] * a[k][j]);

				}

			}
		}
		System.out.println("enter the vaule in c");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.println(c[i][j]);

			}

		}System.out.println();
	}

}
