package com.profound.java_day10;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num of Rows: ");
		int r = sc.nextInt();
		System.out.println("Enter Num of Columns: ");
		int c = sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		
		System.out.println("-->> ENTER ARRAY1 ELEMENTS <<--");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.println("Enter array element at a["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("-->> ENTER ARRAY2 ELEMENTS <<--");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.println("Enter array element at b["+i+"]["+j+"]");
				b[i][j]=sc.nextInt();
			}
		}
		//2 arrays addition
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j]+=b[i][j];
			}
		}
		
		System.out.println("-->> OUTPUT Addition ARRAY <<--");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print("	"+a[i][j]);
			}
			System.out.println();
		}
	}
}
