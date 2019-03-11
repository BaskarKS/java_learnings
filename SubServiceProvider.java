public class SubServiceProvider extends ServiceProvider
{
	public void methodTwo() { }
	//public static final 
	public static int firstVariable = 888; // (1) (if this line is commented then firstVariable is referred to interface variable(FirstInterfaceCheck(I)), 
	//when uncommented, this variable is referred to class variable and given more priority than interface variable, no ambiguity problem )
	public static void main(String[] args)
	{
		firstVariable = 777; // if (1) commented => error: cannot assign a value to final variable firstVariable => it uses interface variable
		System.out.println("Interface Variable - " + firstVariable );
		
		//secondInterface, ThirdInterface contain the same variable(secondVariable) defined hence naming conflict can be resolved by
		// including interface name along with variable like ThirdInterface.secondVariable
		System.out.println("Interface Variables with same name in 2 interface - " + ThirdInterface.secondVariable );
	}
	
}