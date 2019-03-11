package com.collections;
import java.util.ArrayList;	
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;	
import java.io.Serializable;
import java.util.RandomAccess;

public class ArrayListMethods
{
	public static void main(String[] args)
	{
		ArrayList firstType = new ArrayList();
		LinkedList linklistCollection = new LinkedList();
		firstType.add("A");
		firstType.add(10);
		firstType.add("A");
		firstType.add(null);
		System.out.println("First ArrayList =>"+firstType);
		firstType.remove(2);
		System.out.println("First ArrayList =>"+firstType);
		firstType.add(2, "M");
		firstType.add("N");
		System.out.println("First ArrayList =>"+firstType);
		System.out.println("ArrayList is Serializable =>" + (firstType instanceof Serializable));
		System.out.println("ArrayList is Cloneable =>" + (firstType instanceof Cloneable));
		System.out.println("ArrayList is RandomAccess =>" + (firstType instanceof RandomAccess));
		System.out.println("LinkedList is Serializable =>" + (linklistCollection instanceof Serializable));
		System.out.println("LinkedList is Cloneable =>" + (linklistCollection instanceof Cloneable));
		System.out.println("LinkedList is RandomAccess =>" + (linklistCollection instanceof RandomAccess)); // only ArrayList and Vector 
																												   // implements RandomAccess
		//ArrayList is Best choice if our frequent operation is retreival or read operation because of contant retreival time O(1) randoAccess(I)
		//Internally implemented using Resizable / Growable array.
		//ArrayList is Worst choice if our frequent operation is insertion/deletion in the middle.
		//ArrayList is non-Synchronized to get Synchronized version we need collections class help
		ArrayList syncVersion = new ArrayList();
		List syncList = Collections.synchronizedList(syncVersion);
		
		ArrayList thirdType = new ArrayList(firstType); //collection object is passes as parameter
		thirdType.add(null);
		System.out.println("Third ArrayList =>"+thirdType);
		
		ArrayList fourthType = new ArrayList(20);
		fourthType.add("Z");
		fourthType.add(100);
		fourthType.add(2, "Baskar");
		fourthType.add(0, null);
		System.out.println("Fourth ArrayList =>"+fourthType);

		thirdType.addAll(4, fourthType); //addAll(index, Collection)
		thirdType.add(6,null);
		System.out.println("Third ArrayList =>"+thirdType);

		System.out.println("get 4th Item => " + thirdType.get(4)); //get(index) //just get() the value doesnt remove the entry
		System.out.println("Third ArrayList =>"+thirdType);

		System.out.println("remove 4th item =>" + thirdType.remove(4)); //remove(index) // remove the specific index item
		System.out.println("Third ArrayList =>"+thirdType);
		
		System.out.println("set 4th item =>"+ thirdType.set(4, "newItem")); //object set(index, object) // set the object at specific index,
																										// remove and return the old object at the index
		System.out.println("Third ArrayList =>"+thirdType);

		System.out.println("index of null in Third ArrayList =>"+thirdType.indexOf(null));
		System.out.println("Last index of null in Third ArrayList =>"+thirdType.lastIndexOf(null));
		
		ArrayList fifthType = new ArrayList();
		fifthType.add(10);
		fifthType.add("M");
		fifthType.add(100);
		System.out.println("Fifth ArrayList =>"+fifthType);
		
		thirdType.removeAll(fifthType); //remove all the items in thirdType of the values in fifthType
		System.out.println("After Removing FifthType list from ThirdType ArrayList =>"+thirdType);
		
		ArrayList sixthType = new ArrayList();
		sixthType.add("A");
		sixthType.add("newItem");
		sixthType.add("Baskar");
		sixthType.add("N");
		System.out.println("Sixth ArrayList =>"+sixthType);
		thirdType.retainAll(sixthType); //retain only the items in thirdType of the values in sixthType
		System.out.println("After Retaining only sixthType values in Third ArrayList =>"+thirdType);
		
	}
}