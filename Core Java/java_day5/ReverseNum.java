package com.profound.java_day5;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num: ");
		int num = sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int rem = num%10; 
			rev=rev*10+rem;		
			num=num/10;			
		}
		System.out.println(rev);
	}

}
