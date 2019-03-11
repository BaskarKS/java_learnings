class ParentClass
{
	static int x = 100;
}
public class SuperThisKeyword extends ParentClass
{
	static int x = 200;
	public static void  main(String[] args)
	{
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println(this.x);
	}
}