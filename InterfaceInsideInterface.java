package com.innerclass;
interface Outer
{
	public void methodOuter();
	public static final int intConst = 999;
	String strConst = "Interface - OutsideInterface";
	interface Inner //inner interface is " public static" by default. No dependency, either only inner interface / either only outer interface can be implemented
					// outer and inner interface can be implemented independently.
	{
		public static final int intConst = 111;
		String strConst = "Interface - InsideInterface";
		public void methodInner();
	}
}

class OuterInterfaceClass implements Outer // class implementing only outer Interface
{
	public static void main(String[] args)
	{
		System.out.println("Outer Interface Implementation class");
		System.out.println("Interface variables (int) - " + intConst);
		System.out.println("Interface variables (String) - " + strConst);
		new OuterInterfaceClass().methodOuter();
	}
	
	public void methodOuter()
	{
		System.out.println("Outer Interface Implemented  Method called...");
	}
}

class InnerInterfaceClass implements Outer.Inner // class implementing only Inner Interface
{
	public static void main(String[] args)	
	{
			System.out.println("Inner Interface Implemented Class");
			System.out.println("Interface variables (int) - " + intConst);
			System.out.println("Interface variables (String) - " + strConst);
			new InnerInterfaceClass().methodInner();
	}
	
	public void methodInner()
	{
		System.out.println("Inner Interface Implemented method called...");
	}
}

class InnerWithOuterInterfaceClass implements Outer, Outer.Inner // class implementing both Inner and Outer Interfaces
{
	public static void main(String[] args)
	{
		System.out.println("Both Inner and Outer Interface Implemented");
		System.out.println("Outer Interface variables (int) - " + Outer.intConst);
		System.out.println("Outer Interface variables (String) - " + Outer.strConst);
		System.out.println("Inner Interface variables (int) - " + Outer.Inner.intConst);
		System.out.println("Inner Interface variables (String) - " + Outer.Inner.strConst);
		InnerWithOuterInterfaceClass obj = new InnerWithOuterInterfaceClass();
		obj.methodOuter();
		obj.methodInner();
	}
	
	public void methodOuter()
	{
		System.out.println("Outer Interface Implemented method called...");
	}
	public void methodInner()
	{
		System.out.println("Inner Interface Implemented method called...");
	}
}