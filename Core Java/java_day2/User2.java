package com.profound.java_day2;
import java.util.Scanner;
public class User2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Only one Character: ");
		String s=sc.next();
		
		if(s=="a"||s=="e"||s=="i"||s=="o"||s=="u"||s=="A"||s=="E"||s=="I"||s=="O"||s=="U")
		{
			System.out.println(s+" is vowel");
		}
		else
		{
			System.out.println(s+" is consonant");
		}
	}
}
