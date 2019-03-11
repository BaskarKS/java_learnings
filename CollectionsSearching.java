package com.collections;
import java.util.*;

public class CollectionsSearching
{
	//Search is based on BinarySearch and the defined methods are 
	//1. public static int binarySearch(List l, Object target); //if the list is sorted according to some default natural sorting order then we have to use this.
	//2. public static int binarySearch(List l, Object target, Comparatorc) // if the list is sorted based on some customized comparator, we have to use this.
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
			ArrayList searchList = new ArrayList();
			searchList.add("Z");
			searchList.add("A");
			searchList.add("M");
			searchList.add("K");
			searchList.add("a");
			System.out.println(searchList);
			Collections.sort(searchList); // Sorting is based on "Default Natural Sorting Order" as no cust comparator is used.
			System.out.println(searchList);
			System.out.println(Collections.binarySearch(searchList, "Z"));
			System.out.println(Collections.binarySearch(searchList, "b"));
			
			System.out.println("Search Performed using Cust Comparator");
			
			ArrayList searchCustList = new ArrayList();
			searchCustList.add(15);
			searchCustList.add(11);
			searchCustList.add(0);
			searchCustList.add(20);
			searchCustList.add(10);
			System.out.println("Before Sort =>"+searchCustList);
			Collections.sort(searchCustList, new MyCustComparator()); // Sorting is based on "Default Natural Sorting Order" as no cust comparator is used.
			System.out.println("After Sort =>"+searchCustList);
			MyCustComparator comparatorUsed = new MyCustComparator();
			System.out.println(Collections.binarySearch(searchCustList, 10, comparatorUsed));//3
			System.out.println(Collections.binarySearch(searchCustList, 12, comparatorUsed)); //-3
			System.out.println(Collections.binarySearch(searchCustList, 30)); //Unpredicatable Results -6
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