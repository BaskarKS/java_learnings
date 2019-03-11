package com.collections;
import java.util.*;

public class ArrayAsListCheck
{
	//method to create array into List is => public static List asList(object[] arr)
	//the above method wont create an imdependent List, for existing array we get list view.
	//ie: using array reference if we make any change the changes will be reflected in List. Change happenned using List reference gets reflected in Array.
	//using List reference if we perform any operation which affects the size like (add / remove ) we get RE: UnSupportedOperationException.
	//Using List we are not allowed to existing values replace with Heterogeneous objects. we get RE: ArrayStoreException

	public static void main(String[] args)	
	{
		String[] strArray = {"Baskar", "Sahitya", "Jaasritha"};
		List listView = Arrays.asList(strArray);
		System.out.println(listView); //[Baskar, Sahitya, Jaasritha]
		strArray[0] = "SuriBabu";
		strArray[1] = "Ramani";
		System.out.println(listView); //[SuriBabu, Ramani, Jaasritha]
		listView.set(2, "Devakshith");
		for(String element : strArray)
			System.out.println(element);
//		listView.add("Yuva"); //Exception in thread "main" java.lang.UnsupportedOperationException
//		listView.remove(2);//Exception in thread "main" java.lang.UnsupportedOperationException
		listView.set(2, "Jaasritha");
		System.out.println(listView); //[SuriBabu, Ramani, Jaasritha]
		listView.set(2, new Integer(10)); //Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
	}
}