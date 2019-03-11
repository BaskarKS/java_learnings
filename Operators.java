class Operators 
{
		public static void main(String[] args)
		{
			/* Bitwise Operators */
			
			//System.out.println("Using Negation Operator" + ~true); CE: bad operand type boolean for unary Operator
			System.out.println(~4); //-5
			//System.out.println(!4); //error: bad operand type int for unary operator '!'
			System.out.println(!false); //true
			System.out.println(!true); //false
			//System.out.println(4.0 & 5.0); //error: bad operand types for binary operator '&'
			
			/* Short Circuit Operators &&, || */
			//System.out.println(10/0); //false
			
			//Assignment Operators
			
			//Chained Assignment
			int b,c,d;
			int a = b = c = d = 20;
			System.out.println(a + "..." + b + "......." + c + "......" + d);
			
			//Compound Assignement  +=, -=, *=, /=, %=, &=, |=, ^=, >>=, >>>=, <<= (11 operators)
			int x = 10;
			x += 20;
			System.out.println("Compound value : " + x);
			
			byte bi = 10;
			bi = (byte)(bi + 1); //Explicit Typecasting Required, since results promoted to int.
			bi++;
			bi += 1; //Internal Typecasting happens Automatically
			System.out.println("Byte Value : " + bi);
		}
}