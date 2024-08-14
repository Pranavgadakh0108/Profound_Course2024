package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 1 : Write a Program to reverse a string.
 * Description: Get an input string from user and print it in reverse order.
 * Input: Hello 
 * Output: olleH
 */

public class Question1 {
	
	void string_reverse(String s)
	{
		System.out.println("Output String: ");
		char c[]=s.toCharArray();
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question1 ans = new Question1();
		ans.string_reverse(str);
	}
}
