package com.Array;

import java.util.Scanner;

public class Inserting {

	//private static final String Sytsem = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		
		int[] arr=new int[50];
		
		Scanner sc=new Scanner(System.in);
		
		//taking the size of an array
		System.out.println("enter the array size");
		
		int n=sc.nextInt();
		//taking the elements for array
		System.out.println("enter"+n+"elements");
		
		for(i=0;i<n;i++) {
			
			
			arr[i]=sc.nextInt();
			//printing the array
		}System.out.println("aray");
		
		
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		//taking the position /num where we want to insert new num
		}System.out.println("enter the position");
		
		int position=sc.nextInt();
		
		System.out.println("enter the vaule");
		int vaule=sc.nextInt();
		//creating space for num
		for(i=n-1;i>=position-1;i--) {
			
			
			arr[i+1]=arr[i];
			
		}//inserting the new num
		arr[position-1]=vaule;
		System.out.println("array after in serstion ");
		
		for( i=0;i<=n;i++) {
			
			
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
