public class VarargMethodCases
{
	
	public static void main(String[] args)
	{
		sum();
		sum(100);
		sum(100,200);
		sum(10,20,30);
		prod("Two Values Passed", 10, 20);
		prod("FOUR Values Passed", 10, 20, 10, 10);
		
		//CASE 4
		methodOne(10);
		methodOne(new int[] {10,20});
		//CASE 5: 
		//Whereever One dimen array present we can replace with var-Arg parameter => m1(int[] x) => m1(int... x)
		
		//CASE 6
		//Wherever Var-Arg parameter present we cannot replace with single dimen array => m1(int... x) => m1(int[] x)
		
		//CASE 7
		int[] firstArray = new int[] {10,20};
		int[] secondArray = new int[] {30,40,50,60,70};
		twoDimenArrayPassed(firstArray, secondArray, new int[] {80, 90});
	}
	
	//CASE 2
	public static void prod(String toBeShown, int... prodValues) // if other params are also passed along with vararg params, then vararg 
																// should be the last param to be passed, also we cant have more than one
																//var-Arg parameter
	{
		System.out.println("in Var-Arg of Prod Method : " + toBeShown);
		int totalProdResult = 1;
		for (int value : prodValues)
			totalProdResult *= value;
		System.out.println("Product of Numbers is : " + totalProdResult);
	}
	
	//CASE 1
	public static void sum(int... intArgs) //intArgs is single Dimen array of the type int
	{
		int totalSum = 0;                                                
		System.out.println("in Var-Arg of Sum Method " + intArgs.length);
		for(int value : intArgs)
			totalSum += value;
		System.out.println("Total Sum : " + totalSum);
	}
	
	//CASE 3
	//error: cannot declare both singleDimenArray(int[]) and singleDimenArray(int...) in Var-Arg MethodCases
	// Leads to Ambiguity Problem below methods are not overloaded, both appears same signature (int... x) == (int[] x)
	/*
	public static void singleDimenArray(int... var_arg)
	{
		System.out.println("singleDimenArray - Var-Arg Method");
	}
	public static void singleDimenArray(int[] singleDimenArray)
	{
		System.out.println("singleDimenArray - singleDimenArray");
	}
	*/
	
	//CASE 4
	public static void methodOne(int... arg)
	{
		System.out.println(" methodOne var-Arg method");
	}
	//if methodOne(10) called below method has more priority than methodOne(int...) method. Var-Arg methods have least priority
	public static void methodOne(int arg)
	{
		System.out.println("methodOne  Single argument method");
	}
	
	//CASE 7
	public static void twoDimenArrayPassed(int[]... twoDimenArray)
	{
		int[] tempArry = null;
		for (int[] singleDimenArray : twoDimenArray)
			for (int intValue : singleDimenArray)
				System.out.println("In VarArg method of TwoDimen Array Passed : " + intValue);
	}
}