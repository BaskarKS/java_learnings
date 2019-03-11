package com.innerclass;
public class NormalRegularInnerClass
{
	private int member = 10;
	private static int staticMember = 123;
	public void checkMethodTwo(final String display)
	{
		System.out.println("In checkMethodTwo() Instance method - "+ display);
		//CASE 2:=> Accessing inner class from Instance area of Outer Class => here its checkMethodTwo() method
		//new InnerClass().checkMethodOne(new Integer(222));
		InnerClass innerClassObj = new InnerClass();
		innerClassObj.checkMethodOne(new Integer(333));
	}
	
	public static void main(String[] args){
		//Without existing outer class object theres no chance of existing inner class object such classes are InnerClass
		// inner classes is "HAS-A" relationship
		//Innerclasses are introduces in java1.1 to fix GUI bugs as part of event handling mechanism
		//1. Normal/Regular Inner class 2. Method Local InnerClass 3. Anonymous Inner Class 4.Static Nested Class.
		
		System.out.println("Outer Class print check!!!");
		//CASE 1:=> Accessing inner class from static area of Outer Class => static area is (main method of outer class / any other static methods)
		NormalRegularInnerClass outerClassObj = new NormalRegularInnerClass();
		NormalRegularInnerClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
		innerClassObj.checkMethodOne(111);
		
		//Case 2:=> Accessing inner class from Instance area of Outer Class => here its checkMethodTwo() method
		outerClassObj.checkMethodTwo("Inner Class Invoked using Instance Method");
		
		//CASE 4:=>
		new NormalRegularInnerClass().new InnerClass().checkMethodThree();
		
		//CASE 5:=> checking inner class inside inner class
		NormalRegularInnerClass objOne = new NormalRegularInnerClass();
		NormalRegularInnerClass.InnerClass objTwo = objOne.new InnerClass();
		NormalRegularInnerClass.InnerClass.MostInnerClass objThree = objTwo.new MostInnerClass();
		objThree.checkMethodFour();
		// OR
		new NormalRegularInnerClass().new InnerClass().new MostInnerClass().checkMethodFour();
	}
	
	public class InnerClass // modifiers applicable for inner class are => private, protected, default, public, static, strictfp, final, abstract
	{
//		private static int member = 100; // cannot have static declarations inside inner classes
		private int member = 100;
	//	public static void main(String[] args) //error: Illegal static declaration in inner class NormalRegularInnerClass
											// cannot have static declarations inside inner classes
											

		public void checkMethodOne(final Integer val)
		{
			System.out.println("In Inner Class => passed Value => " + Integer.toString(val));
		}

		//CASE 4:=> // Normal/Regular inner class have rights to access static and instance members(public,private, protected,default) of outer class
		public void checkMethodThree()
		{
			final int member = 1000; // outer class variable, inner class variable, method local variable all having the same name.
			System.out.println(member); // accessing local variable 
			System.out.println(this.member); //accessing class level instance variable
			System.out.println(NormalRegularInnerClass.this.member); //accessing outer class level instance variable
			System.out.println(NormalRegularInnerClass.staticMember); //accessing outer class level instance variable
			System.out.println(staticMember); //accessing outer class level instance variable
		}
		
		class MostInnerClass
		{ // Nested Inner Class is possible=> (NormalRegularInnerClass => InnerClass => MostInnerClass)
			public void checkMethodFour()
			{
				System.out.println(InnerClass.this.member); 
				System.out.println(NormalRegularInnerClass.this.member);
				System.out.println(staticMember); //accessing outer class level instance variable
				System.out.println("Check Inner Most Inner Class !!!!!!!!! - checkMethodFour() called");
			}
		}
	}
}

class OutsideClass
{
	public static void main(String[] args)
	{
		//CASE 3:=> Accessing inner class from Other Class => here its main method of OutsideClass
		//Accessing inner Classes from "static area of outer class" and from "other class" is same 
		//(First outer class instance should be created to create inner class obj and then to invoke inner class methods)
		System.out.println("Main of OutsideClass Invoked!!!");
		
		new NormalRegularInnerClass().new InnerClass().checkMethodOne(777);
		//Above single line is equivalent to the below mentioned 3 lines
		NormalRegularInnerClass outerInnerClass = new NormalRegularInnerClass();
		NormalRegularInnerClass.InnerClass innerClassObj = outerInnerClass.new InnerClass();
		innerClassObj.checkMethodOne(999);
		
		Object retOBj = new NormalRegularInnerClass().new InnerClass();
		if (retOBj instanceof NormalRegularInnerClass)
			System.out.println("NormalRegularInnerClass Instance");
		else if(retOBj instanceof NormalRegularInnerClass.InnerClass)
			System.out.println("InnerClass Instance");
	}
}