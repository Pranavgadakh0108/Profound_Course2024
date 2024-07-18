package com.profound.java_day5;

import java.util.Scanner;

public class DoWhile_SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int num = sc.nextInt();
		int sum=0, rem=0;
		
		do
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}while(num>0);
		
		System.out.println("sum = "+sum);
		
	}

}
