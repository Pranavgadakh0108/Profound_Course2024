package com.profound.java_day6;

public class NestedFor {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				for(int k=1; k<=10; k++)
				{
					System.out.print(" "+k);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
