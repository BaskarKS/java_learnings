public class OverridingVarArg
{
	public void methodOne(int... arg)
	{
		for(int each : arg)
		System.out.println("Var-Arg Parent Method : " + each);
	}
}

class ChildOverridingVarArg extends OverridingVarArg
{
	/*
	public void methodOne(int... arg)
	{
		for(int each : arg)
		System.out.println("Var-Arg Child Method : " + each);
	}
	*/
	public void methodOne(int arg)
	{
		System.out.println("Normal Child Method : " + arg);
	}
	
	public static void main(String[] args)
	{
		OverridingVarArg parentRef = new OverridingVarArg();
		parentRef.methodOne(1);
		ChildOverridingVarArg childRef = new ChildOverridingVarArg();
		childRef.methodOne(10);
		OverridingVarArg parentRefChildObj = new ChildOverridingVarArg();
		parentRefChildObj.methodOne(11);
	}
}
