package com.profound.java_day4;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		
		switch(num) {
				case 1: System.out.println("It is One");
						break;
				case 2: System.out.println("It is Two");
				   		break;
				case 3: System.out.println("It is Three");
				 		break;
				default: System.out.println("Invalid Input...");
		}
	}
}
