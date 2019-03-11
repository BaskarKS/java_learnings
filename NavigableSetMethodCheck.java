package com.collections;
import java.util.*;
public class NavigableSetMethodCheck
{
	public static void main(String[] args)
	{
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(1000);
		tSet.add(1950);
		tSet.add(2250);
		tSet.add(2400);
		tSet.add(2600);
		tSet.add(2850);
		tSet.add(2900);
		tSet.add(2950);
		tSet.add(4000);
		tSet.add(5000);
		System.out.println(tSet);
		System.out.println(tSet.ceiling(2000));
		System.out.println(tSet.higher(2250));
		System.out.println(tSet.floor(3000));
		System.out.println(tSet.lower(2950));
		System.out.println(tSet.pollFirst());
		System.out.println(tSet.pollLast());
		System.out.println(tSet.descendingSet());
		System.out.println(tSet);
	}
	
	
}

class NavigableSetConclusions
{
	//Child Interface of SortedSet, get introduced in 1.6V
	// defines several methods for navigation purpose
	
	//7 methods defined
	//1. floor(e) - return highest element which is <= e
	//2. lower(e) - return highest element which is < e
	//3. ceiling(e) - returns lowest element which is >= e
	//4. higher(e) - return lowest element which is > e
	//5. pollFirst() - remove and return first element
	//6. pollLast() - remove and return last element
	//7. descending set() - returns NavigableSet in reverse order.
	
}