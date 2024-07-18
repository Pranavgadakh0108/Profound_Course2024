package com.profound.java_day4;
import java.util.Scanner;

//WAP to accept a number from user and calculate sum of digit using while loop
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		int sum=0,remainder=0;
		while(num>0)
		{
			remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println("Sum= "+sum);

	}

}
