import static java.lang.System.out;
//final class ParentClass //---------------1 (Every method present inside final class is "final methods" by default - but variable need not be final)
class ParentClass
{
	//static int finalClassVariable  = 100; //-----------------1
	final int finalMethod()
	{
		//finalClassVariable = 10; //-------------1 (Final class variables need not be final)
		final int CONSTANT = 999;
		out.println("Parent Final Method - " + CONSTANT);
		return CONSTANT;
	}
	int normalMethod()
	{
		int anyValRet = 777;
		out.println("Parent Normal Method - " + anyValRet);
		return anyValRet;
	}
	
	//ADVANTAGE of FINAL CLASS
	// 1. can acheive security, no one can change or extend the functionality;
	// 2. can provide unique implementation
	//DISADVANTAGE of FINAL class ( miss key benifits of oops)
	// 1. inheritence not possible (if class is final)
	// 2. overriding (polymorphism) not possible (if method is final)
	// if there is not specific requirement , not recommended to go for final class
}

 final class ChildClass extends ParentClass //error: cannot inherit from final ParentClass ------------------1
{
	int normalMethod()
	{
		int anyValRet = 111;
		out.println("Child Normal Method - " + anyValRet);
		return 111;
	}
	/*
	int finalMethod() //error: finalMethod() in ChildClass cannot override finalMethod() in ParentClass
	{
		return 222;
	}
	*/
}

public class FinalModifierConclusions
{
	public static void main(String[] args)
	{
		//Final modifier is applicable to "class, methods, variables"
		
		//final method => methods available to child from parent through inheritence, if child is not satisfied with the implementation
		// child can override the method in child to define its own implementation. If parent method is final, then child cant override and define
		// its own implementation because the parent implementation is final.
		
		ParentClass parRefParObj = new ParentClass();
		ParentClass parRefChiObj = new ChildClass();
		ChildClass childRefChiObj = new ChildClass();
//		ChildClass childRefParObj = new ParentClass(); //error: incompatible types: ParentClass cannot be converted to ChildClass
		
		childRefChiObj.normalMethod();
		childRefChiObj.finalMethod();
	/*	out.println(childRef.normalMethod());
		out.println(childRef.finalMethod());
		*/
	}
}