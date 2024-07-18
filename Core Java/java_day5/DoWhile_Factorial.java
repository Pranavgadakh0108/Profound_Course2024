package com.profound.java_day5;

import java.util.Scanner;

public class DoWhile_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int fact=1;
		int num = sc.nextInt();
		do
		{
			fact=fact*num;
			num--;
		}while(num>0);
		System.out.println("factorial is "+ fact);
	}

}

