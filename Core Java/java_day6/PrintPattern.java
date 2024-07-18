package com.profound.java_day6;

//Print this pattern
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class PrintPattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
	
//Print this pattern
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

			for(int i=5; i>0; i--)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(" "+j);
				}
				System.out.println();
			}
	}
}
