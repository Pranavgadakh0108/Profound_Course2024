package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 9: Write a Program to Capitalize the first and last letter of each word of a string .
 * Description: Get a string from the user and then change the first and last letter to uppercase.
 * Input programming 
 * Output ProgramminG
 */
public class Question9 {
	
	void capitalizeFL(String s)
	{	
		System.out.println("Output: ");
		char c[] = s.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			c[0]=Character.toUpperCase(c[0]);
			c[c.length-1]=Character.toUpperCase(c[c.length-1]);
			
			if(c[i]==' ')
			{
				c[i+1]=Character.toUpperCase(c[i+1]);
				c[i-1]=Character.toUpperCase(c[i-1]);
			}
		}	
		String answer=String.valueOf(c);
		System.out.println(answer);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question9 ans = new Question9();
		ans.capitalizeFL(str);

	}

}
