package com.profound.august_assignment;

import java.util.Scanner;

/*
 * Coding Statement 7 : Write a Program to check if String is a palindrome or not.
 * Description: Get an input string from the user and then check whether it is a palindrome string or 
				not. 
	Input noon 
	Output Palindrome 
	Input Talent 
	Output Not a Palindrome
 */
public class Question7 {
	void checkPalindrome(String s)
	{
		String reverse="";
		for(int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Output: ");
	
		if(s.equals(reverse)) {
			System.out.println("This is palindrom string");
		}
		else {
			System.out.println("Not a palindrom string");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		Question7 ans = new Question7();
		ans.checkPalindrome(str);

	}

}
