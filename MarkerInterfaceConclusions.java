interface MarkerInterfaceConclusions
{
	// if an interface doesnt contain any methods and by implementing that interface if our objects get some ability, 
	//such interface are marker/ability/tag interface
	
	//Serializable(I), Cloneable(I), RandomAccess(I), SingleThreadModel(I)...
	
	//By implementing Serializable marker interface our objects will get ability to save to a file / send across network
	//By implementing cloneable marker interface our objects will get ability to produce exact duplicate cloned copy.
	
	//how our object will get ability if that interface doesnt contain any methods? Internally JVM is responsible to provide the required ability.
	
	// why JVM is providing the required ability to marker interface? to reduce programming complexity and make JAVA language simple.
	
	// is its possible to define our own marker interface? Yes, customization of JVM is needed.
}