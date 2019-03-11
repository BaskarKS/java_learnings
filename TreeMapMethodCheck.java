package com.collections;

import java.util.TreeMap;
import java.util.Comparator;
public class TreeMapMethodCheck
{
	public static void main(String[] args)
	{
		//Underlying Data Structure is RED-BLACK TREE
		//Insertion order is preserved and its based on some sorting order of keys.
		//Duplicate keys not allowed, but values can contain duplicates.
		// relying  on "default natural sorting order" => only Homogeneous and Comparable(I) implemented objects are accepted.
		//relying on some customSorting order => heterogeneous and objects doesnt implement Comparable is accepted.
		//depending on "default sorting order" / custom comparator sorting makes no restrictions on values (can take heterogeneous non comparable
																											// objects also
		// null is not accepted as key from 1.7V onwards as key. prior to that null is accepted only as first key and adding second element throws NPE.
		// null is accepted as any number of times for values theres no restrictions.
		
		//four constructors
		//1. new HashMap();
		//2. new HashMap(Comparator c)
		//3. new HashMap(Collection c)
		//4. new HashMap(SortedMap m)
		
		TreeMap treeMapObj = new TreeMap();
		treeMapObj.put(100, "ZZZ");
		treeMapObj.put(103, "YYY");
		treeMapObj.put(101, "XXX");
		treeMapObj.put(99, 105);
		treeMapObj.put(105, null);
		treeMapObj.put(55, null);
//		treeMapObj.put("FF", "XXX"); //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String // only homogeneous key accepted
//		treeMapObj.put(null, null); //java.lang.NullPointerException //cant add null as key
		System.out.println(treeMapObj); //{55=null, 99=105, 100=ZZZ, 101=XXX, 103=YYY, 105=null}
		
		TreeMap customTreeMapObj = new TreeMap(new CustomComparator());
		customTreeMapObj.put(100, "ZZZ");
		customTreeMapObj.put(103, "YYY");
		customTreeMapObj.put(101, "XXX");
		customTreeMapObj.put(99, 105);
		customTreeMapObj.put(105, null);
		customTreeMapObj.put(55, null);
		System.out.println(customTreeMapObj);  //{105=null, 103=YYY, 101=XXX, 100=ZZZ, 99=105, 55=null} => descending order of key
	}
	
	static class CustomComparator implements Comparator
	{
		public int compare(Object objOne, Object objTwo)
		{
			Integer intOne = (Integer)objOne;
			Integer intTwo = (Integer)objTwo;
			return intTwo.compareTo(intOne);
		}
	}
}

class SortedMapDetails
{
	// its the child Interface of Map(I)
	// represent a group of key-value pairs according to some sorting order of keys. Sorting is based on keys but not on values.
	
	//Sorted Map Methods
	// 1. Object firstKey();
	// 2. Object lastKey();
	// 3. SortedMap headMap(Object key); <key
	// 4. SortedMap tailMap(Object key); >= key
	// 5. SortedMap subMap(Object keyOne, Object keyTwo) >= keyOne and < keyTwo
	// 6. Comparator comparator();
	// Eg: {101-A, 103-B, 104-C, 107-D, 125-E, 136-F}
	// firstKey() => 101
	// lastKey() => 136
	// headMap(107) => {101-A, 103-B, 104-C}
	// tailMap(107) => {107-D, 125-E, 136-F}
	//subMap(103, 125) => {103-B, 104-C, 107-D}
	//comparator() => null
}