package com.collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedListMethodCheck
{
	public static void main(String[] args)
	{
		System.out.println("Linked List Collection class methods check!!!");
		//LinkedList Class
		//Underlying data structure is DoubleLinkedList
		///Duplicate objects allowed
		//Insertion order is preserved
		//Allow to add Heterogeneous Objects.
		///Null insertion is possible.
		//Implements Serializable and Cloneable but not RandomAccess.
		///Good choice if the frequent operation is Insertion and Deletion but not retreival.
		//Two constructors
		//1. LinkedList obj = new LinkedList();
		//2. LinkedList obj1 = new LinkedList(Collection c);
		
		LinkedList linkListObj = new LinkedList();
		linkListObj.add(10);
		linkListObj.add('a');
		linkListObj.add(12.5);
		linkListObj.add("Baskar");
		System.out.println("Added items in LinkedList => "+linkListObj);
		linkListObj.add(2,20);

		linkListObj.add(2,"inserting");
		System.out.println("Added extra items at 2 index in LinkedList using add(index,object)=> "+linkListObj);

		linkListObj.set(2, "replacing");
		System.out.println("replacing item at 2 index in LinkedList using set()=> "+linkListObj);

		linkListObj.addFirst("FirstItem Added");
		System.out.println("adding first Item in LinkedList using addFirst()=> "+linkListObj);

		linkListObj.addLast("LastItem Added");
		System.out.println("adding last Item in LinkedList using addLast()=> "+linkListObj);
		
		System.out.println("Get Last Item in LinkedList using getLast()=> "+ linkListObj.getLast());
		System.out.println("Get First Item in LinkedList using getLast()=> "+ linkListObj.getFirst());
		System.out.println("values in LinkedList => "+ linkListObj);
		
		System.out.println("Removing first item value in LinkedList using removeFirst() => "+ linkListObj.removeFirst());
		System.out.println("Removing last item value in LinkedList using removeLast() => "+ linkListObj.removeLast());
		System.out.println("Values in LinkedList => "+ linkListObj);
		
		ArrayList aListObj = new ArrayList();
		aListObj.add("aa");
		aListObj.add("bb");
		aListObj.add("cc");
		System.out.println("ArrayList Created and value are => " + aListObj);
		linkListObj.addAll(aListObj); //add the arraylist items at the last of the linklist items, if the index is specified then it will be inserted at the index
		System.out.println("Values in LinkedList => "+ linkListObj);
		
		System.out.println("index of 20 in in LinkedList =>"+linkListObj.indexOf(20));
		System.out.println("Last index of Baskar in LinkedList =>"+linkListObj.lastIndexOf("Baskar"));
		System.out.println("index of Baskar and LastIndex is same in LinkedList =>"+(linkListObj.lastIndexOf("Baskar") == linkListObj.indexOf("Baskar")));
		
		System.out.println("Removing item at index 2 using remove(index) => "+ linkListObj.remove(2));
		System.out.println("Values in LinkedList => "+ linkListObj);
		
		System.out.println("Does the passed Obj is present in LinkedList => "+ linkListObj.contains("Baskar"));
		System.out.println("Does the passed collection Obj is present in LinkedList => "+ linkListObj.containsAll(aListObj));
		
		System.out.println("Size of LinkedList => "+ linkListObj.size());
		
		Object[] listItems = linkListObj.toArray();
		for (Object item : listItems)
			System.out.println(item);
		
		
		System.out.println("index of 'a' in LinkedList =>"+linkListObj.indexOf('a'));
		System.out.println("Last index of \"aa\" in LinkedList =>"+linkListObj.lastIndexOf("aa"));
		
		
	}
		
}