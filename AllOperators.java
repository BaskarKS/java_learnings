public class AllOperators{
	
	
}

class IsInstanceMethodCheck
{
	public static void main(String[] args) throws Exception
	{
		// instanceof is an operator to check an object is of some particular type(class/Interface). 
		//Particular type(class/Interface) we know at beginning.
		
		//isInstance() is a method in Class class file. Also used to check whether an object is of some particular type(class/Interface). 
		//Particular type(class/Interface) we know at only dynamically at runtime.
		
		Thread t = new Thread();
		if (args.length > 0)
		   System.out.println(Class.forName(args[0]).isInstance(t));
		else 
			System.out.println("Enter a valid Class Name to check!!!...");
	}
}
class NewInstanceOperatorCheck
{
	public static void main(String[] args) throws Exception
	{
		//newInstance is a method present in class Class which is uses to create object like "new" operator
		Object o = Class.forName(args[0]).newInstance(); //=> this will create object of the class by invoking No-Arg Constructor
		// hence compulsary No-Arg constructor should have been defined for the class passed, else we get "InstantiationException"
		
		System.out.println("Object Created for : " + o.getClass().getName());
		
		//when using "new" operator, at runtime on failure of finding the .class file then we get unchecked error RE: NoClassDefFoundError
		//when using "newInstance" method, at runtime on failure of finding the .class file then we get checked Excep RE: ClassNotFoundException
	}
}

class EvaluationOrderAndPrecedence {
	public static void main(String[] args)
	{
		// precedence only for operators not for operands
		System.out.println(methodOne(1) + methodOne(2) * methodOne(3) / methodOne(4) + methodOne(5) * methodOne(6));
		//all operators same precedence eveluated from left => right.
	}
	public static int methodOne(int val)
	{
		System.out.println(val);
		return val;
	}
	
	//Highest Priority - UnaryOperation
	//Next level Priority - Binary Operation
	//Lowest Prority - Ternary Operation
	//Unary([], x++, x--, ++x, --x, ~, !, new, <type>)Arithmetic(*, /, %, +, -)Shift(>>, >>>, <<)Comparison(<, <= , > , >=, instanceof)
	//Equality(==, !=)Bitwise(&, ^ , |)Shortcircuit(&&, ||)Conditional(?:)Assignment(= , +=, -= , *=) (UASCEBSCA)
}
class NewAndSquareBracket
{
	public static void main(String[] args)
	{
		// new is used to create objects, after object is created then only constructor is called to perform initialization.
		// Constructor wont create objects. // delete is not there, destroying object allocation is taken care by GarbageCollector
		Thread t = new Thread();
		
		// [] is used to declare and create arrays.
		int[] intArray = new int[10];
		
	}
}
class ConditionalOperator
{
	public static void main(String[] args)
	{
		// ?:
		int x = (10 < 20) ? 30 : 40;
		System.out.println(x); //30
		int xx = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
		System.out.println(xx); //70
	}
}
class AssignmentOperators 
{
	public static void main(String[] args)
	{
		// 3 types => Simple, Chained, Compound.
		// Simple Assignement
		int normalAssign = 20;
		
		//VALID chained assignment case
		int a,b,c,d;
		a = b = c = d = 20;
		System.out.println(a + "..." + b + "..." + c + "..." + d);

		//INVALID chained assignment case		
//		int aa = bb = cc = dd = 20; //error: cannot find symbol bb, error: cannot find symbol cc, error: cannot find symbol dd
		// Cannot perform chained assignment at the time of declaration itself;
		
		//Assignment operator (=) mixed with other operators like + , *, / are called Compound Assignement
		//	 	+=	 	-=	 	*= 		/=	 	%=		 &= 		|=		^=		>>=		>>>=	 <<=
		byte byteVal = 10;
		byteVal += 1; // downcasting happens => typecasting taken care by compiler.
//		byteVal = byteVal + 1; //error: incompatible types: possible lossy conversion from int to byte // manual typecasting required
		System.out.println(byteVal);
		
		int aaa, bbb, ccc, ddd;
		aaa = bbb = ccc = ddd = 20;
		aaa += bbb -= ccc *= ddd /= 2;
		System.out.println(aaa + "..." + bbb + "..." + ccc + "..." + ddd); // -160...-180...200...10
	}
}
class TypecastingCases 
{
	public static void main(String[] args)
	{
		//IMPLICIT TYPECASTING - Done by compiler automatically - Assigning smaller datatype values to bigger datatype
		// Also called Upcasting / Widening
		//No loss of information Happens on this process
		double d = 10; //int to => double happens
		System.out.println(d); //output is 10.0
		int x = 'a'; //char value is assigned to int type.
		System.out.println(x); //output is 97
		
		//EXPLICIT TYPECASTING - Should be taken care by programmer - Assigning bigger datatype to smaller datatype
		// Also called Narrowing / DownCasting
		// there may be a chance of loss of information can happens
		int intVal = 130; // stored as 10000010
		byte b = (byte) intVal; // int to => byte
		System.out.println(b); //output is -126
		
		double precVal = 130.456;
		int intDoubleVal = (int) precVal;
		System.out.println(intDoubleVal); // 130 => .456 is lost
	}
}
class ShortCircuitOperator
{
		public static void main(String[] args)
		{
			//&&  and || -Operators applicable only for boolean types
			// a && b => b will be evaluated only if a evaluation result is true, if the result is false then b will not be evaluated
			// a || b => b will be evaluated only if the a eveluation result is false, if the result is true then b will not be evaluated
			int x = 10;
			if (++x < 10 && (x / 0 > 10)) //  (x / 0 > 10) wont be eveluated to raise ArithmeticException ( / by zero)
				System.out.println("Hello");
			else 
				System.out.println("Hai");
		}
}

class BitWiseOperators
{
	public static void main(String[] args)
	{
		//&  |  ^  Applicable for both Integral and Boolean values
		// ~  Applicable only for Integral not for Boolean
		// !  Applicalbe only for Boolean not for Integral values
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		System.out.println(~0); //~ not on Boolean type
		System.out.println(!false); //! not on integral types
	}
}
class InstanceOfOperator{
	public static void main(String[] args)
	{
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		//In instanceof operator, operands should have some relation parent <=>child. Otherwise we get CE : incompatible
//		System.out.println(t instanceof String); //CE: error: incompatible types: Thread cannot be converted to String
		String strVal = null;
		System.out.println(null instanceof Thread); // null instanceof AnyClass/Interface is always false.
		
	}
}
class EqualityOperatorConclusions
{
	public static void main(String[] args)
	{
		// "== and !=" are the operators, (Can be applied to all primitives data types) ( if applied on objects it does reference comparison)
		System.out.println(10 == 20);
		System.out.println(10 != 20);
		System.out.println('a' ==  97.0); //'a' value is promoted to double
		System.out.println(true != false); 
		System.out.println(false == false); 
		
		String ObjOne = new String("Baskar");
		String ObjTwo = ObjOne;
		String ObjThree = new String("Baskar");
		System.out.println(ObjOne == ObjTwo); 
		System.out.println(ObjOne == ObjThree); //false , == makes reference comparison
		
		// .equals operator - makes content comparison
		System.out.println(ObjOne.equals(ObjThree)); //true, equals make content comparison
		
		//if objects used on equality operator then the objects should have some relation parent <=> child. else we get CE: "incomparable types"
		String s = new String ("Baskar");
		Object o = new Object();
		Thread t = new Thread();
		System.out.println(t == o);
		System.out.println(s == o);
		//System.out.println(t == s); //error: incomparable types: Thread and String
		
	}
}
class RelationalOperatorConclucions
{
	public static void main(String[] args)
	{
		//< , <= , > , >= (Can be applied to all primitives except boolean)
		System.out.println(10 < 20); //true
		System.out.println('a' < 20); //false
		System.out.println('a' < 97.6); //true
		System.out.println('a' > 'A'); //true

//		System.out.println(true > false); //CE : 10: error: bad operand types for binary operator '>'
//		System.out.println("BaskarKS" > "Baskar"); //CE: 11: error: bad operand types for binary operator '>'
		
		//Nesting of Relational Operator not allowed, because first result will be boolean type and that will be used to compare with 3rd operand
//		System.out.println(10 < 20 < 30); // 14: error: bad operand types for binary operator '<'
	}
}

class StringConcatenateOperator
{
	public static void main(String[] args)
	{
		//Only operator OVERLOADED in Java is +
		String name = "Baskar";
		int b = 10, c = 20, d = 30;
		//Evaluated from left to right => if atleast one operand is String then Sting concat happens, if both the operands are int then arithmetic
		// addition happens
		System.out.println(name + b + c + d); //Baskar102030
		System.out.println(b + c + d + name); //60Baskar
		System.out.println(b + c + name + d); //30Baskar30
		System.out.println(b + name + c  + d); //10Baskar2030		
	}
}

class ArithmeticOperatorsConclusions
{
	public static void main(String[] args)
	{
		System.out.println(10/0.0); // result is double value and the result is expressed as "Infinity"
		System.out.println(-10/0.0); // result is double value and the result is expressed as "-Infinity"
		System.out.println(0.0/0); // result is expressed in double value as "NaN" (if the result is UNDEFINED we get NaN)
//		System.out.println(0/0); // result is expressed in int values as "Exception in thread "main" java.lang.ArithmeticException: / by zero"
		
		//Undefined results and Infinite values can be expressed in floating point arithmetic(float, double) using NaN, Infinity, -Infinity
		//Undefined results and Infinite values can be expressed in Integer arithmetic(byte, short, char, int) 
		// using RE:ArithmeticException: / by zero. This will be caused only by ( / and %) operators
		
		System.out.println(10 < Float.NaN);  //false
		System.out.println(10 <= Float.NaN); //false
		System.out.println(10 > Float.NaN); //false
		System.out.println(10 <= Float.NaN); //false
		System.out.println(10 == Float.NaN); //false
		System.out.println(Float.NaN == Float.NaN); //false
		System.out.println(10 != Float.NaN); //true
		System.out.println(Float.NaN != Float.NaN); //true
	}
}
class IncDecOperator
{
	public static void main(String[] args)
	{
		final int x = 10;
//		++10 : (Pre/Post) (Inc/Dec) operator can be applied only on variables not on constant values
//		int y = ++(++x); // Nesting of pre and post increment / decrement operators cannot be applied
//		x++; // error: cannot assign a value to final variable x
		boolean bool = true;
//		bool++; //error: bad operand type boolean for unary operator '++' : (Pre/Post) (Inc/Dec) operator cannot be applied on boolean
		System.out.println(x);
		
		byte a = 10;
		byte b = 20;
//		byte c = a + b; //error: incompatible types: possible lossy conversion from int to byte => max(int, typeof(a), typeof(b))
//		c = a + 1; //error: incompatible types: possible lossy conversion from int to byte.            or =>         c = (byte) a + 1;

		b++; // in case of (Pre/Post) (Inc/Dec) operator, typecasting will be taken care internally
		System.out.println(b);
	}
}