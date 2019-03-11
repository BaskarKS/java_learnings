class ParentClass
{
	int x = 100;
}
public class SuperThisKeyword extends ParentClass
{
	int x = 200;
	public static void  main(String[] args)
	{
		new SuperThisKeyword().printMembers();
	}
	void printMembers()
	{
		System.out.println(super.x);
		System.out.println(this.x);
	}
}