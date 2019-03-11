class MethodLocalInnerClass
{
	public String outerStringVar = new String("Outer Instance Variable");
	private static String outerStaticStringVar = new String("Outer Static Variable");
	
	public void instanceCalcMethod(int argOne, int argTwo) {
		final int valOne = argOne;
		int	valTwo = argTwo;
		class InnerCalcClass
		{
			public int calcSum(int argOne, int argTwo)
			{
				System.out.println("Accessed in Instance Method " + outerStringVar);
				System.out.println("Accessed in Instance Method " + outerStaticStringVar);
				System.out.println("Accessing Final Local Variable of Method -" + valOne);
				System.out.println("Accessing Normal Local Variable of Method -" + valTwo);
				return argOne + argTwo;
			}
			public int calcProd(int argOne, int argTwo)
			{
				return argOne * argTwo;
			}
		}
		InnerCalcClass calcObj = new InnerCalcClass();
		System.out.println("Addition of Args: " + calcObj.calcSum(valOne, valTwo));
		System.out.println("Prod of Args: "+ calcObj.calcProd(valOne, valTwo));
	}
	
	public static void staticCalcMethod(int argOne, int argTwo) 
	{
		class InnerClassCalcArgs //only applicable modifiers are final, abstract,strictfp any other modifiers applied get "error: illegal start of expression"
		{
			public int calcNegate(int valOne, int valTwo)
			{
				//System.out.println("Accessed in Static Method " + outerStringVar); //non-static variable outerStringVar cannot be referenced from a static context
				System.out.println("Accessed in Static Method " + outerStaticStringVar);
				return valOne - valTwo;
			}
			public int calcDiv(int valOne, int valTwo)
			{
				return valOne / valTwo;
			}
			public int calcModulo(int valOne, int valTwo)
			{
				return valOne % valTwo;
			}
		}
		InnerClassCalcArgs calcObj = new InnerClassCalcArgs();
		System.out.println("Negation of Args: " + calcObj.calcNegate(argOne, argTwo));
		System.out.println("Division of Args:  " + calcObj.calcDiv(argOne, argTwo));
		System.out.println("Modulo of Args:" + calcObj.calcModulo(argOne, argTwo));
		
	}
	public static void main(String[] args)
	{
		// to acheive "Method specific repeatedly required functionality"
		// best suitable to meet nested method requirements
		
		//can be accessed only in the defined methods, cannot be accessed outside
		//cant be defined in both instance and static methods
		// if defined inside instance method, the methodlocalinner class can access instance and static members of outer class
		//if defined inside static method, the methodlocalinner class can access only static members of the outer class.
		//methodlocalinner class can access only final local variables of the method, cant access the normal local variables in the method.
		//only applicable modifiers for method local inner class are "final, abstract, strictfp"
		MethodLocalInnerClass localObj = new MethodLocalInnerClass();
		localObj.instanceCalcMethod(10,20);
		localObj.instanceCalcMethod(5,10);
		MethodLocalInnerClass.staticCalcMethod(20,10);
		MethodLocalInnerClass.staticCalcMethod(10,5);
	}
}