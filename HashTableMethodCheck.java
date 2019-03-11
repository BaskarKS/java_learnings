package com.collections;
import java.util.Hashtable;
public class HashTableMethodCheck
{
	public static void main(String[] args)
	{
		//Underlying DataStructure is Hashtable
		//Insertion order is not preserved and its based on HashCode of Keys
		//Duplicate keys not allowed, but values can be duplicated
		//Heterogeneous objects are allowed for both keys and values
		//null is not allowed for BOTH key and Values.
		//It implements Serializable, Cloneable but not RandomAccess
		// EveryMethod present in HashTable is Synchornized and hence HashTable object is ThreadSafe
		// its bestchoice if our frequent operation is "Search"
		
		//Four Constructors
		// 1. new Hashtable(); //default initial capacity is 11 and default fill ratio is 0.75%
		// 2. new Hashtable(int initialCapacity)
		//3.  new Hashtable(int initialCapacity, float fillRatio)
		//4. new Hashtable(Map m);
		
		Hashtable hashtableObj = new Hashtable();
		hashtableObj.put(new CustomKey(5), "A");
		hashtableObj.put(new CustomKey(2), "B");
		hashtableObj.put(new CustomKey(6), "C");
		hashtableObj.put(new CustomKey(15), "D");
		hashtableObj.put(new CustomKey(23), "E");
		hashtableObj.put(new CustomKey(16), "F");
//		hashtableObj.put("Bas", null); //java.lang.NullPointerException
		System.out.println(hashtableObj); // hashcode ret value is i =>{6=C, 16=F, 5=A, 15=D, 2=B, 23=E} based on size of Hashtable is 11 and (i %11)
										// if the return value of hashCode is (i %9) then outputs is => {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}
	}
}

class CustomKey
{
	public int i;
	CustomKey(int val)
	{
		this.i = val;
	}
	public int hashCode()
	{
//		return i;  //this will make the values to store in the table based on size of hashtable is 11 and calculation will be (i %11)
		return (i % 9); //this will make the values to store in the table based on size of hashtable is 9 and calculation will be (i %9)
	}
	public String toString()
	{
		return i+"";
	}
}