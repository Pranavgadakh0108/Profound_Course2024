package com.profound.java_day6;
//find even no. between 1 to 50
public class EvenNum {

	public static void main(String[] args) {
		System.out.println("EVEN NUMBERS FROM 1 TO 50 ARE: ");
		for(int i=1; i<=50; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
