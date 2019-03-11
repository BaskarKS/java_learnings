package com.collections;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
public class LinkedHashMapMethodCheck
{
	public static void main(String[] args)
	{
		//Its child class of HashMap, Introduced in 1.4V
		//Underlying Data-structure is Hybrid (LinkedList + HashTable)
		//Insertion Order is preserved and its based on the order of adding into the dataStructure
		//Heterogeneous objects are allowed for both keys and values.
		//null is allowed for key(only once), for values(any Number of times)
		//It implements Serializable, Cloneable, but not RandomAccess
		//best choice for "search" operation and commonly used for developing cacheBased application(Where duplicates 
																										//shouldnt be allowed, insertion order must be preserved)
		//Four Constructors
		// new LinkedHashMap();
		//new LinkedHashMap( int intialCapacity)
		//new LinkedHashMap(int initialCapacity, float fillRatio);
		//new LinkedHashMap(Collection c)
		
		LinkedHashMap hashMpObj = new LinkedHashMap();
		hashMpObj.put(66, "Devakshith");
		hashMpObj.put(11, "Baskar");
		hashMpObj.put(22, "Sahitya");
		hashMpObj.put(55, "Ramani");
		hashMpObj.put(33, "Jaasritha");
		hashMpObj.put(44, "Suribabu");
		hashMpObj.put(null, null);
		System.out.println(hashMpObj); // print key-values  {66=Devakshith, 11=Baskar, 22=Sahitya, 55=Ramani, 33=Jaasritha, 44=Suribabu, null=null}
		Set entrySet = hashMpObj.entrySet();
		System.out.println(entrySet); // print key-values in HashMap
		Collection collectionObj = hashMpObj.values();
		System.out.println(collectionObj); //prints all the values in HashMap
		Iterator iterableArray = entrySet.iterator();
		while(iterableArray.hasNext())
		{
			Entry entryObj = (Entry) iterableArray.next();
			System.out.println("Key is " + entryObj.getKey());
			System.out.println("Value is " + entryObj.getValue());
			System.out.println("New value is set and the return OldValue is " + entryObj.setValue("Hello"));
		}
		System.out.println(hashMpObj); //print key-values in hashmap
		Set keySet = hashMpObj.keySet();
		System.out.println(keySet);//prints all the keys in HashMap
		Iterator keyIterator = keySet.iterator();
		while(keyIterator.hasNext())
		{
			Integer tempkey = (Integer) keyIterator.next();
			System.out.println(hashMpObj.get(tempkey));
		}
		
	}
}