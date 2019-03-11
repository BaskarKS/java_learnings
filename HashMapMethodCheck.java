package com.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapMethodCheck
{
	public static void main(String[] args)
	{
		//Underlying Data-structure is HashTable
		//Insertion Order is not preserved and its based on Hashcode of keys
		//Heterogeneous objects are allowed for both keys and values.
		//null is allowed for key(only once), for values(any Number of times)
		//It implements Serializable, Cloneable, but not RandomAccess
		//best choice for "search" operation
		
		//Four Constructors
		// new HashMap();
		//new HashMap( int intialCapacity)
		//new HashMap(int initialCapacity, float fillRatio);
		//new HashMap(Collection c)
		
		HashMap hashMpObj = new HashMap();
		hashMpObj.put(11, "Baskar");
		hashMpObj.put(22, "Sahitya");
		hashMpObj.put(33, "Jaasritha");
		hashMpObj.put(44, "Suribabu");
		hashMpObj.put(55, "Ramani");
		hashMpObj.put(66, "Devakshith");
		hashMpObj.put(null, null);
		System.out.println(hashMpObj); // print key-values in Hashmap
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
class Map
{
		// Its not child interface of Collection(I)
		//want to represent a group of objects as Key-Value pair then Map should be preferred
		//Map(I) contains an inner Interface Entry(I) , Entry(I) defines keys and objects. both keys and values are objects only.
		// Duplicate keys are not allowed, duplicate values are allowed
		//each key-value object is called an Entry and hence map is considered as collection of Entry.
		
		//Methods of Map(I)
		//1. Object put(object key, Object value) // add key-value pair to the map, if key is already present then its updated with 
												//new value and onld value will be returned. otherwise null will be returned
		//2. void putAll(Map m)
		//3. Object get (Object key) //returns the value associated with the key
		//4. Object remove(Object key) // remove the Entry associated with the key
		//5. boolean containsKey(Object key) // check whether key is present or not in the map.
		//6. boolean containsValue(Object value) // check whether the value present in the map.
		//7. boolean isEmpty() // check map is empty or not.
		//8. int size() // returns the size of the map
		//9. void clear() // clear the map
		//Collections View on Map
		//10. Set KeySet() // returns all the Keys of map in Set(I) form
		//11. Set EntrySet() // returns all the Entry of map in Set(I) form
		//11. Collection values() // returns all the Values of map in Collection(I) form
		
		//Entry(I) Methods
		//1. Object getKey(); //get the key on the entry object
		//2. Object getValue(); //get the value on the entry object
		//3. Object setValue(Object newValue); //set the new value and returns the old value in return
}