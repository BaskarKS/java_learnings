import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

import static java.lang.System.out;
// import static java.lang.Integer.*; //error: reference to MAX_VALUE is ambiguous
import static java.lang.Byte.*;
import static java.lang.Integer.MAX_VALUE;

public class ImportStatementConclusions
{
	public static void main(String[] args)
	{
		//Normal Import conclusions
		//Static Import conclusions
		
		//Normal Import:
		// used to import classes and interfaces of particular package, fully qualified name is not required to use. short names can be used
		// (EXPLICIT) => syntax : import packagename.classname => eg: import java.util.ArrayList;
		// (IMPLICIT) => syntax : import packagename.* => eg: import java.util.*;
		
		//Static Import:
		// used to import static members of particular class/interface, class name is not required to access static members.can directly access.
		// (EXPLICIT) => syntax : import static packagename.classname.staticmember => eg: import static java.lang.System.out;
		// (IMPLICIT) => syntax : import static packagename.classname.* => eg: import java.lang.System.*;
		
		
	}
}

class NormalImports{
	public static void main(String[] args)
	{
		//without import / Fully Qualified name
		ArrayList aList = new ArrayList(); // error: cannot find symbol => can be solved by using Fully-Qualified Name / import
		
		//Using fully-Qualified name increased code length and reduces Readability. Can be solved by using import statements
		//using import statements avoids to use the fully-Qualified name evertime and we are encouraged to use short name.
//		java.util.ArrayList aList = new java.util.ArrayList();
		
		
		//2 types of import
		// 1. Explicit import => Increases Readability of the code => highly recommended => eg: import java.util.ArrayList;
		//2. implicit import => reduces readability of code => worst practise => cant conclude which class is used => import java.util.*;
	
		// either we can use "fully qualified name"       (or)   "import" statements
		
		
		Date d = new Date(); //error: reference to Date is ambiguous =>Date class is present in both sql and util packages.
		System.out.println(d.getClass().getName()); //java.util.Date
		//While resolving Class names, compiler will gives the precedence in following order:
		//1. Explicit class import.
		//2. classes present in current working directory(default package)
		//3. Implicit class import.
		
		//when we import a java package, all class&Interfaces in that package is default available. but not subpackage classes/Interfaces.
		//if we want to use classes/interfaces in subpackage then we should import subpackage explicitly.
		//import java.util.* will import classes and interfaces only in java.util package, to get java.util.regex classes we should import it explicitly.
		
		// All classes and interfaces present in the below mentioned packages are by default available to every java program. 
		// No need explicit import statements.
		//1. java.lang package classes/interfaces.
		//2. classes / interfaces present in default package ( current working directory)
		
		//import statments are compile time concept, which will not affect run time performance
		// fully-Qualified import statements used class compile time is more than explicit import statements used class.
		
		//In C-Lang, #include will be loaded at beginning itself. Hence its "static include"
		//In java, no class will be loaded because of import statement. When we use a .class then only that particular class will be loaded
		// this is "Load on Demand" / "Load on Fly / "Dynamic Include"
		
	}
}

class StaticImports{
//	static int MAX_VALUE = 999;
	public static void main(String[] args)
	{
		//Introduced in 1.5V
		
		//Usage of static imports => reduces Readability and creates confusion.
		//Static members of class can be accessed by using className.staticMethod. 
		// Usage of static import, can use static variables/methods directly without class name.
		
		out.println("Static imports");
		out.println(MAX_VALUE);
		
		//while resolving static members compiler will consider the below mentioned precedence order.
		//1. Current class static members.
		//2. Explicit static imports.
		//3. Implicit static imports.
		
		//WHY STATIC IMPORT NOT RECOMMENDED TO USE:
		// 2 packages contains a class / interface with same name is rare and cause of this Ambiguity problem is rare in normal import
		// 2 packages contains a variable / method with same name is very common and cause of this
		//Ambiguity problem is very common in static import
		//usage of static import creates confusion and reduces readability.
	}
}