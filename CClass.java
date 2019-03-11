package com.java.pack.two;
import com.java.pack.one.AClass;
public class CClass extends AClass
{
	public static void main(String[] args)
	{
		AClass aRef = new AClass();
		//aRef.methodOne();
		CClass cRef = new CClass();
		cRef.methodOne();
		System.out.println(cRef.protectedVal);
		AClass ARefCObj = new CClass();
		//System.out.println(ARefCObj.protectedVal);
		//ARefCObj.methodOne();
		
	}
}

class EClass
{
	public static void main(String[] args)
	{
		AClass aRef = new AClass();
//		aRef.methodOne(); //error: methodOne() has protected access in AClass
	}
}
class DClass extends CClass
{
	public static void main(String[] args)	
	{
		AClass aObj = new AClass();
//		aObj.methodOne();	//error: methodOne() has protected access in AClass
		AClass cObj = new CClass();
//		cObj.methodOne();	//error: methodOne() has protected access in AClass
		AClass dObj = new DClass();
//		dObj.methodOne();	//error: methodOne() has protected access in AClass
		
		CClass cRef = new CClass();
//		cRef.methodOne();	//error: methodOne() has protected access in AClass
		CClass dRef = new DClass();
//		dRef.methodOne(); //error: methodOne() has protected access in AClass
		
		DClass dRefObj = new DClass();
		dRefObj.methodOne();
		System.out.println(dRefObj.protectedVal);
	}
}