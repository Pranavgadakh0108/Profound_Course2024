package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 10: Write a Program to calculate the Frequency of characters in a string.
 * Description: Get a string as the input from the user and find the frequency of characters in the string. 
 * Input 
		program 
	Output 
	The frequency of a is 1 
	The frequency of g is 1 
	The frequency of m is 1 
	The frequency of o is 1 
	The frequency of p is 1 
	The frequency of r is 2
 */
public class Question10 {
	static final int size=26;
	void countFrequency(String s)
	{
		int n = s.length();
		int[] freq = new int[size];
		
		for(int i=0; i<n; i++)
		{
			freq[s.charAt(i)-'a']++;
		}
		
		System.out.println("Output: ");
		for(int i=0; i<n; i++)
		{
			if(freq[s.charAt(i)-'a'] != 0)
			{
				System.out.println("The frequency of "+s.charAt(i)+" is "+freq[s.charAt(i)-'a']);	
				freq[s.charAt(i)-'a']=0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.next();
		
		Question10 ans = new Question10();
		ans.countFrequency(str);

	}

}
