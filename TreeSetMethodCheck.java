package com.collections;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Comparator;
public class TreeSetMethodCheck
{
	public static void main(String[] args)
	{
		//SORTED SET
		// its child interface of Set(I)
		// if we want to represent a group of individual objects based on "some sorting order and without duplicates" we should go for "Sorted Set"
		//Default Natural sorting order for Numbers if "ascending order" and for Alphabets is "Alphabetical Order"
		//contains "Six Methods"
		// 1. Object first() => return the first element of SortedSet
		// 2. Object last() => return the last element of SortedSet
		// 3. SortedSet headSet(Object Obj) => return SortedSet whose elements are < Obj
		// 4. SortedSet tailSet(Object Obj) => return SortedSet whose elements are >= Obj
		// 5. SortedSet subSet(Object Obj1, Object obj2) => return SortedSet whose elements are >= Obj1 and < Obj2
		//6. Comparator comparator() => returns comparator object that describes underlying sorting technique.
										// returns null, if the underlying sorting technique is "Default Natural Sorting Order"
										
		//TreeSet (1.2V)
		//Child of Set=>SortedSet=>NavigableSet
		//Underlying data structure is BalancedTree
		//Duplicate objects not allowed, null insertion is allowed(only once)
		//Insertion order not maintained/preserved.
		//Heterogeneous object insertion not allowed
		//If Default Natural sorting order is preferred then only we can add only homogeneous objects which implemented Comparable(I)
		//if we want to add Heterogeneous objects then we have to explicitly define our own comparator.
		//Implements Serializable, cloneable, but not RandomAccess.
		//All objects inserted based on some sorting order ("customized sorting order" or "default natural sorting order")
		
		//Four Constructors
		//1. new TreeSet(); => create treeset which will follow "default natural sorting order"
		//2. new TreeSet(Comparator c) => create treeset where elements will be inserted based on passed customized sorting order
		//3. new TreeSet(Collection c) => create treeset from the supplied collection values following default natural sorting order
		//4. new TreeSet(SortedSet s) => create treeset equivalent to some sorting order followed in SortedSet.
		
		TreeSet treeSetObj = new TreeSet();
		treeSetObj.add("A");
		treeSetObj.add("a");//When inserting object itself it compares and insert at the right location, 
							//Hence inserted objects should have implement Comparable(I)
		treeSetObj.add("B");
		treeSetObj.add("Z");
		treeSetObj.add("L");
//		treeSetObj.add(null); //java.lang.NullPointerException
//		treeSetObj.add(new Integer(10)); //java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println("Size of Tree => "+treeSetObj.size());
		System.out.println(treeSetObj);
		
/*		//StingBuffer doesnt implement Comparable Interface hence it cant be used in TreeSet		
		TreeSet checkComparable = new TreeSet();
		checkComparable.add(new StringBuffer("A")); // java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		checkComparable.add(new StringBuffer("B"));
		checkComparable.add(new StringBuffer("C"));
		System.out.println(checkComparable);
*/		
		//if we depend on "Default natural Sorting Order" then while adding objects into TreeSet, JVM will call compareTo method
		
		TreeSet checkComparable = new TreeSet(new MyStringBufferComparator()); // passed custom COmparator if passed objects dont implement Comparable
		checkComparable.add(new StringBuffer("A")); 
		checkComparable.add(new StringBuffer("Z"));
		checkComparable.add(new StringBuffer("K"));
		checkComparable.add(new StringBuffer("l"));
		System.out.println("String Buffer values in TreeSet =>"+checkComparable);
		
		
		System.out.println("A".compareTo("K"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		
		TreeSet custSortDesc = new TreeSet(new MyIntegerComparator());
		custSortDesc.add(8);
		custSortDesc.add(7);
		custSortDesc.add(6);
		custSortDesc.add(5);
		custSortDesc.add(4);
		custSortDesc.add(3);
		custSortDesc.add(2);
		custSortDesc.add(1);
		System.out.println(custSortDesc);
		
		TreeSet custStringDesc = new TreeSet(new MyStringComparator());
		System.out.println("Add - Baskar");
		custStringDesc.add("Baskar");
		System.out.println("Add - Sahitya");
		custStringDesc.add("Sahitya");
		System.out.println("Add - Jaasritha");
		custStringDesc.add("Jaasritha");
		System.out.println("Add - Ramani");
		custStringDesc.add("Ramani");
		System.out.println("Add - Suribabu");
		custStringDesc.add("Suribabu");
		System.out.println("Add - Yuva");
		custStringDesc.add("Yuva");
		System.out.println("Add - UmaDevi");
		custStringDesc.add("UmaDevi");
		System.out.println("Add - Devakshith");
		custStringDesc.add("Devakshith");
		System.out.println(custStringDesc);
		
		
		TreeSet heterogeneousObjects = new TreeSet(new myHeterogeneousComparator());
		heterogeneousObjects.add(new StringBuffer("ABC"));
		heterogeneousObjects.add(new StringBuffer("AA"));
		heterogeneousObjects.add("XX");
		heterogeneousObjects.add("ABCD");
		heterogeneousObjects.add("A");
		System.out.println(heterogeneousObjects);
		
	}
	static class myHeterogeneousComparator implements Comparator
	{
		public int compare(Object obj1, Object obj2)
		{
			String objOne = obj1.toString();
			String objTwo = obj2.toString();
			int lenOne = objOne.length();
			int lenTwo = objTwo.length();
			if(lenOne < lenTwo) {
				return -1;
			}
			else if (lenOne > lenTwo)
			{
				return 1;
			} 
			else
			{
				return objOne.compareTo(objTwo);
			}
		}
	}
	static class MyStringComparator implements Comparator
	{
			public int compare(Object obj1, Object obj2)
			{
				String firstObj = (String) obj1;
				String secondObj = (String) obj2;
				
				//return secondObj.compareTo(firstObj);
				//return -secondObj.compareTo(firstObj);
				int retVal = -firstObj.compareTo(secondObj);
				System.out.println("FirstObj => " + firstObj + "--- SecondObj => " + secondObj + " retVal = " + retVal);
				return retVal;
			}
	}
	
	static class MyStringBufferComparator implements Comparator
	{
			public int compare(Object obj1, Object obj2)
			{
				String firstObj = (String) obj1.toString();
				String secondObj = (String) obj2.toString();
				return firstObj.compareTo(secondObj);
			}
	}
	static class MyIntegerComparator implements Comparator
	{
		public int compare(Object obj1, Object obj2)
		{
				Integer firstObj = (Integer) obj1;
				Integer secondObj = (Integer) obj2;
/*			if (firstObj > secondObj)
				return -1;
			else if(firstObj < secondObj)
				return 1;
			else 
				return 0;
*/			
			int retVal = firstObj.compareTo(secondObj);
			System.out.println("FirstObj => " + firstObj + "--- SecondObj => " + secondObj + " retVal = " + retVal);
			return retVal;
		//	return -firstObj.compareTo(secondObj);
		}
	}

}

class Employee implements Comparable
{
	static class MyEmpComparator implements Comparator
	{
		public int compare(Object empOne, Object empTwo)
		{
			String empNameOne = ((Employee) empOne).empName;
			String empNameTwo = ((Employee) empTwo).empName;
			return -empNameOne.compareTo(empNameTwo);
		}
	}
	
	public int empId;
	public String empName;
	Employee(int id, String name)
	{
		empId = id;
		empName = name;
	}
	public String toString()
	{
		return empId + "..." + empName;
	}
	public int compareTo(Object obj)
	{
		int empIdOne = this.empId;
		Employee emp = (Employee) obj;
		int empIdTwo = emp.empId;
		if (empIdOne < empIdTwo)
			return -1;
		else if (empIdOne > empIdTwo)
			return 1;
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		System.out.println("Employee Class");
		
		TreeSetMethodCheck.MyStringComparator comp = new TreeSetMethodCheck.MyStringComparator();
		Employee empOne = new Employee(100, "Baskar");
		Employee empTwo = new Employee(200, "Babu");
		Employee empThree = new Employee(120, "Ramani");
		Employee empFour = new Employee(300, "Sahitya");
		Employee empFive = new Employee(350, "Jaasritha");
		//TreeSet empTree = new TreeSet(); // default comparator defined, sort is based on empid.
		TreeSet empTree = new TreeSet(new MyEmpComparator()); // custom comparator defined and sort will happen based on emp name.
		empTree.add(empOne);
		empTree.add(empTwo);
		empTree.add(empThree);
		empTree.add(empFour);
		empTree.add(empFive);
		System.out.println(empTree);
		
	}
}