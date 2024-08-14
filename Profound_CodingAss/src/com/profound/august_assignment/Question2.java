package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 2 : Write a Program to Remove vowels from a string.
 * Description: Get a string as the input from the user and then remove all the vowel letters from the 
 * string and give the output. 
 * Input remove
 * Output rmv
 */

public class Question2 {
	
	void removeVowels(String s)
	{
		System.out.println("Output String: ");
		char c[]=s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				continue;
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
		
		Question2 ans = new Question2();
		ans.removeVowels(str);
	}

}
