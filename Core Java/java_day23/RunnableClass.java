package com.profound.java_day23;

public class RunnableClass implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread run...!!!");
		
	}

	public static void main(String[] args) {
		
		RunnableClass t = new RunnableClass();
		Thread t1 = new Thread(t);
		t1.start();
		
	}
}
