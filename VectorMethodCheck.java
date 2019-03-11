package com.collections;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

import java.util.ArrayList;
public class VectorMethodCheck
{
	public static void main(String[] args)
	{
		//Underlying DataStructure is Resizable or Growable Array
		//Insertion Order is Preserved / Maintained
		//Duplicates are allowed
		//HeteroGeneous Objects are allowed
		//null insertion is possible
		//It implements Serializable, Clonable, and RandomAccess
		//All methods are Synchronized and hence vector object is Thread-Safe
		
		//Four Constructorts
		//new Vector();
		//new Vector(int initialCapacity)
		//new Vector(int initialCapacity, int incrementalCapacity) // created with initialCapacity, once size if full. 
																  // Additional memory will be keep on added based on Incremental capacity
		//new Vector(Collection c)
		
		Vector vObj = new Vector(); //initial capacity will be 10 and once its filled, capacity will be doubled 20 , 40, 80...
		Vector vCapObj = new Vector(20);
		Vector vCapIncObj = new Vector(20,5);
		ArrayList arrListObj = new ArrayList();
		arrListObj.add("A");
		arrListObj.add("B");
		arrListObj.add(10);
		arrListObj.add(null);
		Vector vCollObj = new Vector(arrListObj); //initial capacity will be capacity of collection obj if its less than 10, after that (currentcapacity * 3/2 + 1)
		System.out.println(vCollObj);
		
		System.out.println(vCollObj.capacity());
		System.out.println(vCollObj.size());
		
		System.out.println(vObj.capacity());
		for(int count = 0; count <= 15; count++)
			vObj.addElement(count);
		
		System.out.println(vObj.capacity()); //capacity() is Vector method and is equivalrent to size() method of collection
		System.out.println(vObj);
		
		System.out.println(vObj.removeElement(9)); // returns "true" if its removed
		System.out.println(vObj);
		
		vObj.removeElementAt(4);// returns "true" if its removed and passed value is index
		System.out.println(vObj);
		
		System.out.println(vObj.elementAt(10)); // elementAt(int index) is Vector Method which is equivalent to get(int index) method in collection
		System.out.println(vObj.get(10)); 
		System.out.println(vObj);
		
		//3 cursors in Java - 1.Enumeration 2. Iterator 3. ListIterator
		//Cursors are needed to fetch/retreive objects sequentially one at a time in Collections.
		//Enumeration is legacy cursor 1.0V available in Vector class and Enumeration object can be get using elements() methods
		//Enumeration is not a universal cursor(cant apply to all collection objects), can do only read Operation (cant remove elements using cursor)
		
		Vector intValueVector = new Vector();
		for (int value = 10; value >= 0; value--)
			intValueVector.addElement(value);
		
		Enumeration legacyCursor = intValueVector.elements(); //returns Enumeration cursor
		System.out.println("Enumeration class Name " + legacyCursor.getClass().getName()); //Enumeration class Name java.util.Vector$1
		while(legacyCursor.hasMoreElements())
		{
			Integer intValue = (Integer)legacyCursor.nextElement();
			if((intValue % 2) == 0) System.out.println(intValue);
		}
		
		System.out.println("Checking Iterator Cursor");
		//Iterator is Universal Cursor because it can be applied to all Collection objects
		//using this we can perform read() as well as remove() operations.
		//public Iterator iterator(); from Collection interface
		// contains 3 methods => 1. boolean hasNext(), 2. Object next(), 3. void remove();
		//same like enumeration but has extra capability of to remove elements
		System.out.println("Vector Holding Values => " + intValueVector);
		Iterator iteratorCursor = intValueVector.iterator(); //returns Iterator cursor.
		System.out.println("Iterator class Name " + iteratorCursor.getClass().getName()); //Iterator class Name java.util.Vector$Itr
		while(iteratorCursor.hasNext())
		{
			Integer tempHolder = (Integer)iteratorCursor.next();
			if (tempHolder % 2 == 0) System.out.println(tempHolder);
			else iteratorCursor.remove();
		}
		System.out.println("After Iterator remove, values in Vector =>"+intValueVector);
		intValueVector.clear();
		System.out.println("After clearing Iterator, values in Vector =>"+intValueVector);
		System.out.println("After clearing Iterator, sizeof Vector =>"+ intValueVector.capacity());
		for (int value = 10; value >= 0; value--)
			intValueVector.addElement(value);
		System.out.println("Vector Holding New Values => " + intValueVector);
		
		//Limitation of Iterator and Enumeration Cursor
		//1. Can move the cursor only in Forward Direction (Single direction cursor), can't move in backward Direction (Bidirectional Capability)
		//2. Can only read and remove operation, cant add / replace of new objects.
		
		//Above Limitations can be solved by "ListIterator" Cursor
		//Can move the cursor in Bidirectional(forward/backward)
		//can perform "replace / add" new objects. in addition to read and remove operations
		//public ListIterator listIterator() in collection interface
		//Child interface of Iterator(I)
		ListIterator listIteratorCursor = intValueVector.listIterator();
		System.out.println("List Iterator class Name " + listIteratorCursor.getClass().getName()); // List Iterator class Name java.util.Vector$ListItr
		while(listIteratorCursor.hasNext())
		{
			Integer intValue = (Integer)listIteratorCursor.next();
			System.out.println("in ListIterator, fetch Values => " + intValue);
			if (intValue == 9)
				listIteratorCursor.remove(); //[10,8,7,6,5,4,3,2,1,0]
			else if (intValue == 7)
				listIteratorCursor.set(777); //[10,8,777,6,5,4,3,2,1,0]
			else if (intValue == 5) {
				listIteratorCursor.add(555); //[10,8,777,6,5,555,4,3,2,1,0] // current cursor is pointing to 5, 
																			// add will add the object and cursor point to new added obj
				listIteratorCursor.previous(); //making cursor to point to value 5 instead of currently pointing to 555
			}
		}
		System.out.println("After ListIterator operations, Vector Hold New Values => " + intValueVector);
	}
}