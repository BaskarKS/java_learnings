public class AutoUnboxingCase
{
	static Integer wrapperObj;
	public static void main(String[] args)
	{
//		int prim = wrapperObj; //java.lang.NullPointerException 
								  //wrapperObj is static wrapper which is initialized to null, while performing AutoUnboxing we get NPE
//		System.out.println(prim);		
		
		
		//Modification will initiate to create new object because of immutable in nature.
		Integer intObjOne = 10;
		Integer intObjTwo = intObjOne; //intObjOne and intObjTwo pointing to the same object which containts value 10
		intObjOne++; // intObjOne = intObjOne + 1; //modification happens on intObjOne hence new object will be assigned to intObjOne with new Value
		System.out.println(intObjOne); //intObjOne points to object contains new value of 11
		System.out.println(intObjTwo); //intObjTwo points to object contains value of 10
		//Wrappers are immutable in nature, if any modification of value will tenD to create new object.
		
		//conclusion 3
		//AutoBoxing is implemented with buffer object reuse concept with some specific value ranges for integral(-128 to 127),
		// boolean (always) and character(0-127) types //not applicable for Float and Double types.
		//applicable only if we directly initialize constants or using valueOf() // not for creating wrapper objects using new() operator
		Integer intNoBuffOne = new Integer(10);
		Integer intNoBuffTwo = new Integer(10);
		System.out.println(intNoBuffOne == intNoBuffTwo); //false //no buffer applicable
		
		Integer intYesBuffOne = 10;
		Integer intYesBuffTwo = 10;
		System.out.println(intYesBuffOne == intYesBuffTwo);///true //buffer applicable its with in the range
		
		Integer intOutOfRangeOne = 130;
		Integer intOutOfRangeTwo = 130;
		System.out.println(intOutOfRangeOne == intOutOfRangeTwo);//false //crosses range value of 127
		
		Integer intYesBuffValueOfOne = Integer.valueOf(127);
		Integer intYesBuffValueOfTwo = Integer.valueOf(127);
		System.out.println(intYesBuffValueOfOne == intYesBuffValueOfTwo); ///true //buffer applicable for valueof() also
		
		Boolean buffValidOne = false;
		Boolean buffValidTwo = false;
		System.out.println(buffValidOne == buffValidTwo);///true //buffer applicable for Boolean also
		
		int whichDominates = 10;
		mOne(10); //Widening Concept called- 10
//		wideningFollowAutoBoxing(10); //widening followed by AutoBoxing is not supported in java. 10 should be converted to long and then autobox 
											//should happen to match the function
		autoBoxingFollowWidening(10); //first autoboxing happens 10(int) converted to Integer(10) then assigned to Object
											//Integer is child and Object is parent => child to parent assignment is widening
	}
	//OverLoaded Methods
	//Widening dominates AUtoboxing
	public static void mOne(Integer value)
	{
		System.out.println("AutoBoxing Concept Called- " + value);
	}

	public static void mOne(long value)
	{
		System.out.println("Widening Concept called- " + value);
	}

	public static void mOne(int... value)
	{
		System.out.println("Var-Args Concept called- " + value);
	}
	//AutoBoxing dominates Var-Arg method
	//Conclusion
	//Var-Arg get the least priority //something like default case in switch
	//Priority Order
	//1.Widening method
	//2. AutoBoxing method
	//3.Var-Arg method
	public static void wideningFollowAutoBoxing(Long value)
	{
		System.out.println("wideningFollowAutoBoxing called - " + value);
	}
	public static void autoBoxingFollowWidening(Object val)
	{
		System.out.println("AutoBoxing Follows by Widening" + ((val instanceof Integer) ? ((Integer)val).intValue() : null));
	}
}