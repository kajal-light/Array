package com.Matrix;

import java.util.Scanner;

public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[][] a = new int[3][3];
				int[][] b = new int[3][3];
				int i, j;
				
				boolean flag=true;
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
				}for (i = 0; i < 3; i++) {

					for (j = 0; j < 3; j++) {
						
						if(b[i][j]!= a[j][i]){
							
							flag=true;
							break;
							}
							
							
							
						}
						
						
					}if(flag) {
						
						System.out.println("Matrix is symmetric");
					}else{
						
						System.out.println("not");
						
					}

		
		
		
		
	}

}
