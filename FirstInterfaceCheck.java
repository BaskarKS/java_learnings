// class using this interface are ServiceProvider and SubServiceProvider
interface FirstInterfaceCheck extends secondInterface, ThirdInterface
{
	public static int firstVariable = 111;
	void methodOne();
	void methodTwo();
	
	interface modifierCheckInnerInterface
	{
		public void methodFour();
	}
	
	//methods define inside interface are "public  abstract" by default.
	//	(make method avaialble to everyone(public), forcing to implement the method(abstract))
	// modifiers not applicable for interface methods are protected, private, final, static, native, synchronized strictfp
	//Interfaces can extend any number of interfaces at a time.
	// void methodOne(); == abstract public void methodOne();
	//if two interface contain same methodname and argument type and return type(signature) then only one method implementation is enough
	//if two methods contain same method name but different arg types then both methods implementation should be defined(overloaded methods)
	
	//if two methods with same methodname, same arguments but different return types => its impossible to implement both the interfaces
	//if return types are not covariant(1.5)
	
	//Eg: interface left { void m1();} interface right{ int m1();} => its impossible to define a class which can implement left and right interfaces.
	// a JAVA class can implement any number of interface simultaneously except 
	//of the above mentioned case of same method name with diff return types
	
	//interface can contain variables, its purpose is to define "Requirement level constants" should be used while implementation.
	//every interface variable is by default "public static final" => (make variable available to every implementation class(Public),
	//implementation class has to access variable without obj also(static), 
	//to avoid change by implementation class, one implementation class allowed to change will reflect to other implementation class(final).
	//as variables are (final,public, static) following modifiers cant be applied. "private, protected, transient, volatile"
	//variable initialization should be done at declaration itself, no other options available.
	
	// if we dont know anyhting about implementation and hwe just have service requirement its best to go for interface
	//if we talk about implementation(partial implementation) its best to go for Abstract Class
	//if we talk about implementation completely and ready to provide service best to go for concreate class
}