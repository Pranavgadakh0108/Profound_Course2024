package com.profound.java_day7;
import java.util.Scanner;

public class Factorial {
	double f=1;
	int num;
	Scanner sc = new Scanner(System.in);
	
	void fact()
	{
		System.out.println("Enter Any Num: ");
		num=sc.nextInt();
		while(num>0)
		{
			f=f*num;
			num--;
		}
		System.out.println("Factorial is "+f);
	}
	
	public static void main(String[] args) {
		Factorial fc = new Factorial();
		fc.fact();
	}
}
