package com.profound.java_day14;

import java.util.Scanner;

/*
	Write a method to replace all program 'he' with 'she'
	eg.
	He is a programmer
	output: She is a Programmer
 
 */
public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		String str1=str.replaceAll("He", "She");
		System.out.println(str1);
	}

}
