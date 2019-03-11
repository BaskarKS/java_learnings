//package com.baskar.java.conclusions;
import static java.lang.System.out;

public class FinalVariablesConclusions
{
	public static void main(String[] args)
	{
		out.println("FinalVariableConclusions");
	}
}

class FinalInstanceVariables
{
	public final int intVal = 99;
	final float fltVal;
	public final String alertMsg;
//	final byte byteVal; //error: variable byteVal might not have been initialized
	final byte byteVal = 10;
	//Instance Block
	{
		alertMsg = "Recheck the Declaration";
	}
	FinalInstanceVariables()
	{
		fltVal = 10.5F;
	}
	public void printValues()
	{
//		byteVal = 15; //error: cannot assign a value to final variable byteVal
		out.println(intVal + "..." + fltVal + "..." + alertMsg + "..." + fltVal);
	}
	public static void main(String[] args)
	{
		//If value of variable varied from object to object such variables are called instance variables, every object have a seperate copy of variables.
		//For instance variables, not compulsary to initialize it explicitly. JVM will provide default values on object creation.
		
		// for FINAL instance variables, explicit initialization should be done by programmer. JVM wont provide default values.
		// final instance variables can be initialized only the below mentioned places.
		//1. At the time of Declaration of variables.
		//2. In Instance Block.
		//3. In constructor, before constructor completes.
		
		new FinalInstanceVariables().printValues();
	}
}

class FinalStaticVariables 
{
	public final static String initMsg = "Init done at Declaration\n"; //error: variable intValue not initialized in the default constructor
	public final static String alertMsg;
	
	static 
	{
		alertMsg = " Initialization done in static block";
	}
	public static void main(String[] args)	
	{
			//If the value of variable is not varied from object to object then such type of variables shouldnt be declared as instance variables
			//they should be declared with modifier "static"
			
			//Each object will contain a seperate copy in the case of instance variables, for static variables a single copy will be maintained 
			// at class level and shared across all the objects of the class.
			
			//Its not required to perform explicit initialization for static variables, JVM will take care by initialize it with default values.
	
			//if "static" variable is declared as final then compulsary it has to be initialized explicity by programmer. otherwise CE.
			//initialization of final static variables should be done before class loading completes.
			
			//below are the only two options where the intialization should be done
			//1. At the time of Declaration.
			//2. Inside static block.
			
		System.out.println(initMsg +"..."+ alertMsg);
	}
}

class FinalLocalVariables
{
	public static void main(String[] args)
	{
		int localUnused;
		int localUsed = 10;
		final String finalAutoUnused;
		final String finalUsed = "Final Auto variable used locally";
		out.println(finalUsed +" => "+ localUsed);
		//out.println(finalAutoUnused +" => "+ localUnused); //error: variable finalAutoUnused might not have been initialized
		
		//to meet temporary requirements we need to declare and use variables in "block / methods / constructor"  such type of variables are
		// called "auto / local / temporary / stack " variables
		
		//For Local variables JVM will not provide default values, programmer has to initialize it before using it.
		
		//if we are not using the variable its not required to initialize it.
		
		//even though local variables are "final" its not compulsary that it should be initialized while declaring it. if we dont use it, no need to 
		// initialize it. wont get compilation error saying "final variables should be initialized while declaring it"
		
		// only applicable modifier to "local" variable is "final"
		
		// if we dont declare any modifier to methods or variables or classes then the scope become default. but this rule is applicable only for
		// instance and static variables but not for local variables
		
		formalParams(100,200);
	}
	
	static void formalParams(final int firstVal, int secondVal)
	{
//		firstVal = 10; //error: final parameter firstVal may not be assigned
		secondVal = 20;
		System.out.println(firstVal + "..." + secondVal);
		
		//Formal Params (firstVal and secondVal acts as local variables with in formalParams() method). Hence variables firstVal and scondVal
		//can be declared as final. If the formal parameters declared as final then with in that method we cant perform re-assignment.
	}
}