package com.profound.java_day23;
/*
 * >> Daemon thread run in the background of another thread.
 * >> It provides service to the threads.
 * >> Eg. Garbage Collector, finalizer, signal dispatchers etc.
 * >> We have to create daemon thread before starting the thread.
 * >> If we create daemon thread after starting it, it will throw run-time exception. i.e.IlligalThreadStateException.
 * >> We cannot create main thread as daemon thread.
 * >> Methods: 1) public final void setDemon(boolean b)
 * 			   2) public final boolean isDaemon()
 * >> Daemon Thread life depends on another thread.
 * >> Daemon thread inherits the nature/properties from its Parent Thread.
 * >> JVM kills the Daemon thread after all threads execution.
 * >> Most of the times, Daemon threads has low priority, but we can change its priority according to our needs.
 */


public class Daemon_Thread extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread...");
		}
		else
		{
			System.out.println("Normal Thread...");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread!!!");
		
		Daemon_Thread t = new Daemon_Thread();
		t.setDaemon(true);
		//t.setDaemon(false);
		t.start();

	}

}
