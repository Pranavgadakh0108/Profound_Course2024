package com.profound.java_day23;

public class ThreadClass1 extends Thread{
	
	public void run() {
		System.out.println("Thread= "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			ThreadClass1 t = new ThreadClass1();
			t.start();
		}
	}
}
