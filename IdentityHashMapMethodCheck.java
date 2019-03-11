package com.collections;
import java.util.IdentityHashMap;
import java.util.HashMap;

public class IdentityHashMapMethodCheck
{
	public static void main(String[] args)
	{
		System.out.println("IdentityHashMap Check!!!!");
		//Underlying Data-structure is HashTable
		//Insertion Order is not preserved and its based on Hashcode of keys
		//Heterogeneous objects are allowed for both keys and values.
		//null is allowed for key(only once), for values(any Number of times)
		//It implements Serializable, Cloneable, but not RandomAccess
		//best choice for "search" operation
		// exactly same as HashMap including methods and Constructors.
		//.equals method does content comparison, where "==" does reference comparison
		// Usually HashMap uses .equals() method to confirm/check duplicates among keys.
		// Usually IdentityHashMap uses "==" operator to confirm/check duplicates among keys.
		
		
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
		// new IdentityHashMap();
		//new IdentityHashMap( int intialCapacity)
		//new IdentityHashMap(int initialCapacity, float fillRatio);
		//new IdentityHashMap(Collection c)
		
		Integer keyOne = new Integer(10);
		Integer keyTwo = new Integer(10);
		Integer keyThree = new Integer(10);
		String valOne = "Baskar";
		String valTwo = "Sahitya", valThree = "Jaasritha";
		System.out.println(keyOne.equals(keyTwo));
		System.out.println(keyTwo.equals(keyThree));
		
		HashMap checkMapKeyContents = new HashMap(10);
		checkMapKeyContents.put(keyOne, valOne);
		checkMapKeyContents.put(keyTwo, valTwo);
		checkMapKeyContents.put(keyThree, valThree);
		System.out.println(checkMapKeyContents); //{10=Jaasritha} // Key is found as duplicate, hence all values are replaced on same key, has last value.
		
		IdentityHashMap identityMapCheck = new IdentityHashMap(10);
		identityMapCheck.put(keyOne, valOne);
		identityMapCheck.put(keyTwo, valTwo);
		identityMapCheck.put(keyThree, valThree);
		System.out.println(identityMapCheck); //{10=Baskar, 10=Jaasritha, 10=Sahitya}
		System.out.println("contains key => " + identityMapCheck.containsKey(new Integer(10))); 
		System.out.println("contains value => " +identityMapCheck.containsValue("Baskar")); 
		System.out.println("get from map with KeyTwo => " + keyTwo + identityMapCheck.get(keyTwo)); 
		System.out.println("get from map with Key - Integer 10 => " + identityMapCheck.get(new Integer(10))); 
		System.out.println("get from map with Key - int 10 => " + identityMapCheck.get(10)); 
		
	}
}