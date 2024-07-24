package com.profound.java_day11;

import java.util.Scanner;

public class ThisKeyword {
	int num1, num2;
	public ThisKeyword(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		System.out.println("addition= "+(num1+num2));		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUM1 & NUM2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ThisKeyword tk = new ThisKeyword(num1, num2);
	}
}
