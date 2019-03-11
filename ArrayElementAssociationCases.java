public class ArrayElementAssociationCases
{
	public static void main(String[] args)
	{
		//case 1
		int[] primIntArray = new int[5];
		float[] floatArray = new float[6];
		
		primIntArray[0] = 10;
		primIntArray[1] = 'A';
		floatArray[0] = 10;
		
		byte byteVal = 25;
		primIntArray[2] = byteVal;
		floatArray[1] = byteVal;
		
		short shortVal = 50;
		primIntArray[3] = shortVal;
		floatArray[2] = shortVal;
		
		char chVal = 'a';
		primIntArray[4] = chVal;
		floatArray[3] = chVal;
		
		long longVal = 12L;
		floatArray[4] = longVal;
		
		floatArray[5] = 10.5F;
		
		for (int arrVal : primIntArray)
			System.out.println(arrVal);
		//Byte, Short, Char, int values can be assigned to int array elements which the values are promoted to integer
		
		for (float floatVal : floatArray)
			System.out.println(floatVal);
		//Byte, Short, Char, int, long, float values can be assigned to float array elements which the values are promoted to float
		
		//CASE 2: 
		//we can assign either "Object type" or its "child class type" as array elements
		Object[] objArray = new Object[4];
		objArray[0] = new Object();
		objArray[1] = new String("Baskar");
		objArray[2] = new Integer(10);
		
		//CASE 3: Only Child class objects of Number Abstract class type are allowed
		Number[] numberTypeArr = new Number[8];
		numberTypeArr[0] = new Byte((byte)10);
		numberTypeArr[1] = new Short((short)10);
		numberTypeArr[2] = new Integer(10);
		numberTypeArr[3] = new Long(10);
		numberTypeArr[4] = new Float(10.1);
		numberTypeArr[5] = new Double(10.2);
		//numberTypeArr[6] = new Object();
		
		//CASE 4: Interface Arrays are allowed but only the particular interface implemented class objects are only allowed to store.
		Runnable[] threadArray = new Runnable[5];
		threadArray[0] = new Thread();
		threadArray[1] = new Thread();
		//threadArray[2] = new String("Thread"); //error: incompatible types: String cannot be converted to Runnable
													// Only Runnable interface implemented objects can be stored in threadArray.
		
		//CASE 5:  char element can be promoted to int type, but char[] cant be promoted to assign to int[].
		int[] intValues = {1,2,3,4,5};
		char[] charValues = {'a', 'b', 'c', 'd', 'e'};
		
		//int[] intArrayDupe = charValues; //error: incompatible types: char[] cannot be converted to int[]
		//char[] charArrayDupe = intValues; //charValues; //error: incompatible types: int[] cannot be converted to char[]
		// char element can be promoted to int type but char[] cant be promoted to assign to int[].
		//System.out.println(intArrayDupe);
		
		//CASE 6: In case of Object arrays, child class type array can be promoted to parent class type array.
		String[] strArray = {"A", "B", "C"};
		Object[] objStrArray = null;
		objStrArray = strArray;
		System.out.println(objStrArray[2]);
		
		//CASE 7: possible to assign array of same types, only references are copied (array types and dimension should be matched, size match not needed)
		int[] firstArr = {10,20,30,40,50};
		int[] secondArr = {111,222,333};
		int[] thirdArr;
		thirdArr = secondArr;
		System.out.println(thirdArr[0]);
		secondArr = firstArr;
		firstArr = thirdArr;
		System.out.println(firstArr[0]);
		System.out.println(secondArr[0]);
		System.out.println(thirdArr[0]);
		
		int[][] twoDimen = new int[3][];
		//twoDimen[0] = new int[4][2]; //error: incompatible types: int[][] cannot be converted to int[]
											//needed single Dimen array but passed is Two Dimen Array. 
		twoDimen = new int[4][2];
		
	}		
}