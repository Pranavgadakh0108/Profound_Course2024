package com.profound.august_assignment;
/*
 * Coding Statement 8 :Write a Program to Remove brackets from an algebraic expression. 
 * Description: Get an algebraic expression as input from the user and then remove all the brackets in
				that.
 	Input 7x+(2*y) 
	Output 7x+2*y
 */

import java.util.Scanner;

public class Question8 {
	void removeBrackets(String s)
	{
		System.out.println("Output: ");
		char c[]= s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			if(c[i]=='(' || c[i]==')'|| c[i]=='['|| c[i]==']'|| c[i]=='{'|| c[i]=='}')
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
		
		Question8 ans = new Question8();
		ans.removeBrackets(str);

	}

}
