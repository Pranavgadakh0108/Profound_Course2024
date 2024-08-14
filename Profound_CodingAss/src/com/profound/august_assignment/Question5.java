package com.profound.august_assignment;
/*
 * Coding Statement 5 : Write a Program to Count the sum of numbers in string. 
 * Description: Get a string from the user and find the sum of numbers in the string. 
 * Input Hello56 
 * Output 11
 */

import java.util.Scanner;

public class Question5 {
	void SumOfNums(String s)
	{
		int sum=0,a=0;
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				a = Character.getNumericValue(c);
				sum=sum+a;
			}
		}
		System.out.println("Output: "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question5 ans = new Question5();
		ans.SumOfNums(str);

	}
}
