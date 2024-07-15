package com.profound.java_day3;
import java.util.Scanner;
public class IfElse_Ladder {
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter City: ");
			String city =sc.next();
			
			if(city.equals("pune"))
			{
				System.out.println("It is pune City");
			}
			else if(city.equals("nashik"))
			{
				System.out.println("It is nashik City");
			}
			else
			{
				System.out.println("Invalid Input!!");
			}
			
			

	}

}
