class Test
{
	public static void main(String[]  args)
	{
		System.out.println("Test");
	/*
		StaticInnerClass.InnerClass obj = new StaticInnerClass.InnerClass();
		obj.instanceMethod();
	*/
		TestClassOuterInterface outerIntfObj = new TestClassOuterInterface();
		TestClassInnerInterface innerIntfObj = new TestClassInnerInterface();
		outerIntfObj.outerInterfaceMethod();
		innerIntfObj.innerInterfaceMethod();
	}
}