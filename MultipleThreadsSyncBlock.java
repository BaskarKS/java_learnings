package com.threads;

public class MultipleThreadsSyncBlock
{
	//synchronized keyword is applicable only for methods and block but not for variables.
	//advantage of synchronized keyword is to solve data inconsistency problem
	//Disadvantage is Increases waiting time of the threads and creates performace issues.
	//Race Condition : multiple threads operate on the same object simultaneously will create data consistency problem, can be overcome by synchronized keyword
	//object lock: each object has unique object lock, when a thread wants to execute "instance synchronized method" acquires the lock
	//class lock: unique to class, when thread wants to execute "static synchronized method" acquires the lock
	//when a thread executing synchronized method, other threads are allowed to execute any other synchronized method ====> NO
	//declare synchronized block to get current object =====>synchronized(this){}
	//declare syncronized block to get class level lock ====> syncronized(className.class)
	//advantage of syncronized method over syncronized block ===> performace will be improved
	//is thread acquire multiple lock simultanesously ==> Yes ===> nested synchronized block inside a "Synchronized instance method"
	//what is synchronized statement ==> statements present inside synchronized method/block or statements executed one thread at a time.
	
	public static void main(String[] args)
	{
		//USING OBJECT AS PARAM IN SYNCHRONIZED BLOCK -----(1,2)
	/*	Display dispObj = new Display(); //common Display object used across multiple threads, object level lock is useds
		MyThread threadOne = new MyThread(dispObj, "Baskar");
		MyThread threadTwo = new MyThread(dispObj, "Jaashi");
		threadOne.start();
		threadTwo.start();
	*/
		//USING CLASS AS PARAM IN SYNCHRONIZED BLOCK -----(3)
		Display dispObj = new Display();  //even for different Display object for respective threads, class level lock acts common
		Display dispObjOne = new Display();
		MyThread threadOne = new MyThread(dispObj, "Baskar");
		MyThread threadTwo = new MyThread(dispObjOne, "Jaashi");
		threadOne.start();
		threadTwo.start();
	}
}

class Display
{
	/*private final static Object lock; //-------------(1)
	
	static
	{
		lock = new Object();
	}
	*/
	public void wish(String wishName)
	{
		//synchronized(lock) //----------------(1) //in synchronized block only Objects and Class can be used, primitives are not allowed
		//synchronized(this) // ------------------(2)
		synchronized(Display.class) // ------------------(3)
		{
			for(int countToWish = 1; countToWish <= 10; countToWish++)
			{
				System.out.print("Good Morning : ");
				try
				{
					Thread.sleep(1500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(wishName);
			}
		}
	}
}

class MyThread extends Thread
{
		private Display dispObj;
		private String stringToPass;
		public MyThread(Display d, String str)
		{
			dispObj = d;
			stringToPass = str;
		}
		public void run()
		{
			dispObj.wish(stringToPass);
		}
}