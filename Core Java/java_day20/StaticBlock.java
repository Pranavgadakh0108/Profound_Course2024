package com.profound.java_day20;

import java.util.Scanner;

public class StaticBlock {
	
	static
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition= "+c);
	}

	public static void main(String[] args) {
	}

}
