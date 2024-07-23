package com.profound.java_day10;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num of Rows: ");
		int r = sc.nextInt();
		System.out.println("Enter Num of Columns: ");
		int c = sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		System.out.println("-->> ENTER ARRAY ELEMENTS <<--");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.println("Enter array element at arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("-->> OUTPUT ARRAY <<--");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

	}

}
