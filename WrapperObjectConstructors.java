class WrapperObjectConstructors
{
	public static void main(String args[])
	{
		//Byte, Short, Integer, Long, Float, Double, Character, Boolean
		byte byteVal = 10;
		short shortVal = 20;
		
		Byte firstByteObj = new Byte(byteVal);
		Byte secondByteObj = new Byte("10");
		System.out.println("Byte Created using Primitive - " + firstByteObj);
		System.out.println("Byte Created using String - " + secondByteObj);
		
		Short firstShortObj = new Short(shortVal);
		Short secondShortObj = new Short("20");
		System.out.println("Short Created using primitive - " + firstShortObj);
		System.out.println("Short Created using String - " + secondShortObj);
		
		Integer firstIntegerObj = new Integer(100);
		Integer secondIntegerObj = new Integer("100");
		System.out.println("Integer Created using primitive - " + firstIntegerObj);
		System.out.println("Integer Created using String - " + secondIntegerObj);
		
		Long firstLongObj = new Long(1000l);
		Long secondLongObj = new Long("1000");
		//Long thirdLongObj = new Long("1000l");  // throws java.lang.NumberFormatException: For input string: "1000l"
		System.out.println("Long Created using primitive - " + firstLongObj);
		System.out.println("Long Created using String - " + secondLongObj);
		//System.out.println("Long Created using String with convension - " + thirdLongObj);
		
		Float firstFloatObj = new Float(10.5f);
		Float secondFloatObj = new Float("10.5f");
		Float thirdFloatObj = new Float("10.5");
		Float fourthFloatObj = new Float(10.5);
		System.out.println("Float created using primitive - " + firstFloatObj);
		System.out.println("Float created using String with convension - " + secondFloatObj);
		System.out.println("Float Created using String - " + thirdFloatObj);
		System.out.println("Float created using Double - " + fourthFloatObj);
		
		Double firstDoubleObj = new Double(123.34);
		Double secondDoubleObj = new Double("321.34");
		System.out.println("Double Created using Double - " + firstDoubleObj);
		System.out.println("Double Created using String - " + secondDoubleObj);
		
		Character firstCharObj = new Character('a');
		// Character secondCharObj = new Character("a"); // Cant create a Character wrapper using String
		System.out.println("Character created using primitive - " + firstCharObj);
		
		Boolean firstBooleanObj = new Boolean(true);
		Boolean secondBooleanObj = new Boolean(false);
		Boolean thirdBooleanObj = new Boolean("true");
		Boolean fourthBooleanObj = new Boolean("True");
		Boolean fifthBooleanObj = new Boolean("TRUE");
		Boolean sixthBooleanObj = new Boolean("false");
		Boolean seventhBooleanObj = new Boolean("Baskar");
		
		System.out.println("Boolean created using primitive - " + firstBooleanObj); //true
		System.out.println("Boolean created using primitive - " + secondBooleanObj); //false`
		System.out.println("Boolean created using String - " + thirdBooleanObj); //true
		System.out.println("Boolean created using String - " + fourthBooleanObj); // true
		System.out.println("Boolean created using String - " + fifthBooleanObj); //true
		System.out.println("Boolean created using String - " + sixthBooleanObj); //false
		System.out.println("Boolean created using String - " + seventhBooleanObj); //false //default value is false
	}
}