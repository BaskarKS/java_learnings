public class BooleanDataTypeRange
{
	static char ch;
	public static void main(String[] args)
	{
		// boolean b = 0; //CE: error: incompatible types: int cannot be converted to boolean
		// boolean b = True; //CE: error: cannot find symbol : symbol:   variable True : location: class BooleanDataTypeRange
		// boolean b= "True"; //CE: error: incompatible types: String cannot be converted to boolean
		boolean b = true;
		System.out.println("Display boolean value : " + b);
		System.out.println("Default value of Character : " + (int)BooleanDataTypeRange.ch); //Default value of  Char value is 0
/*		int condn = 0;

		if (condn) ; //CE: error: incompatible types: int cannot be converted to boolean
		else ;

		while(condn) ; //CE: error: incompatible types: int cannot be converted to boolean
*/
	}
}