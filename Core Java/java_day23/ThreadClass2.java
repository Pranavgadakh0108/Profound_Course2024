package com.profound.java_day23;
//WAP to create two Thread & display 1st Thread is even no. & 2nd Thread Odd number 1 to 50
//numbers using thread & exception handling 

class EvenThread extends Thread {
	
	public void run()
	{
		for(int i=2; i<=50; i+=2)
		{
			System.out.println("Even Thread = "+i);
			try 
			{
				Thread.sleep(100);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}

class OddThread extends Thread{
	
	public void run()
	{
		for(int i=1; i<=50; i+=2)
		{
			System.out.println("Odd Thread = "+i);
			try 
			{
				Thread.sleep(100);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadClass2 {
	public static void main(String[] args) {
		EvenThread t1 = new EvenThread();
		t1.start();
		OddThread t2 =new OddThread();
		t2.start();
	}
}
