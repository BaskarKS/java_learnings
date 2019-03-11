package com.threads;
public class MultipleThreadsOnObject
{
	public static void main(String[] args)
	{
		Display commonDispObj = new Display();
		MyThreadNumbers numberPrintThread = new MyThreadNumbers(commonDispObj);
		MyThreadChar characterPrintThread = new MyThreadChar(commonDispObj);
		numberPrintThread.start();
		characterPrintThread.start();
	}
}

class Display
{
	public synchronized void displayNumbers()
	{
		for(int count = 1; count <= 10; count++)
		{
			System.out.print(count);
			try 
			{
				Thread.sleep(1500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void displayChars()
	{
		for(int count = 65; count <= 75; count++)
		{
			System.out.print((char)count);
			try 
			{
				Thread.sleep(1500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class MyThreadNumbers extends Thread
{
	protected Display dispObj;
		public MyThreadNumbers(Display d)
		{
			dispObj = d;
		}
		
		public void run()
		{
			dispObj.displayNumbers();
		}
}

class MyThreadChar extends Thread
{
	protected Display dispObj;
	public MyThreadChar(Display d)
	{
		dispObj = d;
	}
	public void run()
	{
		dispObj.displayChars();
	}
}