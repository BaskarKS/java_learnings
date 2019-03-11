import static java.lang.System.out;
public class WrapperClassMethods
{
	public static void main(String[] args)
	{
		
		//////valueOf() its a static method present in all wrapper class to create wrapper object
		Integer intObj = Integer.valueOf(130);
		out.println(intObj);
		Integer intStrObj = Integer.valueOf("200");
		out.println(intStrObj);
		//Form 2
		Integer intRadObj = Integer.valueOf("200", 4); //only for Interger Types (byte, short, int, long)
		out.println(intRadObj);
				
		Byte byteObj = Byte.valueOf((byte)10);
		out.println(byteObj);
		
		Float floatObj = Float.valueOf(15.5f);
		Float floatStrObj = Float.valueOf("15.9f");
		out.println(floatObj);
		out.println(floatStrObj);
				
		Character chObj = Character.valueOf('B');
		out.println(chObj);
		Boolean boolObj = Boolean.valueOf("TRUE");
		out.println(boolObj);
		
		//////XXXvalue() method to get primitive from the wrapper object
		int intPrim = intObj.intValue();
		out.println("'\n xxxValue() method Trials"); // this method is available only in following wrapper objects(byte,short,int,long,float,double)
		out.println(intPrim);
		out.println(intObj.byteValue());
		out.println(intObj.shortValue());
		out.println(intObj.longValue());
		out.println(intObj.floatValue());
		out.println(intObj.doubleValue());
		
		out.println(floatObj.byteValue());
		out.println(floatObj.shortValue());
		out.println(floatObj.intValue());
		out.println(floatObj.longValue());
		out.println(floatObj.floatValue());
		out.println(floatObj.doubleValue());
		
		out.println(chObj.charValue()); //Character Wrapper contains only charValue() method
		out.println(boolObj.booleanValue()); //Boolean wrapper contains only booleanValue() method
		
		//////static primitive parseXXX() in each Wrapper Class to interpret string to primitive
		out.println("'\n parseXXX() method Trials");
		int intStrPrim = Integer.parseInt("123");
		int intStrPrimRad = Integer.parseInt("200", 3); //type 2 is available only for intergral types(byte, short, int, long)
		out.println(intStrPrim);
		out.println(intStrPrimRad);
		float floatStrPrim = Float.parseFloat("150.5");
		out.println(floatStrPrim);
	}
}