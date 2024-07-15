package com.profound.java_day3;
//WAP to accept a string from user & get single character & display it.
import java.util.Scanner;
public class User1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any String: ");
		String s = sc.nextLine();
		
		System.out.println("Enter Any Character Index: ");
		int i =sc.nextInt();
		
		if(i<s.length())
		{
			System.out.println("Character at index "+i+" is : "+s.charAt(i));
		}
		else
		{
			System.out.println("Character index out of bound!!!");
		}
	}

}
