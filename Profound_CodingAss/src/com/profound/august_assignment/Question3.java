package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 3 : Write a Program to print Length of the string without using str.length() function.
 * Description: Get a string as input from user and print the length of the string without using strlen()function.
 * Input Hello 
 * Output 5
 */
public class Question3 {
	
	void printLength(String s)
	{
		if(s.contains("#"))
		{
			System.out.println("Remove # symbol from given String..");
		}
		else
		{
			String newString = s+"#";
			char c[] = newString.toCharArray();
			int count=0;
			for(char i:c)
			{
				count++;
				if(i=='#')
				{
					break;
				}
			}
			System.out.println("Output (String Length): "+(count-1));
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question3 ans = new Question3();
		ans.printLength(str);

	}

}
