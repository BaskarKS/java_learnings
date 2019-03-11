package com.collections;
import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueMethodCheck
{
	public static void main(String[] args)
	{
		//To represent a group of individual objects prior to processing according to some priority then we should go for queue
		// The priority can be either "Default Natural Sorting Order" / Customized  sorting order based on the comparator defined.
		//Insertion order is not preserved and its based on defined priority
		//Duplicate objects are not allowed
		// If we depend on "Default Natural Sorting Order" then compulsary objects must be Homogeneous and Comparable, otherwise RE:ClassCastException
		// If we define our own Customized comparator, objects need not be Homogeneous and Comparable implemented
		// null is not allowed even as first element also.
		
		//5 Constructors
		//1. new PriorityQueue()
		//2. new PriorityQueue(int initialCapacity)
		//3. new PriorityQueue(int initialCapacity, Comparator c)
		//4. new priorityQueue(SortedSet s)
		//5. new PriorityQueue(Collection c)
		
		PriorityQueue pQueue = new PriorityQueue();
		System.out.println(pQueue.peek()); //null
//		System.out.println(pQueue.element()); //java.util.NoSuchElementException
		for (int val=0; val <= 10; val++)
			pQueue.offer(val);
		System.out.println(pQueue); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(pQueue.poll()); //0
		System.out.println(pQueue); //[1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
		
		PriorityQueue stringPrioQueue = new PriorityQueue(15, new MyQueueComparator());
		stringPrioQueue.offer("Baskar");
		stringPrioQueue.offer("Babu");
		stringPrioQueue.offer("Ramani");
		stringPrioQueue.offer("Geetha");
		stringPrioQueue.offer("Jaasritha");
		System.out.println(stringPrioQueue.size());
		System.out.println(stringPrioQueue);
		
	}
	
	static class MyQueueComparator implements Comparator
	{
		public int compare(Object firstElem, Object secondElem)
		{
			String firElem = (String)firstElem;
			String secElem = (String)secondElem;
			return secElem.compareTo(firElem);
		}
	}
}

class QueueProperties
{
	//Its child interface of Collection(I)
	//To represent a group of individual objects prior to processing then we should go for queue
	//queue follows FIFO order, but based on requirement we can implement our own Priority Queue also
	//from 1.5 version onwards LinkedList also implements Queue interface, this implementation also follows FIFO principle
	
	//Queue(I) methods - Five Methods
	//1. boolean offer(Object o) - Add object to Queue
	//2. Object peek() - return head element of the Queue, return null on empty queue.
	//3. Object element() - Return Head element of the Queue, raises NoSuchElementException if the Queue is EmptyBorder
	//4. Object poll() - remove and return the head element of the Queue, returns null on empty Queue
	//5. Object remove() - remove and return the head element of the Queue, Raises NoSuchElementException if the Queue is EmptyBorder
	
	
}