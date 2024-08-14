package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 4 : Write a Program to Toggle each character in a string .
 * Description: Get an input string from user and then convert the lower case of alphabets to upper 
				case and all uppercase alphabets into lower case. 
   Input Hello 
   Output hELLO
 */
public class Question4 {
	
	void toggleString(String s)
	{
		System.out.println("Output String: ");
		char c[] = s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			int assci=c[i];
			if(assci>=97 && assci<=122)
			{
				String s1 = Character.toString(c[i]);
				System.out.print(s1.toUpperCase());
			}
			else if(assci>=65 && assci<=90)
			{
				String s1 = Character.toString(c[i]);
				System.out.print(s1.toLowerCase());
			}
			else
			{
				System.out.print(c[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question4 ans = new Question4();
		ans.toggleString(str);
	}
}
