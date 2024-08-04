package com.profound.java_day20;

import java.util.Scanner;

public class StaticMethod {
	
	static int a,b,c;
	static void Addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition= "+c);
	}

	public static void main(String[] args) {
		Addition();
	}

}
