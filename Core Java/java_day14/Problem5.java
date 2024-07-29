package com.profound.java_day14;

import java.util.Scanner;

/*
 * WAP  to remove all digit greater than 5 from String.
 * Example:
 * input: "he is in room 372"
 * output:"he is in room 32"
 */
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		char c[] = str.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			if(Character.isDigit(c[i]))
			{
				if(c[i]>'5')
				{
					continue;
				}
			}
			System.out.print(c[i]);
		}
	}
}
