public class FlowControlConclusions
{
	
}

class TransferStatements
{
	public static void main(String[] args)
	{
		// BREAK => break can be used in switch , loops, labelled blocks
		int x = 0;
		switch(x)
		{
			case 0:
				System.out.println(0);
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
			default:
				System.out.println("Default");
		}
		for(int i = 0; i < 20; i++)
		{
			if (i == 5) break;
			System.out.println(i);
		}
		
		int val = 10;
		Label:{
				System.out.println("begin");
				if	(val == 10)
					break Label; // come out of the block with name => Label
				System.out.println("End");
		}
		System.out.println("Hello");
		
		//break used in "if" block will get CE: error: break outside switch or loop
/*
		int ifIntVal = 10;
		if (ifIntVal == 10)
			break;
		System.out.println("If - Block using break");
*/
		//CONTINUE - TRANSFER STATEMENT
		//can be used only in loops to skip current iteration and continue to next iteration
		for (int i = 0;i < 20; i++)
		{
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		//using of continue in "if" gives CE: error: continue outside of loop
/*
		int ifContinue = 10;
		if (ifContinue == 10)
			continue;
		System.out.println(ifContinue);

*/

		//Labelled break and continue
		
LoopLabel:	for (int i = 0; i < 3; i++)
			{	
				for(int j = 0; j < 3; j++)
				{
					if (i == j)
						break; //break LoopLabel, continue, continue LoopLabel
					System.out.println(i + "..." + j);
				}
			}

	}
}
class ForEachLoopConclusions
{
	public static void main(String[] args)
	{
		// Enhanced for loop, introduced in 1.5V
		
		//to print elements of single dimension array
		int[] intArr = {10,20,30,40,50};
		for (int element : intArr)
			System.out.println(element);
		
		//to print elements of 2 dimension array
		int[][] int2DimArr = {{1,2,3,4,5},{6,7,8,9}};
		for (int[] singleArr : int2DimArr)
		{
			for (int elem : singleArr)
			{
				System.out.println(elem);
			}
		}
		//LIMITATIONS:
		// its applicable only on Arrays and Collection objects, not a general purpose loop.		
		// cant print or retreive elements in reverse order
		// only objects which implement "java.lang.Iterable(I)" => contains one method "iterator()"  => "foreach loop can be used.
		// target element in for-each loop should be Iterable object. (obj said to be Iterable only if it implements java.lang.Iterable(I))
		//Iterable(I) introduced in 1.5V and contains one method => public Iterator iterator();
		
		//Iterator(I)=> contains in java.util package, related to collection framework, 3 methods(hasNext(), next(), remove().
		//vs Iterable(I) => contains in java.lang package, related to for-each loop, 1 method(void Iterator iterator())
	}
}
class ForLoopConclusions
{
	public static void main(String[] args)
	{
		// most commonly used and its best choice to use if we know the number of iterations in advance.
/*		for (int i = 0; true ; i++)
			System.out.println("Hi");
		*/
		
		//Can be empty loop
		for(int i = 0; i < 10; i++) ;

		// braces is not compulsary
		// if braces is not used then we can take only one statement and that one statement should not be declaration		
//		for (int i = 0; i < 10; i++) 
//			int x = 10;
		
		// for ( init section : condn section; iterative section) { body}
		//init section : 1. executed only once
					// 2. can declare and initialize local variables of loop
					// 3.  can declare and init any number of variables but of same type.
					// 4. can be empty also
					// 5. can be any valid statement including sopln
		//condition section
					// 1. evaluation result should be of boolean type.
					// 2. can be empty also, if empty then default value will be "true"
		// increment / decrement section
					// 1. can be any valid statement including sopln.
		// All three parts of loop are independent of each other and optional/
		
	// init section (or) increment / decrement section can be of any statement / expression
		int outOfLoop = 10;
		for (System.out.println("Init Section"); outOfLoop > 0; System.out.println("Inc\\Dec Section"))
		{
			System.out.println("Inside Loop");
			outOfLoop--;
		}
	}
}
class DoWhileLoopConclusions
{
	public static void main(String[] args)
	{
		// need to execute loop body atleast one, then go for do-while
		// do { body } while(boolean type condition);
		
		// braces is not compulsary
		// if braces is not used then we can take only one statement and that one statement should not be declaration

		do 
		while(true)
			System.out.println("Hello");
		while(true);
	}
}
class WhileLoopConclusions
{
	public static void main(String[] args)
	{
		// if we dont know the number of iterations in advance then we should go for "while loop".
		// Eg: Enumeration e; while(e.hasMoreElements()) { }.
		
		//passed parameter / result should be only of boolean type.
		
		// braces is not compulsary
		// if braces is not used then we can take only one statement and that one statement should not be declaration
//		while(true)
//			int x = 20; //CE: error: variable declaration not allowed here
		
		//conclustions on Unreachable statement error.
		//CASE 1
//		while(true) 
		{
			System.out.println("Hello");
		}
//		System.out.println("Hi"); // this line is unreachable statement

		//CASE 2
//		while(false) 
		{
//			System.out.println("Hi"); // this line is unreachable statement	
		}
		System.out.println("Hello");

		//CASE 3
		final int a = 10, b = 20; // since the variable is final, hence values become constant. 
		//Every final variable value will be replaced as value by compiler at compile time. 
		//If all values are constant in an expression then computation and result will be produced at compile time itself.
//		while(a > b) 
		{
//			System.out.println("Hi"); // this line is unreachable statement	
		}
		System.out.println("Hello");


	}
}
class SwitchBlockConclusions
{
	public static void main(String[] args)
	{
		// its not recommended to go for "nested if-else" if multiple "options/conditional" check should be done.
		//Only allowed argument types inside "switch(x)" are byte, short, char, int (Until 1.4)
		// Number of possiblilities to define cases, if int variable is used are -2147483648 to 2147483647
		// Boolean not allowed because of only 2 options are available(true / false)
		// Long not allowed because of its big range (64bytes), such big range of defining case values requirement is not required.
		// Float / Double not allowed because of many possibilities of values between 0-1.
		// allowed argument types (byte, char, short, int, Byte, Character, Integer, Short and "Enum") in 1.5V
		// allowed argument types (byte, char, short, int, Byte, Character, Integer, Short, Enum and "String") in 1.7V
		
		//Both "case" and "default" are optional. Empty switch block is allowed
		int x = 10;
		switch(x)
		{
			
		}

		//If atleast one statement is defined in switch that definitely should either be under "case" and "default". 
		// Otherwise multiple errors like CE: error: case, default, or '}' expected
		int xx = 10;
		switch(xx)
		{
//			default:
//				System.out.println("Testing without \"case\" or \"default\" labels");
		}
		
		// "case should always be constant, variable will cause CE: error: constant expression required"
		int xxx = 10;
		final int y = 10;
		switch(xxx)
		{
//			case xxx:
			case y:
				System.out.println("Testing \"case\" label should only be defined constant");
		}

		//argument to switch / case label can be expression. But the expression should be constant.
		int xxxx = 10;
		final int yy = 20;
		switch(xxxx + 15)
		{
			case 10+20+yy:
				System.out.println("Testing \"case\" label should only be defined constant");
		}
		
		// case label constant should be in range of the passed argument type. If argument is byte value and if the case value is higher the value
		//than byte range then we get CE:error: incompatible types: possible lossy conversion from int to byte
		byte b = 10;
		switch(b)
		{
			case 10:
					System.out.println("Value 10");
					break;
			case 100:
					System.out.println("Value 10");
					break;
/*			case 1000:
					System.out.println("Value 10");
					break;
*/
		}

		// case label constant should be in range of the passed argument type. if a constant is added to the argument 
		// then the value is promoted to int, CE error we wont get.
		byte bb = 10;
		switch(bb + 1)
		{
			case 10:
					System.out.println("Value 10");
					break;
			case 100:
					System.out.println("Value 10");
					break;
			case 1000:
					System.out.println("Value 10");
					break;
		}		
		
		//Duplicate cases not allowed. Otherwise CE: error: duplicate case label
		int xxxxx = 10;
		switch(x)
		{
			case 97:
					System.out.println("Value 10");
					break;
			case 98:
					System.out.println("Value 10");
					break;
			case 99:
					System.out.println("Value 10");
					break;
/*			case 'a': //error: duplicate case label
					System.out.println("Value 10");
					break;
*/
		}
		
		//fall-Through inside switch
		int xxxxxx = 10;
		switch(xxxxxx)
		{
			case 0:
					System.out.println("Value 10");
					break;			
			case 10:
					System.out.println("Value 10");
			case 20:
					System.out.println("Value 10");
					break;			
			case 30:
					System.out.println("Value 10");
			default:
					System.out.println("Value 10");
		}
		//if any case is matched , from that case onwards all statements will be executed until "break" or "end" of switch.
		//Advantage of fall-through => code-reusablility because of common action for multiple cases.
		
		// All Conclusion:
		// 1. Duplicate case labels not allowed
		// 2.  case label should be constant or constant expression.
		// 3. case label value should be in the range of the argument type.
		//4.  we can take default case at-most once. and it will be executed if theres no case matched. 
			//It can be written anywhere, but recommended to write at last.
	}
}
class IfElseConclusions
{
	public static void main(String[] args)
	{
		// only allowed / result type to be passed is "boolean"
		if (true)
//			int x = 10; //:11: error: variable declaration not allowed here
		//under "If", if theres only one statement without {} then that statement shouldnt be Declaration.
		// "else" block and {} braces are optional, if no {} braces then only one statement is allowed under "if"
		
		if(true) ; // empty statement in "if" block is also allowed
	
//There is no "Dangling else problem" in java. Every else is mapped to the nearest "if" block. "else[2]" is mapped to "if[2]"
		if (true) //[1]
			if (true) //[2]
				System.out.println("Hello");
		else //[2]
			System.out.println("Hi");
	}
}

