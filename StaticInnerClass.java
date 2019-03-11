class StaticInnerClass
{
	private int intVal= 10;
	static private int statIntVal = 100;
	
	public static void main(String[] args)
	{
		InnerClass insObj = new InnerClass();
		insObj.instanceMethod();
		System.out.println("Static Inner Class method called through Instance method");
		new StaticInnerClass().instanceMethod();
	}
	
	void instanceMethod()
	{
		InnerClass obj = new InnerClass();
		obj.instanceMethod();
	}
	
	static class InnerClass {
		public void instanceMethod()
		{
			System.out.println("Instance method in static inner class");
				//System.out.println("Instance method in static inner class - Outer class instance variable - "+ intVal);
					System.out.println("Instance method in static inner class - Outer class Static variable - " + statIntVal);
		}
	}
}