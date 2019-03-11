package com.collections;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapMethodCheck
{
	public static void main(String[] args) throws InterruptedException
	{
		//Underlying Data-structure is HashTable
		//Insertion Order is not preserved and its based on Hashcode of keys
		//Heterogeneous objects are allowed for both keys and values.
		//null is allowed for key(only once), for values(any Number of times)
		//It implements Serializable, Cloneable, but not RandomAccess
		//best choice for "search" operation
		// exactly same as HashMap including methods and Constructors.
		//.equals method does content comparison, where "==" does reference comparison
		// Usually HashMap uses .equals() method to confirm/check duplicates among keys.

		
		
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
		
		//Four Constructors
		// new WeakHashMap();
		//new WeakHashMap( int intialCapacity)
		//new WeakHashMap(int initialCapacity, float fillRatio);
		//new WeakHashMap(Collection c)
		
		WeakHashMap checkWeakmap = new WeakHashMap(10);
		TempClass keyOne = new TempClass();
		TempClass keyTwo = new TempClass();
//		Integer keyOne = new Integer(10);
//		Integer keyTwo = new Integer(10);
		System.out.println(keyOne.equals(keyTwo));
		System.out.println(keyTwo.equals(keyOne));
		checkWeakmap.put(keyOne, "Baskar");
		checkWeakmap.put(keyTwo, "Jaasritha");
		checkWeakmap.put(null, "Sahitya");
		System.out.println(checkWeakmap); //{com.collections.TempClass@15db9742=Baskar, null=Sahitya, 
											 //    com.collections.TempClass@6d06d69c=Jaasritha}
		
		
		WeakHashMap checkAnotWeakmap = new WeakHashMap(10);
		checkAnotWeakmap.put(10, "Baskar"); // HERE NO CHANCE OF MAKING REFERENCE TO NULL, DIRECTLY ASSIGNED
		checkAnotWeakmap.put(20, "Jaasritha");
		System.out.println(checkAnotWeakmap);
		
		keyOne = null; keyTwo = null; // IF REFERENCE ARE MADE NULL.
										// IN CASE OF HASMAP, GARBAGE COLLECTOR CANT DOMINATE HASHMAP
										// IN CASE OF WEAKHASMAP, GARBAGE COLLECTOR CAN DOMINATE WEAKHASHMAP AND
										// RELEASE THE ENTRY(KEY AND VALUE) IN THE WEAKHASHMAP
										// in case of normal Hashmap even references are made null, still the objects of keyOne and KeyTwo 
										// are associated to HashMap, so its not eleigible for GC.
																			
		System.gc();
		Thread.sleep(3000);
		System.out.println(checkWeakmap); //{null=Sahitya} 
		System.out.println(checkAnotWeakmap);
	}
}

class TempClass
{
	/*
	public String toString()
	{
		return "TempClass";
	}
	*/
	public void finalize()
	{
		System.out.println("Finalize method of TempClass Called !!!!!");
	}
}

/*
Output of the above program

false
false
{com.collections.TempClass@15db9742=Baskar, null=Sahitya, com.collections.TempClass@6d06d69c=Jaasritha}
{10=Baskar, 20=Jaasritha}
Finalize method of TempClass Called !!!!!
Finalize method of TempClass Called !!!!!
{null=Sahitya}
{10=Baskar, 20=Jaasritha}
*/