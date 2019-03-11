package com.collections;
import java.util.TreeMap;
public class NavigableMapMethodCheck
{
	//NavigableMap is child interface of SortedMap(I), defines several methods for NavigationPurpose
	// Seven(7) Methods
	//1. floorKey(e)
	//2. lowerKey(e)
	//3. ceilingKey(e)
	//4. HigherKey(e)
	//5.pollFirstEntry()
	//6.pollLastEntry()
	//7. descendingMap
	public static void main(String[] args)
	{
		TreeMap<String,String> treeMapObj = new TreeMap<String,String>();
		treeMapObj.put("b", "banana");
		treeMapObj.put("c", "cat");
		treeMapObj.put("d", "dog");
		treeMapObj.put("a", "apple");
		treeMapObj.put("e", "elephant");
		treeMapObj.put("g", "gun");
		System.out.println(treeMapObj);
		System.out.println(treeMapObj.ceilingKey("c"));
		System.out.println(treeMapObj.higherKey("e"));
		System.out.println(treeMapObj.floorKey("e"));
		System.out.println(treeMapObj.lowerKey("e"));
		System.out.println(treeMapObj.pollFirstEntry());
		System.out.println(treeMapObj.pollLastEntry());
		System.out.println(treeMapObj.descendingMap());
		System.out.println(treeMapObj);
	}
}