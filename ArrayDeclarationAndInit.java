public class ArrayDeclarationAndInit
{
	
	public static void main(String[] args)
	{
		int[] type1Declar; //Valid Declaration and Recommended because of name seperated from type
		int []type2Declar; //Valid Declaration
		int type3Declar[]; //Valid Declaration
		
		// int[4] type4Declar; // At the time of declaration shouldnt specify the size : CE: error: ']' expected, error: illegal start of expression
		int[] type5DeclareCreate = new int[5];
		int[] type6DeclareCreateEmpty = new int[0]; // Legal to have empty size array in java
		// int[] type7DeclareCreateNeg = new int[-3]; // valid in compile, get RE: Exception in thread "main" java.lang.NegativeArraySizeException
		
		int intDataSize = 10;
		byte byteDataSize = 15;
		short shortDataSize = 20;
		char charDataSize = 65;
		int[] type8DecCreIntSize = new int[intDataSize];
		int[] type9DecCreByteSize = new int[byteDataSize];
		int[] type10DecCreShortSize = new int[shortDataSize]; // allowed data types are only byte, short, char,int.
		int[] type11DecCreCharSize = new int[charDataSize]; // Hence Max array size can be size of int (2 pow 31 - 1)
		
		//int[] type12MaxArraySize = new int[2147483647]; // Exception in thread "main" java.lang.OutOfMemoryError:
																// Requested array size exceeds VM limit
																
		int[][] twoDimen = new int[2][];
		System.out.println(twoDimen); // it prints only hashcode of twoDimen array.	
		System.out.println(twoDimen[0]); // it prints null because twoDimen[0] array, still not created.	
		twoDimen[0] = new int[3];
		System.out.println(twoDimen[0]); // it prints hashcode because twoDimen[0] array, is created.
		twoDimen[1] = new int[2];
		//twoDimen[2] = new int[2]; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		
		int[][][] threeDimen = new int[2][][];
		threeDimen[0] = new int[3][];
		threeDimen[1] = new int[2][2];
		threeDimen[0][0] = new int[1];
		threeDimen[0][1] = new int[2];
		threeDimen[0][2] = new int[3];
			
		byte[] byteArray = new byte[5];
		short[] shortArray = new short[5];
		long[] longArray = new long[5];
		char[] charArray = {'a', 'b', 'c'};
		char[] char2Array = new char[5];
		System.out.println(char2Array); // it prints nothing, char array wont print hashcode it prints values which is empty on creation.	
		char2Array[0] = 'b';
		char2Array[1] = 'a';
		char2Array[3] = 's';
		
		System.out.println	(type5DeclareCreate); // it prints only hashcode of type5DeclareCreate array.
		System.out.println(byteArray); // it prints only hashcode of byteArray array.
        System.out.println(shortArray); // it prints only hashcode of shortArray array.
		System.out.println(longArray); // it prints only hashcode of longArray array.
		System.out.println(charArray); // it prints content of charArray array.	
		System.out.println(char2Array); // it prints content of char2Array array.			
		
		System.out.println(twoDimen); // it prints only hashcode of two dimen array.
		System.out.println(twoDimen[0]); // it prints only hashcode of two dimen array first loc	.
		
		int[] decCreatInitArray = { 1, 2, 3, 4, 5};
		char[] charDecCreatInitArray = {'a', 'e', 'i', 'o', 'u'};
		String[] stringDecCreatInitArray = {"Baskar", "Geeth", "Jaashi"};
		System.out.println(charDecCreatInitArray);
		System.out.println(stringDecCreatInitArray);
		System.out.println(stringDecCreatInitArray[2]);
		
		int[][] twoDimDecCreatInitArray = {{1,2,3},{4,5,6,7}};
		System.out.println(twoDimDecCreatInitArray[0][0]);
		System.out.println(twoDimDecCreatInitArray[0][1]);
		System.out.println(twoDimDecCreatInitArray[0][2]);
		System.out.println(twoDimDecCreatInitArray[1][0]);
		System.out.println(twoDimDecCreatInitArray[1][1]);
		System.out.println(twoDimDecCreatInitArray[1][2]);
		System.out.println(twoDimDecCreatInitArray[1][3]);
		
	int[][][] threeDimDecCreInitArray = {
												{
													{10,20},
												    {30,40,50}
												},
												{
													{70},
													{80},
													{90}
												},
												{
													{100,110},
													{120},
													{130, 120}
												}
										   };

	int[][][][] fourDimDecCreInitArray = {
												{
													{
														{1, 2, 3},
														{4, 5},
														{6, 7, 8}
													},
													{
														{9, 10},
														{11,24,25,26,27}
													}
												},
												{
													{
														{12},
														{13, 14}
													},
													{
														{15, 16, 17},
														{18, 19},
														{20}
													},
													{
														{21, 22},
														{23}
													}
												}
											};
											
	int[][][] prac3DimenArr = {
									{
										{1,2,3}
									},
									{
										{4,5,6},
										{7,8}
									},
									{
										{9,10},
										{11},
										{12,13,14,15}
									}
								 };
	System.out.println(threeDimDecCreInitArray[1][2][0]);
	
	System.out.println(fourDimDecCreInitArray[1][2][1][0]);
	System.out.println(fourDimDecCreInitArray[0][1][1].length); //length is a final variable in array and its not a method
	
	String strVariable = "KadariSuribabuBaskar";
	System.out.println("String Lenth : "+ strVariable +" is : "+ strVariable.length());
	

	System.out.println(prac3DimenArr[2][1][0]);	
	}
}