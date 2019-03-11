class WhileLoopCases
{
	
	
	public static void main(String[] args)
	{
	
	/* 
		//case 1 : Passing Integer in while loop is compilation error
		//error: incompatible types: int cannot be converted to boolean
		while(1)
		{
			System.out.println("Hello In Loop");
		}
	 */
	 
	/*
		//case 2 : (No Braces Compulsary)
		while(true)
			System.out.println("Hello Infinite");
	*/
	
	/*
		//case 3 : no statements are mandatory, ; is empty statement
		while(true) ;
	*/
	
	/*
		// cant make declaration as single statement in while with no braces. else "error: variable declaration not allowed here"
		while(true)
			int x = 10;
	*/
	
	/*
		// declaration can be made only with in curly braces of while loop
		while(true)
		{
			int x = 20;
		}
	*/
	
	}
}