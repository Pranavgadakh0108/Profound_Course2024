package com.profound.java_day23;

public class Main_Thread extends Thread{
	
	public void run()
	{
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Programmed Thread");
		System.out.println("Thread new name is: "+Thread.currentThread().getName());
		System.out.println("Is thread Alive?= "+Thread.currentThread().isAlive());
	}

	//main thread
	public static void main(String[] args) {
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		Thread.currentThread().setName("MAIN_THREAD");
		System.out.println("Thread new name is: "+Thread.currentThread().getName());
		System.out.println("Is thread Alive?= "+Thread.currentThread().isAlive());
		
		System.out.println("-----------------------------------------------------");
		//thread-1
		Main_Thread t = new Main_Thread();
		t.start();
		//System.out.println(t.currentThread().isAlive());
		
		System.out.println("-----------------------------------------------------");
		//thread-2
		Main_Thread t1 = new Main_Thread();
		t1.start();

	}

}
