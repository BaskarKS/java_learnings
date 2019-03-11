public class ArithmeticOperatorsConclusions
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