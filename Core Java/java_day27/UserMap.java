package com.profound.java_day27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println("Enter record count: ");
		int count = sc.nextInt();
		
		System.out.println("Enter "+count+" records>> ");
		
		for(int i=1; i<=count; i++)
		{
			System.out.println("Enter roll & name of "+i+"th student: ");
			map.put(sc.nextInt(), sc.next());
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("-->> Display Records <<--");
		System.out.println("--------------------------------------------");
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println("Roll= "+m.getKey()+" Name= "+m.getValue());
		}
		System.out.println("--------------------------------------------");
	}

}
