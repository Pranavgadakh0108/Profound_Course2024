package com.profound.java_day4;

import java.util.Scanner;

public class CheckAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Character: ");
		char c = sc.next().charAt(0);
		
		switch(c) {
		
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' : System.out.println(c+" is a Vowel..");
						break;
			default : System.out.println(c+" is a Consonant..");
		}
	}
}
