package com.collections;
import java.util.*;
public class ArraysClassSorting
{
	// Arrays is a utility class to define several utility methods for ArrayObjects
	// Sorting elements of Array
	// below defined methods are to sort elements of primitive and Object type array
	//1. public static void sort(primitive[] array) // primitive arrays can be sorted only by default natural sorting order, cust sorting method not available
	//2. public static void sort(Object[] array) // according to default natural sorting order
	//3. public static void sort(Object[] array, Comparator c) // according to customized sorting order
	
	public static void main(String[] args)
	{
		int[] a = {10, 5, 20, 11, 6};
		System.out.println("primitive array before sorting =>");
		for(int count : a)
			System.out.println(count);
		
		Arrays.sort(a);
		System.out.println("primitive array after sorting =>");
		for(int count : a)
			System.out.println(count);
		
		System.out.println(a);
		
		String[] strArray = {"S", "Z", "C"};
		System.out.println("Object array before sorting =>");
		for (String obj : strArray)
			System.out.println(obj);
	
		Arrays.sort(strArray);
		System.out.println("Object array After sorting =>");
		for (String obj : strArray)
			System.out.println(obj);
		
		Arrays.sort(strArray, new MyCustComparator());
		System.out.println("Object array After sorting by Comparator =>");
		for (String obj : strArray)
			System.out.println(obj);
	
	}
	static class MyCustComparator implements Comparator
	{
		public int compare(Object valueOne, Object valueTwo)
		{
			String valOne = valueOne.toString();
			String valTwo = valueTwo.toString();
			return valTwo.compareTo(valOne);
		}
	}
}