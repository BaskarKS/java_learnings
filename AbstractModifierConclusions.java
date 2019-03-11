package com.baskar.java.conclusions;

abstract class partialImplementation{
	//Modifiers not applicable for abstract modifiers are "private, static, final, native, strictfp, synchronized"
	//private abstract void printValues(int... list);//error: illegal combination of modifiers: abstract and private
	//native abstract void printValues(int... list);//  error: illegal combination of modifiers: abstract and native
	//static abstract void printValues(int... list);// error: illegal combination of modifiers: abstract and static
	//strictfp abstract void printValues(int... list);// error: illegal combination of modifiers: abstract and strictfp
	//final abstract void printValues(int... list); // error: illegal combination of modifiers: abstract and final
	//synchronized abstract void printValues(int... list); // error: illegal combination of modifiers: abstract and synchronized 
	abstract void printValues(int... list); // only allowed modifers to abstract method is => public, protected, default, 
	
	//if a class contains atleast one abstract method(means partial implementation) then we should declare that class as abstract to restrict 
	// object creation/instantiation .
}
abstract class NoImplementation
{
	// even class doesnt contain abstract methods we still can declare class as abstract to restrict object creation/instantiation
	//Eg: HttpServlet class is abstract class with 0 abstract methods. doPost() and doGet() are methods to share error information.
}
public class AbstractModifierConclusions
{
	//Abstract modifier applicable for class and methods, but not for variables
	// child class is responsible to provide implementation of abstract methods of parent class. OR child class is forced to provide implementation
	// its like providing guidelines or forcing child to compulsary implement the methods defined abstract by parent.
	
	//for any class  -> object is not allowed to create because of partial Implementation then such type of class should be
	// declared with abstract modifier
	
	// if any modifiers(private, static, final, native, strictfp, synchronized) in method talks about implementation then
	// abstract modifier will become illegal combination to those modifiers.
	
	//if we extend an abstract class then all of its abstract methods should be implemented, otherwise the child class should be declared as abstract
	
	// abstract class promotes oop features "Inheritence"( force child class to extend and implement methods) and
	// "polymorphism"(forces child to override methods and provide implementation)
	
	// final class suppress oop features "Inheritence" ( restricts child to extend parent implementation), 
	// "polymorphism" (final methods inherited restricts child to override parent class method implementation)
	
	// Hence final and abstract modifier combination is not valid,
	// abstract class can contain final methods but final class cant contain abstract methods
	public static void main (String[] args)
	{
			
	}
}