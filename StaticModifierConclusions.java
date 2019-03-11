public class StaticModifierConclusions
{
	static int oneInstanceAtClass = 100;
	public static void main(String[] args)
	{
		// static is modifier appicable only for methods, variables and InnerClasses(Static nested-classes). Cannot be applied on outer class
		// if a variable is declared as static, only one copy of variable will be maintained at class level and the same shared across the created objects
		
		StaticModifierConclusions instObj1 = new StaticModifierConclusions();
		StaticModifierConclusions instObj2 = new StaticModifierConclusions();
		StaticModifierConclusions instObj3 = new StaticModifierConclusions();
		
		System.out.println(instObj1.oneInstanceAtClass);
		instObj1.oneInstanceAtClass = 200;
		System.out.println(instObj2.oneInstanceAtClass);
		System.out.println(instObj3.oneInstanceAtClass);
		
		//Cannot access instance variable(without object) directly from static area(method / block). 
		//Can access static (variables/methods) directly from static area
		
	}

	//return type and modifiers are not part of method signature
/*	
	int intVal = 10; //1
	static int intVal = 10; //2 //error: variable intVal is already defined in class StaticModifierConclusions (1 and 2 active)

	public void printMethod() //3
	{
		System.out.println(intVal);
	}
	public static void printMethod() //4 //error: method printMethod() is already defined in class StaticModifierConclusions (3 & 4 active)
	{
		System.out.println(intVal); //error: non-static variable intVal cannot be referenced from a static context (1 and 4 are active)
	}
*/
}

class ParentClass
{
		public static void printMethod(int intVal)
		{
			System.out.println("ParentClass OverLoaded Int method : " + intVal);
		}
		
		public static double printMethod(String display)
		{
			System.out.println("ParentClass OverLoaded String method : " + display);
			return 10.0;
		}
}

class ChildClass extends ParentClass
{
	public static void printMethod(int intVal)
	{
		System.out.println("ChildClass Overridden Int Method : " + intVal);
	}
	
	public static double printMethod(String display)
	{
		System.out.println("ChildClass Overridded String Method : " + display);
		return 10.1;
	}
	
}

class CheckPolymorphismStaticMethods
{
	public static void main(String[] args)
	{
/*		
		ParentClass.printMethod(10);
		ParentClass.printMethod("Parent");
		ChildClass.printMethod(100);
		ChildClass.printMethod("Child");
*/		
		ParentClass parentRef = new ParentClass();
		parentRef.printMethod(10);
		parentRef.printMethod("ParentObj");
		
		ChildClass childRef = new ChildClass();
		childRef.printMethod(100);
		childRef.printMethod("ChildObj");
		
		ParentClass parRef = new ChildClass(); 
		parRef.printMethod(20); //since method is static, parent method will be called even child object is used because its based on reference.
		parRef.printMethod("ChildObj");
		
		//Say printMethod() is Overrided in parent(ParentClass) and Child(ChildClass)
		//if the printMethod() is not static type then the object type method will be called(i.e: if reference is parent type 
		//and object is child type then child method will be called)
		//if the printMethod() is static type then the reference type method will be called(i.e: if reference is parent type 
		//and object is child type then parent method will be called)
		
		//For static methods, inheritence, overloading concepts are applicable. 
		// overriding concept is not applicable, instead of overriding "Method Hiding" concept is applicable.
		
		//WHEN TO DEFINE STATIC / INSTANCE METHODS?
		// inside method if atleast one instance variable is used then that method talks about a particular object hence 
		//such methods should be defined as instance methods.
		
		//inside method implementation if we are not using any instance variable then this method is no way related to particular object
		//hence such type of method should be defined as static methods irrespective of static variables used or not.
		
		//abstract(doesnt entertain implementation) static(forces implementation) combination is illegal
		
	}
}