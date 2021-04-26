package com.Array;

//Implement a Java method that takes an integer size as input and 
//displays a table that represents a Pascal’s triangle using a two-dimensional array.

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 int size = 5;
		        int[][] pascalTr = new int[size][size];
		        int row, col;
		        //assign zero to every array element
		        for (row = 0; row < size; row++)
		            for (col = 0; col < size; col++) 
		             pascalTr[row][col] = 0;
		        //first and second rows are set to 1s
		        pascalTr[0][0] = 1;
		        pascalTr[1][0] = 1;
		        pascalTr[1][1] = 1;

		        for (row = 2; row < size; row++) {
		            pascalTr[row][0] = 1;
		            for (col = 1; col <= row; col++) {
		                pascalTr[row][col] = pascalTr[row - 1][col - 1] + pascalTr[row - 1][col];
		            }
		        }

		        //display the Pascal Triangle
		        for (row = 0; row < size; row++) {
		            for (col = 0; col <= row; col++) {
		                System.out.print(pascalTr[row][col] + " ");
		            }
		            System.out.print("\n");
		        }     
		    }
	}
	
	
	

