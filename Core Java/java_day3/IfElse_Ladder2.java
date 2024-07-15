package com.profound.java_day3;
import java.util.Scanner;
public class IfElse_Ladder2 {
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter City: ");
			String city =sc.nextLine();
			
			if(city.contains("pune"))
			{
				System.out.println("It is pune City");
			}
			else if(city.contains("nashik"))
			{
				System.out.println("It is nashik City");
			}
			else
			{
				System.out.println("Invalid Input!!");
			}
			
			

	}

}

