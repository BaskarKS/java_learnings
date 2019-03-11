package finalvariable.study;
class CheckFinalInstanceVariableAssignment
{
	// Only can assign Final variables 1. at the time of declaration or 2. In Instance Block or 3. In Constructor
	final int x;
	{
		//x = 30;
	}
	static {
		//x = 40; // error: non-static variable x cannot be referenced from a static context
	}
/*	
	CheckFinalInstanceVariableAssignment()
	{
		//x = 20; //error: variable x might already have been assigned x = 20, Instance executed before constructor, second time assignment not allowed
	}
*/	
	//Below constructor assignment to final variable x only valid if and only if default constructor block shouldnt be defined
	//If default constructor block is also defined then compiler expects final variables should be defined in default constructor block itself.
	CheckFinalInstanceVariableAssignment(int passVal) 
	{
		x = passVal;
	}
	public static void main(String[] args)
	{
		CheckFinalInstanceVariableAssignment obj = new CheckFinalInstanceVariableAssignment(50);
		System.out.println("Final Variable : " + obj.x);
	}
}