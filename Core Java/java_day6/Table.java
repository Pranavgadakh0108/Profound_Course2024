package com.profound.java_day6;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER ANY NUM: ");
		int num =s.nextInt();
		System.out.println("THE TABLE OF "+num+" IS GIVEN BELOW: ");
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
		

	}

}
