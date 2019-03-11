package com.threads;
public class ThreadInThread
{
	public static void main(String[] args) throws InterruptedException
	{
		CustomThread myThread = new CustomThread();
		//Thread subThread = new Thread(myThread);
		Thread subThread = new Thread(new Runnable() {
			public void run()
			{
				System.out.println("CustomRunnable Called!!!");
			}
		});
		//myThread.start();
		subThread.setPriority(1);// can be set explicitly or the child will carry default priority of 5 which is inherited from parent
		subThread.start();
		//Thread.currentThread().yield(); //voluntarly giving the processor to allow other threads waiting of the same priority. if waiting threads of 
										//low priority then the current thread which called the yield can continue execution
        subThread.join();											
		System.out.println("child thread priority =>" + subThread.getPriority());
		System.out.println("Main Method / Main Thread");
		
		myThread.start();
		myThread.join(10000);// suspent current thread and make it wait for either (myThread completes) or (for 10Secs)
		for(int count = 0; count < 10; count++) 
		{	
			try 
			{
				System.out.println("Main Thread called => going to sleep for 2Secs !!!");
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class CustomThread extends Thread
{
	public void run()
	{
		for(int count = 0; count < 10; count++) 
		{	
			try 
			{	
				System.out.println("My Custom Thread called => going to sleep for 2Secs !!!");
				sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
