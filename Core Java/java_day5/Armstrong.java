package com.profound.java_day5;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		
		int sum=0, count=0, rem=0, temp;
		
		temp = num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		num =temp;
		while(num>0)
		{
			rem=num%10;
			sum = (int) (sum+ Math.pow(rem, count));
			num=num/10;
		}
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
//1634
