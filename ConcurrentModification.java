package com.collections.concurrentcollections;
import java.util.*;

public class ConcurrentModification extends Thread
{
	public static ArrayList commDataStructure = new ArrayList();
	public void run()
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		System.out.println("Child Thread came and wish to update the common DS");
		commDataStructure.add("D");
	}
	public static void main(String[] args)
	{
		commDataStructure.add("A");
		commDataStructure.add("B");
		commDataStructure.add("C");
		ConcurrentModification childThread = new ConcurrentModification();
		childThread.start();
		Iterator iterateObj = commDataStructure.iterator();
		while(iterateObj.hasNext())
		{
			System.out.println(iterateObj.next());
			System.out.println("MainThread Iterating List =>");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println(commDataStructure);
			
	}
}