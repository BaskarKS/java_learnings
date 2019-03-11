package com.baskar.java.conclusions;
import static java.lang.System.out;

public class PackageConclusions
{
	public int packConclu = 9797;
	
	public static void main(String[] args)
	{
		// Package is a Encapsulation mechanism to group related class and interface into a single unit
		//Eg: classes and interface required for DB operations are grouped together under "java.sql" package
		//Eg: classes and interface required for File IO operations are grouped together under "java.io" package
		
		//ADVANTAGES
		//1. resolve naming confilicts ( unique identification of our components)
		//2. Improves modularity of application (module wise divided and ordered give good readability)
		//3. improves maintainability of application
		//4. provides security of out components(if modifier is default, access only with in the package. from outside cant be accessed)
		
		//HOW TO WRITE/DEFIINE PACKAGE
		//to get uniqueness on package name is to define it as "Internet domain name in reverse"
		
		//>javac -d . FileName.java ( generated .class file will be placed in corresponding package structure)
		// -d => destination to place generated class files
		// . => place it in current directory
		// can be executed by "java com.baskar.java.conclusions.PackageConclusions"
		
		//>javac -d d:\ Filename.java
		// d:\ => place the directory structure in d: drive
		// can be executed by "java -cp d:\ com.baskar.java.conclusions.PackageConclusions"
		
		//In any java source file there can be atmost 1 package statement. more than one not allowed.
		//In any java program the first non-comment statement should be package statement. othewise CE:class,interface or Enum expected
		
		//Valid java source file structure (order is important from 1-3)
		//1. atmost one package statement
		//2. any number of import statements
		//3. class/interface/enum declarations
		
		
		//file without anything is a valid java source file
		//file with only a single line of package statement is a valid java source file
		//file with only single line of import statement is a valid java source file
		//file with only 2 statements of package and import is a valid java source file
		//file with only empty class defined without package and import and main method is valid java source file
		out.println("Package conclusions");
	}
}
