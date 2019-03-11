package com.java.pack.one;
public class AClass
{
	protected int protectedVal = 100;
	protected static void methodOne()
	{
		System.out.println("Method One in Class A");
	}
	void onlyParentAccess()
	{
		System.out.println("Private method of Parent");
	}
}

class BClass extends AClass
{
	static protected void methodOne()
	{
		System.out.println("Method One in Class B");
	}
	void onlyParentAccess()
	{
		System.out.println("Private method of child");
	}
		public static void main(String[] args)
		{
			AClass aVal = new AClass();
			aVal.methodOne(); // if the method is normal type then object type method will be called
			aVal.onlyParentAccess(); 
			System.out.println(aVal.protectedVal);
			
			BClass bVal = new BClass();
			bVal.methodOne();
			bVal.onlyParentAccess();
			System.out.println(bVal.protectedVal);
			
			AClass aRef = new BClass();
			aRef.methodOne(); // if the method is static type then reference type method will be called
			aRef.onlyParentAccess();
			System.out.println(aRef.protectedVal);

			//Say methodOne() is Overrided in parent(AClass) and Child(BClass)
			//if the methodOne() is not static type then the object type method will be called(i.e: if reference is parent type 
			//and object is child type then child method will be called)
			//if the methodOne() is static type then the reference type method will be called(i.e: if reference is parent type 
			//and object is child type then parent method will be called)
			
			//while overriding methods, 
			//we cant add static modifier in child method if its no there in parentmethod. 
			//we cant remove static modifier in child method if static modifier is declared in parent method.

		}
}