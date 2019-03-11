package com.collections
public class CollectionClass
{
	public static void main(String[] args)
	{
		System.out.println("Important Collection Points");
	}
	//If we want to represent a group of individual objects as single entity then we should go for collection.
	
	//1. growable in nature(runtime size will get increased / decreased), 2. Memory perspective(adviced to use), 3. Performance perspective(not advisable)
	//4. Can hold homogeneous and heretogeneous elements, 5. can hold only objects(no primitives support), 6. based on some underlying data structure
	// hense helper function support is available
	
	//9 Key interfaces (Collection, List, Queue, Set, SortedSet, NavigableSet, Map, SortedMap, NavigableMap)
	
	//1. Collection Interface(1.2V)
	//It defines the most common methods which are applicable for any collection object.
	//Its considered as Root Interface of collection framework
	//No concrete class which implements collection interface directly.
	
	//Difference between Collection(I) and Collections(C)
	//its an interface to represent a group of individual objects as single entity - Collection(I)
	//Its a utility class present in "java.util" package that defines several utility methods (sorting, searching etc ) for collection objects - Collection(C)
	
	// 2. List Interface(1.2V)
	// its child Interface of Colletion(I)
	// to represent a group of individual objects as single entity where DUPLICATES ARE ALLOWED AND INSERTION ORDER IS PRESERVED
	//Implemented class are ArrayList(C)(1.2V), LinkedList(C)(1.2V), (Vector(1.0V), Stack(1.0V) are Legacy Classes)
	//in 1.2v, Vector and Stack are reengineered to implement List(I)
	
	///3. Set Interface(I) (1.2V)
	/// its child interface of Collection(I)
	///to represent a group of individual objects as single entity where DUPLICATES ARE NOT ALLOWED AND INSERSION ORDER NOT PRESERVED	
	///Implemented class are HashSet(C - 1.2V), LinkedHashSet(C-1.4V), SortedSet(I-1.2V), NavigableSet(I-1.6V), TreeSet(1.2V - C)
	
	//4. SortedSet(I)(1.2V)
	// its child interface of Set(I), 
	// to represent a group of individual objects as single entity where 
	//DUPLICATES ARE NOT ALLOWED AND OBJECTS INSERTED ACCORDING TO SOME SORTING ORDER
	
	///5.NavigableSet(I)(1.6V)
	///Child of SortedSet(I)
	///It contains several methods for navigation purpose.
	
	//6.Queue(I)(1.5V)
	//its child interface of Collection(I)
	//if we want to represent a group of individual objects prior to processing then should go for Queue.
	//based on FIFO principle
	//Implemented class are PriorityQueue(C), BlockingQueue(C)(PriorityBlockingQueue(C), LinkedBlokingQueue(C)), DeQueue(C)... (all released 1.5V)
	
	
	///7.Map(I)(1.2V)
	///represent a group of individual objects as key-value pairs then we should go for Map(I)
	///Its not child interface of Collection
	///both key and values  are objects where duplicates not allowed in keys, duplicates allowed in values.
	///implemented class are HashMap(C)(1.2V)=>(LinkedHashMap(C)(1.4V)), WeakHashMap(C)(1.2V), IdentityHashMap(1.4V), 
	///(HashTable(C)(1.0V) => Properties(1.0V), HashTable is child of Map(I) and Dictionary(AC)(1.0V)
	///HashTable,Dictionary,Properties are from 1.0V, these are Legacy Classes.
	
	//8.SortedMap(I)(1.2V)
	//Child Interface of Map(I).
	//represent group of individual objects as key-value pairs based on some sorting order of keys.
	
	///9.NavigableMap(I)(1.6V)
	///Child interface of SortedMap
	///defines several methods for navigation purposes
	///Only implemented class is TreeMap(C)(1.2V)
	
	//////Legacy in Collection framework is Enumeration(I), Dictionary(AC), Vector(C), Stack(C), HashTable(C), Properties(C)
}