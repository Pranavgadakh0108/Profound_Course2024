package com.profound.java_day14;
/*
 * WAP to print following pattern
 * 9
 * 9 7
 * 9 7 4
 * 9 7 4 0
 */
public class Problem2 {

	public static void main(String[] args) {

		int arr[]= {9,7,4,0};
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<=i; j++) {
				System.out.print(" "+arr[j]);
			}
			System.out.println();
		}

	}

}
