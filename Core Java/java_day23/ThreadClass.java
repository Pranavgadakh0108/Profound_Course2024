package com.profound.java_day23;

public class ThreadClass extends Thread{
	
	public void run()
	{
		System.out.println("Thread Run Succefully!!!");
	}

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		t1.start();
		
		ThreadClass t2 = new ThreadClass();
		t2.start();

	}

}
