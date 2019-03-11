package com.collections.concurrentcollections;
import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteArraySetCheck
{
	//Its thread safe version of Set
	//Internally implemented by copyonwriteArrayList
	//Insertion order is preserved
	//duplicates are not allowed
	//multiple threads can perform read simultaneously but for every write/update operation a seperate cloned copy will be created.
	//if the frequent operation is multiple read then this DS is good choice, if frequent operation is multiple write./update this DS is not recommended.
	//if one thread is iterating set the other thread are allowed to modify set we wont get ConcurrentModificationException
	//Iterator  of copyonwriteArrayList can perform only read, cant perform remove() operation, otherwise we get RE:UnSupportedOperationException
	//Heterogeneous objects are allowed
	//null insertion is possible.
	
	//Constructors
	// new CopyOnWriteArraySet();
	//new CopyOnWriteArraySet(Collection c)
	
	//no new methods added
	
	public static void main(String[] args)
	{
		CopyOnWriteArraySet setObj = new CopyOnWriteArraySet();
		setObj.add("D");
		setObj.add("B");
		setObj.add("C");
		setObj.add("A");
		setObj.add("F");
		setObj.add(null);
		setObj.add(10);
		setObj.add("D"); // Duplicates not allowed
		System.out.println(setObj);
	}
}