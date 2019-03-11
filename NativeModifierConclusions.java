public class NativeModifierConclusions
{
	public static void main(String[] args)
	{
		//This keyword applicable "only for methods"
		
		//methods implemented in native languages(C/C++) are called native/foreign methods. we can call these methods in java using "native"
		
		//OBJECTIVES
		//to improve system performance.
		//acheive machine/memory level communication
		//to acheive on using existing legacy non-java code
		
		//native methods implementation is already avaialable in C/C++ we just need to provide declaration and use it. declaration should 
		//ends with semicolon eg: public native void someMethods();
		
		//"abstract native" combination is illegal, native talks about already implemented code in native languages(C/C++). abstract talks
		// about forcing the child class to implement.
		
		//"native strictfp" combination is illegal. no guarentee that old languages(c/C++) implemented code would have followed IEEE754 standards
		
		//ADVANTAGE => performance will be impreoved
		//DISADVANTAGE => breaks platform independent nature of JAVA
	}
	
}