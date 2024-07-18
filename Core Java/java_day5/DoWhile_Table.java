package com.profound.java_day5;

import java.util.Scanner;

public class DoWhile_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int num = sc.nextInt();
		int i=1;
		System.out.println("The Table of "+num+" is given below: ");
		do
		{
			System.out.println(num*i);
			i++;
		}while(i<=10);

	}

}
