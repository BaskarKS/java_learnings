package com.baskar.java.conclusions

public class ClassMembersModifiersConclusions
{
	public static void main(String[] args)
	{
		//"public" modifier on class members/variables and methods
		// if a member is declared as public then its visible everywhere, but to access its class visibility also plays a role.
		// Even if a method is public we cant access it from outside the package if the class modifer is defined as default.
		
		//"<default>" modifier on class members/variables and methods
		// if  a member is declared as default then we can access that member only with in the current package, from outside we cant access.
		// also known as package level access.
		
		//"private" modifier on methods and members/variables.
		// if a variable or method is private then it can be accessed only with in the class. cant access from outside
		// abstract and private is illegal combination: 
		//abstract method should be available to child class to implement but private methods are not avaialbe to child class.
		
		//"protected" modifier on methods and members/variables
		//if a member declared as protected, we can access anywhere with in current package and in child classes of outside package.
		// can access protected members with in current package anywhere using either by parent/child reference.
		// protected members outside current package can be accessed only by using child reference. parent reference cannot be used.
		// if we try to invoke/use protected members/methods of outside package, only the child class reference can be used to access 
	}
	
}