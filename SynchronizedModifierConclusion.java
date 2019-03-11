public class SynchronizedModifierConclusion
{
	public static void main(String[] args)
	{
		//keyword applicable only for methods and blocks.
		
		//if multiple java objects operate on the same data, theres chance of data inconsistency. this problem is solved by synchronized.
		// if a method/block declared as synchronized then at a time only one thread is allowed to work on the data. 
		//Resolves data inconsistency problem
		
		//DISADVANTAGE
		//increases waiting time of the threads, creates performance issues. until a specific requirement, its not recommended to use.
		
		//Synchronized talks about implementation, abstract doesnt talk about implementation. abstract synchronized combination is illegal.
	}
}