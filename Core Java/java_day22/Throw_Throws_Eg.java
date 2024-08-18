package com.profound.java_day22;

import java.util.Scanner;

class UserException extends Exception{

	public UserException(String string) {
		super(string);
	}
	
}

public class Throw_Throws_Eg {	
	public static void main(String[] args) throws UserException {
		try
		{
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Ans= "+c);
		}catch (Exception e) {
			throw new UserException("Enable to divide Number!! "+e.getMessage());
		}

	}

}
