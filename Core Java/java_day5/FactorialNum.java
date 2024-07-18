package com.profound.java_day5;
import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int fact=1;
		int num = sc.nextInt();
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("factorial is "+ fact);
	}

}
