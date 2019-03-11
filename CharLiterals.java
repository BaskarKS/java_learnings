public class CharLiterals
{
	public static void main(String[] args)
	{
			//char ch = 'ab';// InValid
			//char ch = a;     // InValid
			//char ch = "a"; // InValid
			
			//char ch = 'a';  // Valid
			//char ch = 0x65; //  Valid - Hexa value
			//char ch = 030; //  Valid - Octal Value
			//char ch = 65535; //  Valid - Max Value
			//char ch = '\t'; // Valid Escape Sequence - \n, \t, \r, \b, \f, \', \", \\ - 8 values
			char ch = '\u0065'; // Valid - Hexa Value in Unicode Representation
			System.out.println(ch);
			System.out.println("Checking escape \b Sequence");
	}
}