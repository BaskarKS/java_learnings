public class IntegralLiterals
{
	public static void main(String[] args)
	{ 
		int dec = 10;
		int oct = 0767;
		int hex = 0x10;
		int bin = 0b1101;

		//int octOutRange = 0786; //error: integer number too large: 0786 - Octal out of range value
		//int hexInvalidVal = 0xBeer; //error: ';' expected - Hex invalid Value
		//int x = 10.0; // error: incompatible types: possible lossy conversion from double to int - Cant assign floating point values to int variable
		
		double d = 1_25_000;
		System.out.println(dec + "..." + oct + "..." + hex + "..." + bin);
		System.out.println("Underscore in double Value : " + d);
		
		float singlePrec = 10.234F; //float singlePrec = 10.234 -> CE: error: incompatible types: possible lossy conversion from double to float
									 // Have to explicitly mention F/f after value 
		System.out.println("Float Value : " + singlePrec);
		
		float floatVal = 100.1F;
		double octValue = 0765;
		double hexValue = 0xbeef;
		double binValue = 0b1101;
		float octValFloat = 0765; //This is considered as int value, hence F need not required to be mentioned
		System.out.println("Float Value :" + floatVal);
		System.out.println("Double Value init with Octal Value 0765 - " + octValue); // can assign octal value to double, internal its stored in equi decimal val
		System.out.println("Double Value init with HexaDec Value 0xbeef - " + hexValue);// can assign octal value to double, internal its stored in equi decimal val
		System.out.println("Double Value init with BinDec Value 0b1101 - " + binValue);
		System.out.println("Float Value init with Octal Value 0765:" + octValFloat);
		
	}
}