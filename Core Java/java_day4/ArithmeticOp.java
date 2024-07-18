package com.profound.java_day4;
import java.util.Scanner;

//WAP TO CALCULATE ALL ARITHMATIC OPERATION USING SWITCH STATEMENTS.
public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------>> MENU <<------");
		System.out.println("(+) ADDITION");
		System.out.println("(-) SUBTRACTION");
		System.out.println("(*) MULTIPLICATION");
		System.out.println("(/) DIVISION");
		System.out.println("(%) MOD");
		System.out.println("----------------------");
		
		System.out.println("Enter num1 and num2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter your choice(+,-,*,/,%): ");
		char c = sc.next().charAt(0);
		
		switch(c) {
				case '+': System.out.println("Addition= "+(num1+num2));
				 		  break;
				case '-': System.out.println("Subtraction= "+(num1-num2));
		 		  		  break;
				case '*': System.out.println("Multiplication= "+(num1*num2));
		 		  		  break;
				case '/': System.out.println("Division= "+(num1/num2));
		 		  	 	  break;
				case '%': System.out.println("Mod= "+(num1%num2));
		 		  		  break;
		 		default : System.out.println("Invalid Operator");
		}
	}
}
