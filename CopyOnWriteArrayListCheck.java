package com.collections.concurrentcollections;
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListCheck extends Thread
{
	//1. this class will create a cloned copy of the arraylist for every update operation, at certain point the original and cloned copy will be synchronized
	// automatically which is taken care by JVM
	//2. Collection(I) => List(I) => CopyOnWriteArrayList(I)
	//3. As updates happen on the cloned copy which will not affect the threads which perform read operation.
	//4. Its costly to use because of every update operation a cloned copy will be created, hence its best choice if the requirement has several read operations
	// and less number of write operations
	//5. Insertion order is preserved
	//6. Duplicate objects are allowed
	//7. Hetwrogeneous objects are allowed
	//8. null insertion is possible
	//9. Implements Serializable, Cloneable, and RandomAccess interfaces
	//10. its iterator() is fail-safe, threads are allowed to modify at the same time other threads read the list.
	//11. Iterator of ArrayList can perform remove() operation while CopyOnWriteArrayList iterator cant perform remove(), 
	// otherwise RE: UnsupportedOperationException
	
	//Three Constructors
	//1. new CopyOnWriteArrayList();
	//2. new CopyOnWriteArrayList(Collection c)
	//3. new CopyOnWriteArrayList(object[] arrayArg)
	static CopyOnWriteArrayList classLevelList = new CopyOnWriteArrayList();
	public static void main(String[] args)
	{
			CopyOnWriteArrayList list = new CopyOnWriteArrayList();
			list.add("A");
			list.add("A");
			System.out.println(list);
			list.addIfAbsent("C");
			list.addIfAbsent("C"); //Avoid adding C if its already there in the list
			System.out.println(list); //[A, A, C]
			
			ArrayList normList = new ArrayList();
			normList.add("A");
			normList.add("B");
			list.addAll(normList); //Add items A,B to the list
			System.out.println(list); //[A, A, C, A, B]
			
			ArrayList normListNew = new ArrayList();
			normListNew.add("A");
			normListNew.add("B");
			normListNew.add("C");
			normListNew.add("D");
			normListNew.add("E");
			
			list.addAllAbsent(normListNew); //add only D, E //avoids A,B,C //
			System.out.println(list); //[A, A, C, A, B, D, E]
			
			classLevelList.add("A");
			classLevelList.add("B");
			classLevelList.add("D");
			CopyOnWriteArrayListCheck childThread = new CopyOnWriteArrayListCheck();
			childThread.start();
			Iterator iterate = classLevelList.iterator();
			while(iterate.hasNext())
			{
				String valInList = (String)iterate.next();
				/*
				if (valInList.equals("B"))
					iterate.remove(); //Exception in thread "main" java.lang.UnsupportedOperationException
				*/
				System.out.println("Main Thread Iterating the List and the Value is => " + valInList);
				try {
					Thread.sleep(3000);
				} catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(classLevelList);
	}
	
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating List =>");
		classLevelList.add("C");
	}
}