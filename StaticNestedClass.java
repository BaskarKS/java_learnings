package com.innerclass;

public class StaticNestedClass
{
	public static int outerClassMember = 123;
	public int outerNormalMember = 555;
	public static void main(String[] args)
	{
		System.out.println("StaticNested OuterClass Main Method Called");
		StaticInnerClass staticInnerClassObj = new StaticInnerClass();
		staticInnerClassObj.InstanceMethod("Called from Outer Class");
		
		StaticInnerClass.staticMethod(999);
	}
	
	public void outerClassInstanceMethod()
	{
		System.out.println(" Outer class Instance Method called " + outerNormalMember);
	}
	
	public static class StaticInnerClass //Inner Class defined with modifier static is "Static Nested Class"
	{
		///Static Nested class / Static Inner class can exist without existing outer class object. Hence its not strongly associated with outer class object.
		/// static inner class / static nested class can have instance methods defined
		/// Any other inner class cannot have static members inside defined. Static Inner Class / Static nested class can have static members and methods(main) 
		/// eligible to access only static members of the outer class. Cant access Instance Members of Outer class directly
		static int someVal = 987;
		public static void main(String[] args)
		{
			System.out.println("StaticInnerClass Main Method Called");
			//cant call outer class instance method / variable directly but can be invoked by creating an object
			StaticNestedClass outerClassIns = new StaticNestedClass();
			outerClassIns.outerClassInstanceMethod();
			
		}
		
		public void InstanceMethod(final String value)
		{
			System.out.println("In Static Inner Class - Instance Method - Passed arg is =>" +  value);
		}
		
		public static void staticMethod(final int value)
		{
			System.out.println("In static Inner class - static Method - passed arg =>" + value);
			System.out.println("In static Inner class - static Method - outer Class static member =>" + outerClassMember); ///outer class member
			
		}
	}
}

class OutsideClassInStaticNestedClass
{
	public static void main(String[] args)
	{
		System.out.println("In OutsideClassInStaticNestedClass Main Method");
		/// static Inner class called from outside of the defined class
		StaticNestedClass.StaticInnerClass staticInnerClassObj = new StaticNestedClass.StaticInnerClass();
		staticInnerClassObj.InstanceMethod("Called from Outside");
		StaticNestedClass.StaticInnerClass.staticMethod(100);
	}
}