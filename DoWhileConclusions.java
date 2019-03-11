class DoWhileConclusions
{
	
	public static void main(String[] args)
	{
	/*
		//case:1 -  error: illegal start of expression (Atleast ; or {} required after do)
		do
		while(true);
	*/
		
	/*
		//case:2 -  Valid compilation and Execution
		do ;
		while(true);
	*/
	
	/*
		//case:3 -  Declaration without Block (error: variable declaration not allowed here)
		do
			int x = 10;
		while(true);
	*/
	
	/*
		//case:4 -  Declaration with Block (valid)
		do{
			int x = 20;
		} while(true);
	*/

	/*
		//case:5 -  Some sample (No compilation Errors - while and sopln act as single statement - sopln is part of while)
		do while(true)
			System.out.println("Hello Infinite");
		while(false);
	*/

	/*
		//case:6 -  Some sample (Compilation Errors - error: unreachable statement)	
		do 
			System.out.println("Hello");
		while(true);
		System.out.println("Hi");
	*/

	/*
		//case:7 -  Some sample (No Compilation Errors)	
		do 
			System.out.println("Hello");
		while(false);
		System.out.println("Hi");
	*/
	
	/*
		//case:8 -  Some sample (No Compilation Errors - compiler cant predict the unreachable as a,b are normal variables)	
		int a = 10, b = 20;
		do 
			System.out.println("Hello");
		while(a < b);
		System.out.println("Hi");
	*/

	/*
		//case:9 -  Some sample (Compilation Errors - ( error: unreachable statement) compiler can predict the unreachable as a,b are final variables)
		final int a = 10, b = 20;
		do 
			System.out.println("Hello");
		while(a < b);
		System.out.println("Hi");
	 */

	}
}