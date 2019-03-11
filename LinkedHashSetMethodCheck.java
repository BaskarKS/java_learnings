package com.collections;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.Iterator;

public class LinkedHashSetMethodCheck
{
	public static void main(String[] args)
	{
			//LinkedHashSet Class
			//Represent a group of individual objects where DUPLICATES ARE NOT ALLOWED AND INSERTION ORDER IS PRESERVED
			//its child class of HashSet, intorduced in 1.4V
			//no new or special methods defined, have to use Collection(I) methods
			//Underlying data structure is LinkedList + HashTable
			//Duplicates not allowed			
			//"null" insertion is possible and can be inserted only once (since duplicates are not allowed)
			//Heterogeneous objects is possible to store.
			//Serializable and Cloneable interface are implemented, RandomAccess is not implemented.
			//Its best choice if the frequent operation is "Searching"
			//if we try to insert duplicate items, add() method returns false. No Compilation/Runtime issues
			// In general LinkedHashSet is used to develop cache based application, where insertion order must be preserved and duplicates not allowed
			
			//Four Constructors
			//1. new LinkedHashSet();
			//2. new LinkedHashSet(int initialCapacity) // default fill Ratio is 0.75
			//3. new LinkedHashSet(int initialCapacity, float fillRatio)
			//4. new LinkedHashSet(Collection c)
			//FillRatio of .75 => after filling 75%  ratio of hashset then new hashset object will be created
			
			LinkedHashSet hashSetObj = new LinkedHashSet(5);
			System.out.println("LinkedHashSet Size =>"+hashSetObj.size());
			System.out.println("LinkedHashSet is Empty =>"+hashSetObj.isEmpty());
			System.out.println(hashSetObj.add(10));
			System.out.println(hashSetObj.add(10)); //duplicate added and the return value is false
			System.out.println(hashSetObj.add(20.5));
			System.out.println(hashSetObj.add('k'));
			System.out.println(hashSetObj.add("Baskar"));
			System.out.println(hashSetObj.size());
			System.out.println(hashSetObj.add("null"));
			System.out.println(hashSetObj.size());
			System.out.println(hashSetObj.add(null));
			System.out.println(hashSetObj.size());
			
			System.out.println(hashSetObj);
			System.out.println("LinkedHashSet Size =>"+hashSetObj.size());
			System.out.println("LinkedHashSet is Empty =>"+hashSetObj.isEmpty());
			
			Stack stackObj = new Stack();
			stackObj.push("Baskar K S");
			stackObj.push(null);
			stackObj.push(20.5);
			stackObj.push(40);
			stackObj.push(50);
			
			System.out.println("Stack Items"+stackObj);
			System.out.println("AddAll =>"+hashSetObj.addAll(stackObj));
			System.out.println("LinkedHashSet Items =>"+hashSetObj);
			System.out.println("LinkedHashSet Size =>"+hashSetObj.size());
			
			System.out.println("removeAll Stack Values=>"+ hashSetObj.removeAll(stackObj));
			System.out.println("LinkedHashSet Items =>"+hashSetObj);

			System.out.println("AddAll =>"+hashSetObj.addAll(stackObj));
			System.out.println("LinkedHashSet Items =>"+hashSetObj);

			System.out.println("RetainAll =>"+hashSetObj.retainAll(stackObj));
			System.out.println("LinkedHashSet Items =>"+hashSetObj);

			System.out.println("contains 40 =>"+hashSetObj.contains(40));

			System.out.println("contains all stackItems =>"+hashSetObj.containsAll(stackObj));
			
			System.out.println("remove 40=>"+ hashSetObj.remove(40));
			System.out.println("contains all stackItems =>"+hashSetObj.containsAll(stackObj)); //here not all items present hence return "false"
			System.out.println("LinkedHashSet Items =>"+hashSetObj);
			
			System.out.println("LinkedHashSet Size =>"+hashSetObj.size());
			
			System.out.println("LinkedHashSet items got into Array");
			Object[] toArray = hashSetObj.toArray();
			for (Object item : toArray)
				System.out.println(item);
			
			System.out.println("LinkedHashSet items printed through Iterator, if null found its removed");
			Iterator hashIterator = hashSetObj.iterator();
			while(hashIterator.hasNext())
			{
				Object tempObj = hashIterator.next();
				System.out.println(tempObj);
				if (tempObj == null) hashIterator.remove();
			}
			System.out.println("LinkedHashSet Items =>"+hashSetObj);
			hashSetObj.clear();
			System.out.println("LinkedHashSet Items cleared =>"+hashSetObj);
			System.out.println("LinkedHashSet Size after Clear=>"+hashSetObj.size());

	}
}