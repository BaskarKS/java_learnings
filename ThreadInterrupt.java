package com.threads;

public class ThreadInterrupt
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThreadToGetInterrupted threadObj = new MyThreadToGetInterrupted();
		threadObj.start();
		//System.out.println("MainThread Started child Thread and going to sleep for 2secs");
		//Thread.currentThread().sleep(2000);
		//System.out.println("MainThread came out of sleep and Interrrupting child Thread");
		threadObj.interrupt(); //interrupt will be delivered only if the child thread moves to sleep / wait state, wont be delivered while running
	}
}
class MyThreadToGetInterrupted extends Thread
{
		public void run()
		{
			try
			{
				for(int count = 0; count < 5000; count++)
				{
					System.out.println("Child Thread going to sleep for 2secs" + count);
					if (count > 4500)
						sleep(2000);
				}
			} catch (InterruptedException e)
			{
				System.out.println("My Thread got Interrupted");
			}
		}
}