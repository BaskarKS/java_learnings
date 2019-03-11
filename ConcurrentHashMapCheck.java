package com.collections.concurrentcollections;
import java.util.*;
import java.util.concurrent.*;
public class ConcurrentHashMapCheck extends Thread
{
	//Underlying data structure for concurrentHashMap is HashTable.
	//concurrent hashmap allows concurrent read and thread safe update operations.
	//to perform read, thread wont require any lock
	// to perform update, thread requires lock but it is the lock of only particular part/bucket/segment of the map
	//instead of lock on whole map, concurrent update is internally acheived by dividing map into smaller portions which is defined by concurrency level
	//default concurrency level is 16
	//concurrency hashmap allows 16 defailt read and write operations at a time
	//null is not acheived for keys and values
	//while one thread is reading other thread can update, concurrentmodificationexception is never thrown
	
	//Five (5) constructors
	//new ConcurrentHashmap()
	//new ConcurrentHashmap(int initialCapacity)
	//new ConcurrentHashmap(int initialcapacity, float fillratio)
	//new ConcurrentHashmap(int initialcapacity, float fillratio, int concurrencylevel)
	//new ConcurrentHashmap(Map m)
//	static HashMap hashMap = new HashMap();
	static ConcurrentHashMap hashMap = new ConcurrentHashMap();
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Child Thread Updating the Map");
		hashMap.put(103, "Jaasritha");
	}
	public static void main(String[] args)
	{
		ConcurrentHashMap conMap = new ConcurrentHashMap();
		conMap.put(101, "A");
		conMap.put(102, "B");
		conMap.putIfAbsent(103,"C"); //since 103 key not there, hence its added
		conMap.putIfAbsent(101, "D"); //since 101 is present, the value is not replaced. just skipped updating
		conMap.remove(101, "D"); // 101-D => key and value doesnt match with the key-value present in map, hence its not removed
		conMap.replace(102, "B", "E");//102-B => key and value is matched, hence the old value is updated with "E"
//		System.out.println(conMap); //{101=A, 102=E, 103=C}
		
		hashMap.put(101, "Baskar");
		hashMap.put(102, "Geetha");
		ConcurrentHashMapCheck childThread = new ConcurrentHashMapCheck();
		childThread.start();
		Set set = hashMap.keySet();
		Iterator keyIterator = set.iterator();
		while(keyIterator.hasNext())
		{
			Integer key = (Integer)keyIterator.next();
			System.out.println("Main Thread Iterating => " + hashMap.get(key));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e){}
		}
		System.out.println(hashMap);
	}
}
