package com.profound.java_day23;

public class Thread_Priority extends Thread{
	
	public void run()
	{
		System.out.println("Child Thread..");
		System.out.println("Child thread Priority: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("Main thread old Priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Main thread New Priority: "+Thread.currentThread().getPriority());

		Thread_Priority t = new Thread_Priority();
		t.setPriority(MAX_PRIORITY);
		t.start();
	}

}
