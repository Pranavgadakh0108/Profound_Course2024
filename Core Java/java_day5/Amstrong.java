package com.profound.java_day5;

import java.util.Scanner;

//wap to accept num from user & check whether no is Armstrong or not
public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Num: ");
		int num = sc.nextInt();
		
		int sum=0,rem=0,temp;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is Armstrong No..");
		}
		else
		{
			System.out.println(temp+" is Not an Armstrong No..");
		}

	}

}
