package com.profound.java_day21;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter 2 Numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Ans= "+c);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			System.out.println("Succefully Executed!!!");
		}

	}

}
