package com.profound.java_day3;
//WAP to accept a String from user & to find substring in a given code
import java.util.Scanner;
public class User2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		
		System.out.println("Enter start index & end index of substring: ");
		int start =s.nextInt();
		int end=s.nextInt();
		
		if(start<str.length() && end<str.length())
		{
			System.out.println("Required suubstring: "+ str.substring(start, end));
		}
		else
		{
			System.out.println("Given index out of bound!!!");
		}
		

	}

}
