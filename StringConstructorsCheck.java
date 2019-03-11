public class StringConstructorsCheck
{
	
	public static void main(String[] args)
	{
		char[] chArray = {'a', 'b', 'c', 'd', 'e'};
		byte[] byteArray = {97,98,99,100,101,102};
		StringBuffer strBuffObj = new StringBuffer("String Buffer");
		
		String firstConstructor = new String();
		String firstConstructorObj = firstConstructor.concat("First Constructor"); // Created without arg and later added using concat
		String secondConstructor = new String("StringLiteral Constructor"); //String literal passed
		String thirdConstructor = new String(strBuffObj); // StringBuffer passed to constructor
		String fourthConstructor = new String(chArray); // Character Array passed
		String fifthConstructor = new String(byteArray); //Byte Array passed
		
		System.out.println(firstConstructor.hashCode());
		System.out.println(firstConstructorObj.hashCode());
		
		System.out.println(firstConstructorObj);
		System.out.println(secondConstructor);
		System.out.println(thirdConstructor);
		System.out.println(fourthConstructor);
		System.out.println(fifthConstructor);
	}
}