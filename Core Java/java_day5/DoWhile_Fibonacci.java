package com.profound.java_day5;

import java.util.Scanner;

public class DoWhile_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any range: ");
		int range = sc.nextInt();
		int i=1, f1=0, f2=1, f3;
		System.out.println("Fibonacci series:" );
		do
		{
			System.out.print(f1+" "); 
			f3=f1+f2;
			f1=f2;
			f2=f3;
			i++;
		}while(i<=range);
	}
}

