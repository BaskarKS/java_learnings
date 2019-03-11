public class StringConcatenateOperator
{
	public static void main(String[] args)
	{
		//Only operator OVERLOADED in Java is +
		String name = "Baskar";
		int b = 10, c = 20, d = 30;
		//Evaluated from left to right => if atleast one operand is String then Sting concat happens, if both the operands are int then arithmetic
		// addition happens
		System.out.println(name + b + c + d); //Baskar102030
		System.out.println(b + c + d + name); //60Baskar
		System.out.println(b + c + name + d); //30Baskar30
		System.out.println(b + name + c  + d); //10Baskar2030		
	}
}