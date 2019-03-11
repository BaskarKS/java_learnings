public class MainMethodCases
{
	//Below 2 cases compiler wont check. JVM is responsible to check, if its not able to find then we get RE:NoSuchMethodError:main until 1.6V
	//1. whether class contains main method / not
	//2. Whether main method is declared as per the syntax or not.

// CASE 2	 - below are valid method declarations
//	static public void main(String[] args) // modifiers can be interchanged order
//	public static void main(String []args)
//	public static void main(String args[])
//	public static void main(String[] anyName)
//	public static void main(String... args)
//	public final synchronized strictfp static void main(String... args) // can us " strictfp, final, synchronized" modifiers

//CASE 3 - Invalid declarations below
//	public static void Main(String[] args) // "main" not "Main"
//	public static void main(String args)
	public static void main(String[] args)
	{
		System.out.println("Main method of MainMethodCases class called : String[] passed");
	}

//CASE 4 : overloaded method defined below, but JVM will never call this method we can use it calling it explicitly.
	public static void main(int[] args)
	{
		System.out.println("MainMethod Cases verification : int[] passed");
	}
	
//CASE 7: until 1.6V if main method is not defined we get RE:NosuchMethodError:main, 
		//after 1.7V we get elaborated information to define main method with right syntax
	
//CASE 8: until 1.6v if main method is not defined and if we run the class file. Static block will get executed and throws RE:NoSUchMethodError
		//After 1.7v if main method is not defined and if we run the class file. Static block wont get executed. We get detailed explana on error.
	static {
		System.out.println("Static Block Defined : ");
	}
	
//CASE 9:
	//Order of execution is same in 1.6v and 1.7v(staticBlock -> MainMethod). But from 1.7V, only if main method is defined syntactically correct.
	//Only then execution starts with (staticBlock -> MainMethod). But in 1.6V, execution start directly by executing static block and then 
	//check for main method if its not there then RE:NoSUchMethodError:main is thrown.
	//From 1.7v onwards its impossible to print some statements to console without defining the main method.
}

class MainMethodCasesChild extends MainMethodCases{
	//CASE 5 (This class doesnt contain main method)
	//Doesnt contain Main Method, executing this class. its parent class main method inherited and will be called.
	
	//CASE 6 - below method with same signature defined in child class. Defining it same is not called MethodOverRiding its MethodHiding.
	public static void main(String[] args)
	{
		System.out.println("Main method of MainMethodCasesChild class called :");
	}
}