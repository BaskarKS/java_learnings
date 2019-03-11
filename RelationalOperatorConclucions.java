public class RelationalOperatorConclucions
{
	public static void main(String[] args)
	{
		//< , <= , > , >= (Can be applied to all primitives except boolean)
		System.out.println(10 < 20); //true
		System.out.println('a' < 20); //false
		System.out.println('a' < 97.6); //true
		System.out.println('a' > 'A'); //true

//		System.out.println(true > false); //CE : 10: error: bad operand types for binary operator '>'
//		System.out.println("BaskarKS" > "Baskar"); //CE: 11: error: bad operand types for binary operator '>'
		
		//Nesting of Relational Operator not allowed, because first result will be boolean type and that will be used to compare with 3rd operand
		System.out.println(10 < 20 < 30); // 14: error: bad operand types for binary operator '<'
	}
}