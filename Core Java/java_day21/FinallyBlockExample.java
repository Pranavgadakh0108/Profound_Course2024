package com.profound.java_day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		int a,b;
		float c;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter 2 Nums: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("a/b= "+c);
		}catch (InputMismatchException e) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Error!!! "+e+" ,Please enter correct Input!!! ");
			System.out.println("-----------------------------------------------------------------------");
		}catch (ArithmeticException e) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Error!!! "+e+" ,Please enter correct Input!!! ");
			System.out.println("-----------------------------------------------------------------------");
		}
		finally
		{
			System.out.println("-->> EXCEPTION HANDLED SUCCESSFULLY!!");
		}
		
	}
}
