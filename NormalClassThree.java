//A File can Have any number of class defined and the file can be saved with any Name not necessary with one of the class name defined in the file.
//But Atmost one public class is allowed and the same public class name should be the filename 
// else we get CE:  error: class NormalClassOne is public, should be declared in a file named NormalClassOne.java

//for every class defined in a file=> on compilation a seperate .class file is defined
// executing the .class file will instantiate the main method defined in that class, if main() is not defined we get CE: NoSuchMethodError:main
// while executing a .class file, if the corresponding .class is not found then we get RE: NoClassDefFoundError:Classname

//Advantages are Readability and maintainability will be improved with below approach
//Not recommended to define multiple class in a single source file. 
//only one class in a source file.
//name of the class and name of file should match

public class NormalClassOne
{
	public static void main(String[] args)
	{
		System.out.println("NormalClassOne");
	}
}

class NormalClassTwo
{
	public static void main(String[] args)
	{
		System.out.println("NormalClassTwo");
	}
}