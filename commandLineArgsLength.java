public class commandLineArgsLength
{
	public static void main(String[] args)
	{
		System.out.println(args.length); // CASE 1: args length 0 on nothing, if passed A B C then its 3
		for (int i = 0; i < args.length; i++) 
			System.out.println(args[i]);
		
		//CASE 4: (if passed args is 'note book')
		System.out.println(args[0]); //output is -> note // space is the delimiter between args, to get output as notebook we have to pass in 
									// double quotes "note book"
		
		String[] localStrArr = {"x", "y", "z"};
		args = localStrArr;
		for (int j = 0; j < localStrArr.length; j++) //CASE 2: can change the reference of  args
			System.out.println(localStrArr[j]);
		
		if (args.length == 2)						//CASE 3: args are considered as strings
			System.out.println(args[0] + args[1]); //if args[0] -> 10 and args[1] -> 20 then output is 1020. concat happens

	}
}