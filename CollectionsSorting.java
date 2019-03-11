package com.collections;
import java.util.*;
public class CollectionsSorting
{
	//collections class in util package defines following two sorting methods
	//1. public static void sort(List l) // to sort based on "default natural sorting order" 
									// (objects should not contain null element and 
									// should be homogeneous and comparable(I) implemented) else we get "ClassCastException"
	//2. public static void sort(List l, Comparator c)//sort based on customized sorting order
													//objects can be heterogeneous and no need of Comparable(I) implemented
	public static void main(String[] args)
	{
		ArrayList arrList = new ArrayList();
		arrList.add("Z");
		arrList.add("A");
		arrList.add("K");
		arrList.add("N");
		arrList.add("O");
		arrList.add("D");
//		arrList.add(10); //java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//		arrList.add(null); //java.lang.NullPointerException
//		arrList.add(null); //java.lang.NullPointerException
		System.out.println("Before Sorting =>" + arrList); //Before Sorting =>[Z, A, K, N, O, D]
		Collections.sort(arrList); //adding heterogeneous and null to ArrayList is allowed, but this sorting raises above exception
		System.out.println("After Sorting =>" + arrList); //After Sorting =>[A, D, K, N, O, Z]
		
		//Cust Comparator SOrting
		ArrayList custArrList = new ArrayList();
		custArrList.add("Z");
		custArrList.add("A");
		custArrList.add("K");
		custArrList.add(30);
		custArrList.add("N");
		custArrList.add(10);
		custArrList.add("O");
		custArrList.add("D");
		custArrList.add(21);
		System.out.println("Cust Comparison Before Sorting =>" + custArrList); //Cust Comparison Before Sorting =>[Z, A, K, N, O, D, 10, 21, 30]
		Collections.sort(custArrList, new MyCustComparator());
		System.out.println("Cust Comparison After Sorting =>" + custArrList); //Cust Comparison After Sorting =>[Z, O, N, K, D, A, 30, 21, 10]
		Comparator reverseComparator = Collections.reverseOrder(new MyCustComparator()); // reverse the logic of Comparator
		Collections.sort(custArrList, reverseComparator);
		System.out.println("Cust Comparison After Reverse Sorting =>" + custArrList);
																				//Cust Comparison After Reverse Sorting =>[10, 21, 30, A, D, K, N, O, Z]
	}
	
	static class MyCustComparator implements Comparator
	{
		public int compare(Object objOne, Object objTwo)
		{
			String strOne = objOne.toString();
			String strTwo = objTwo.toString();
			return strTwo.compareTo(strOne);
		}
	}
}