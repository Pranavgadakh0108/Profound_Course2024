package com.profound.java_day14;

import java.util.Scanner;

/*
 * Given a sentence containg alphabets and number, print
 * all the digit not present in the sentence
 * eg.
 * input: "234ABC712HJ67890"
 * Output: 5
 */
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
	
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{
				arr[Character.getNumericValue(c)]++;
			}
		}
		System.out.println("Missing Digits: ");
		for(int i=0; i<10; i++)
		{
			if(arr[i]==0)
			{
				System.out.println(i);
			}
		}		
	}
}
