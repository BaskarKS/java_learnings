package com.collections;
import java.util.*;
import static java.util.Arrays.*;
public class ArraysClassSearching
{
	//Array Class defines the following three methods for Searching
	//1. public static int binarySearch(primitive[] p, primitive target)
	//2. public static int binarySearch(Object[] objArray, Object target)
	//3. public static int binarySearch(Object[] objArray, Object target, Comparator c)
	//Arrays class also follows the Same below rules which are defined for Collections class 
	// internaly use BinarySearchAlgorithm to search
	//Sucessful search returns the index of the object found.
	//unsucessfull Search returns the insertion point.
	// Insertion point is the location where we can place the target element in sorted list.
	//Before search, compulsary the list should be in sorted form, otherwise unpredictable reulsts is returned.
	//on custom comparator sed to sort the list, have to pass the same comparator while search. Else unpredicatable results.
	// Sucessful search range for n numbers is => 0 to (n-1)
	// UnSucessful search result range for n numbers is => -(n+1) to (-1)
	// total Result range for n numbers is => -(n + 1) to (n-1)
	public static void main(String[] args)
	{
		int[] arr = {10,5,20,11,6};
		Arrays.sort(arr);
		for(Integer val : arr)
			System.out.println(val);
		System.out.println("Search for value 6 in array =>"+Arrays.binarySearch(arr,6));
		System.out.println("Search for value 14 in array =>"+Arrays.binarySearch(arr,14));
		
		String[] strArray = {"A", "Z", "B"};
		Arrays.sort(strArray);
		for(String val : strArray)
			System.out.println(val);
		System.out.println("Search for String element Z in StringArray => "+ binarySearch(strArray, "Z"));
		System.out.println("Search for String element S in StringArray => "+ binarySearch(strArray, "S"));
		Arrays.sort(strArray, new mySearchComparator());
		for(String val : strArray)
			System.out.println(val);
		System.out.println("Search for String element Z in StringArray => "+ binarySearch(strArray, "Z", new mySearchComparator()));
		System.out.println("Search for String element S in StringArray => "+ binarySearch(strArray, "S")); //unpredicatable result as comparator not passed
	}
	static class mySearchComparator implements Comparator
	{
		public int compare(Object valOne, Object valTwo)
		{
			String strValOne = valOne.toString();
			String strValTwo = valTwo.toString();
			return strValTwo.compareTo(strValOne);
		}
	}
}