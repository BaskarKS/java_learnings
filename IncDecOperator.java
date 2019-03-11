public class IncDecOperator
{
	public static void main(String[] args)
	{
		final int x = 10;
//		++10 : (Pre/Post) (Inc/Dec) operator can be applied only on variables not on constant values
//		int y = ++(++x); // Nesting of pre and post increment / decrement operators cannot be applied
//		x++; // error: cannot assign a value to final variable x
		boolean bool = true;
//		bool++; //error: bad operand type boolean for unary operator '++' : (Pre/Post) (Inc/Dec) operator cannot be applied on boolean
		System.out.println(x);
		
		byte a = 10;
		byte b = 20;
//		byte c = a + b; //error: incompatible types: possible lossy conversion from int to byte => max(int, typeof(a), typeof(b))
//		c = a + 1; //error: incompatible types: possible lossy conversion from int to byte.            or =>         c = (byte) a + 1;

		b++; // in case of (Pre/Post) (Inc/Dec) operator, typecasting will be taken care internally
		System.out.println(b);
	}
}