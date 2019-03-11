class ConstructorOrder
{
	public static void main(String[] args)
	{
		ChildClass childObj = new ChildClass();
	}
	
}

class ParentClass 
{
	ParentClass()
	{
		System.out.println("Parent Constructor" + this.hashCode());
	}
}

class ChildClass extends ParentClass
{
	ChildClass()
	{
		System.out.println("Child Constructor" + this.hashCode());
	}
}