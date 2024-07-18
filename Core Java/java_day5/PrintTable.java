package com.profound.java_day5;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int num = sc.nextInt();
		int i=1;
		System.out.println("The Table of "+num+" is given below: ");
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}

	}

}
