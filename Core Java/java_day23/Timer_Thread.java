package com.profound.java_day23;

import java.util.Scanner;

public class Timer_Thread extends Thread{
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER TIMER MINUTES: ");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("TIMER START FOR "+n+" MINUTE...");
		System.out.println("--------------------------");
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=59; j++)
			{
				try 
				{
					System.out.println("[ "+i+" min:"+j+" sec ]");
					Thread.sleep(1000);
					if(i==n)
					{
						break;
					}
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
		System.out.println("----------->> TIMER STOP <<---------------");
	}

	public static void main(String[] args) {
		Timer_Thread t = new Timer_Thread();
		t.start();

	}

}
