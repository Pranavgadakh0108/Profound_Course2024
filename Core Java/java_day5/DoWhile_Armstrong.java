package com.profound.java_day5;

import java.util.Scanner;

public class DoWhile_Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		
		int sum=0, count=0, rem=0, temp;
		
		temp = num;
		do
		{
			num=num/10;
			count++;
		}while(num>0);

		num =temp;
		do
		{
			rem=num%10;
			sum = (int) (sum+Math.pow(rem, count));
			num=num/10;
		}while(num>0);
		
		if(sum==temp)
		{
			System.out.println(temp+" is an armstrong Number");
		}
		else
		{
			System.out.println(temp+" is NOT an armstrong Number");
		}
	}
}
