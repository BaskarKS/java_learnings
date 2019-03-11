package com.collections;
import java.util.*;
public class CollectionsReversing
{
	// collections class supported reversing elements for List is => public static void reverse(List l)
	public static void main(String[] args)
	{
		ArrayList listToReverse = new ArrayList();
		listToReverse.add(25);
		listToReverse.add("Baskar");
		listToReverse.add(10);
		listToReverse.add(35);
		listToReverse.add(15);
		System.out.println(listToReverse);
		Collections.reverse(listToReverse);
		System.out.println(listToReverse);
		
	}
}