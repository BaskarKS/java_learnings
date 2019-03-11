public class VolatileModifierConclusion
{
	public static void main(String[] args)
	{
		//modifer applicable only for "variables"
		
		//if value of variable keep on changing by multiple threads then theres chance of data inconsisteny problem. solved using volatile modifier.
		
		//if a variable is volatile. every thread JVM will create a seperate copy. Every change perform by thread happens in local copy
		//hence no effect on remaining therad changes
		
		//advantage of volatile is data inconsistency problem is solved.
		//disadvantage is creating and maintaining seperate copy for every thread increases complexity and create performance problems.
		
		//final means value never changes, volatile means value keep-on changing. "volatile final is illegal combination 
	}
}