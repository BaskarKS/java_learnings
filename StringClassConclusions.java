import static java.lang.System.out;

public class StringClassConclusions
{
	public static void main(String[] args)
	{
			//case 1 => String objects are immutable, changes performing to existing objects will make new objects to get created.
			String firstStrObj = new String("Baskar");
			String secCreatedStrObj = firstStrObj.concat(" Kadari");
			out.println(firstStrObj +"..."+ Integer.toHexString(firstStrObj.hashCode()));
			out.println(secCreatedStrObj +"..."+ Integer.toHexString(secCreatedStrObj.hashCode()));
			
			//case 2// .equals() method is overridden, hence content comparison Happens
			String sameContFirstStringObj = new String("Baskar Kadari");
			out.println(".equals() method is overridden => " + sameContFirstStringObj.equals(secCreatedStrObj));
			
			//case 3 //some conclusion on SCP(String Constant Pool area)
			String scpHeapString = new String("DoubleCopy"); //2 copy of objects of "DoubleCopy" String will be created. One copy in Heap 
			//area and one copy in SCP area and "scpHeapString" will point to the object in Heap area.
			String scpString = "SingleCopy"; // only one object created and placed in SCP area and scpString will point to object in SCP area.
			
			//case 4 // RULE applicable only for SCP area.
			// creating object in SCP area is optional, before creating an object in SCP, JVM will check in SCP area that an object with the same content
			//is already available. If its available, it will be reused. If its not available then only a new object will be created and placed in SCP area.
			String firstHeapStringObj = new String("HeapString");
			String secondHeapStringObj = new String("HeapString");
			out.println("Heap Objects point different object with same content =>" + (firstHeapStringObj == secondHeapStringObj)); //different reference
			String firstSCPObj = "SCP Object";
			String secondSCPObject = "SCP Object";
			out.println("SCP point to same object with same content =>" + (firstSCPObj == secondSCPObject)); // same reference
			//whenever new operator is used compulsary objet is created in heap area. duplicate objects with same content is possible in 
			//heap area but not in SCP area.
			
			
			//case 5
			//Garbage Collector is  not allowed to access the SCP area. Even objects present there doesnt have reference, those are not collected
			//by GC. The SCP objects are stored in method area.
			//All SCP objects are cleared only at JVM shutdown. Not handled by GC. 
			//In Webapplications/environment this clearing of SCP objects is solved by periodic server restarts
			
			//case 6
			// for every string constant one copy of that object will be placed in SCP area, objects created by runtime operation(concat) will be placed in heap
			String heapStringFirst = new String("Spring"); // one copy in heap(Spring) and one copy in SCP(Spring)
			heapStringFirst.concat("Summer"); // "Spring Summer" object in heap without reference, "Summer" object in SCP area.
			String heapStringSecond = heapStringFirst.concat("Winter"); // "Spring Winter" pointed by heapStringSecong in Heap area. 
			//"Winter" object in SCP area.
			heapStringFirst = heapStringFirst.concat("fall"); //"Springfall" obj pointed by heapStringFirst in Heap, "fall" object placed in SCP area.
			out.println(heapStringFirst);
			out.println(heapStringSecond);
			
			//Constructors
			char[] charArr = {'a', 'b', 'c', 'd','e'};
			byte[] byteArr = {100,101,102,103,104};
			StringBuffer sbAsConsParam = new StringBuffer("Create a String");
			String empty = new String(); //create empty String
			String asString = new String("PassedString"); //Create String using String constant.
			String stringFromBuffer = new String(sbAsConsParam);//Create String using StringBuffer
			String stringUsingCharArr = new String(charArr);//create String using CharArray
			String stringUsingByteArr = new String(byteArr);//create String using ByteArrayInputStream
			out.println(empty);
			out.println(asString);
			out.println(stringFromBuffer);
			out.println(stringUsingCharArr);
			out.println(stringUsingByteArr);
			
			//charAt(index)
			out.println(asString.charAt(0));
			out.println(asString.charAt(1));
			out.println(asString.charAt(2));
			
			//boolean equals(Object o) //content comparison // can be used to validate password
			String newString = new String("PassedString");
			out.println("checking equals => " + newString.equals(asString));
			
			//boolean equalsIgnoreCase(String s) // can be used to validate username
			String checkIgnoreCaseOne = "BASKAR";
			String checkIgnoreCaseTwo = "baskar";
			out.println("Checking equalsIgnoreCase => " + checkIgnoreCaseOne.equalsIgnoreCase(checkIgnoreCaseTwo));
			
			//String substring(int begin)
			String validateSubString = "BaskarKadariSuribabu";
			out.println(validateSubString.substring(1)); //from begin till the end, begin index is considered//askarKadariSuribabu
			out.println(validateSubString.substring(4)); //arKadariSuribabu
			out.println(validateSubString.substring(6)); //arKadariSuribabu
			
			//String substring(int begin, int end)
			out.println(validateSubString.substring(0,6)); //from begin to end-1 //Baskar 
			out.println(validateSubString.substring(6,12)); //from begin to end-1 //Baskar 
			out.println(validateSubString.substring(12,validateSubString.length())); //from begin to end-1 //Baskar 
			
			//int length() // return length of the string
			out.println(validateSubString.length()); //20
			out.println(validateSubString.substring(validateSubString.length())); //nothing prints
//			out.println(validateSubString.charAt(validateSubString.length())); //string length is 20chars from index 0-19 =>length() return 20 //IOOBE
			
			//String replace(char oldCh, char newCh)
			out.println(validateSubString.replace('a', 'A')); //BAskArKAdAriSuribAbu
			out.println("Original =>"+validateSubString); //BaskarKadariSuribabu
			
			//String toUpperCase()
			out.println(validateSubString.toUpperCase()); //BASKARKADARISURIBABU
			out.println(validateSubString.toLowerCase()); //baskarkadarisuribabu
			out.println("Original =>"+validateSubString); //BaskarKadariSuribabu

			//String trim() // remove blankspace at beg and end not at middle
			String validateSubStringTrim = "   Baskar Kadari Suribabu     ";
			out.println("Original =>"+validateSubStringTrim); //Original =>   Baskar Kadari Suribabu
			out.println("after Trim =>"+validateSubStringTrim.trim()); //after Trim =>Baskar Kadari Suribabu
			
			//int indexOf(char ch) // returns first occurance of specified character
			out.println("index of 'a' is=>" + validateSubStringTrim.indexOf('a') ); //46
			out.println("char at return index =>" + validateSubStringTrim.charAt(4));
			
			//int lastIndexOf(char ch) // last index returns
			out.println("last index of 'a' is=>" + validateSubStringTrim.lastIndexOf('a')); //22
			out.println("char at returned index is=>" + validateSubStringTrim.charAt(22));
			
			//in runtime operation only if theres change in content because of operation then only new object created or the same is reused
			String checkRuntime = new String("jaasritha");
			String checkRuntimeTwo = checkRuntime.toUpperCase();
			String checkRuntimeThree = checkRuntime.toLowerCase();
			out.println(checkRuntime == checkRuntimeTwo); //false
			out.println(checkRuntime == checkRuntimeThree); //true
			
			String checkRunSCP = "geetha";
			String checkRunSCPTwo = checkRunSCP.toString(); //same string no change because of operation
			String checkRunSCPThree = checkRunSCP.toLowerCase(); //same string no change because of operation
			out.println(checkRunSCP == checkRunSCPTwo); //true
			out.println(checkRunSCP == checkRunSCPThree); //true
			String checkRunSCPFour = checkRunSCP.toUpperCase(); //string converted to upper case from lowercase
			String checkRunSCPFive = checkRunSCPFour.toLowerCase(); //string converted to lower case from uppercase
			out.println(checkRunSCPFour == checkRunSCPFive); //false
			out.println(checkRunSCPFive == checkRunSCP); //false
	}
}

class StringBufferConclusions
{
		public static void main(String[] args)
		{
			//case 1 => stringBuffer is mutable, can perform changes to existing object
			StringBuffer firstSBObj = new StringBuffer("Baskar");
			StringBuffer secSBObj = firstSBObj.append(" Kadari");
			out.println(firstSBObj + "..." + Integer.toHexString(firstSBObj.hashCode()));
			out.println(secSBObj + "..." + Integer.toHexString(secSBObj.hashCode()));
			
			//case 2// .equals() method is not overridden default object class .equals implementation used, hence reference comparison Happens
			StringBuffer sameContSecSBObj = new StringBuffer("Baskar Kadari");
			out.println(".equals() method not overridden => " + sameContSecSBObj.equals(secSBObj));
			out.println("checking == operator =>" + (firstSBObj == secSBObj));
			out.println("checking == operator =>" + (firstSBObj == sameContSecSBObj));
			
			StringBuffer capacityCheck = new StringBuffer(); //Type 1 Constructor
			out.println("Initial Capacity/size of StringBuffer => " + capacityCheck.capacity()); //initial capacity is 16
			capacityCheck.append("abcdefghijklmnop");
			out.println("Capacity/size of StringBuffer after adding 16items=> " + capacityCheck.capacity());
			capacityCheck.append("q");
			out.println("Capacity/size of StringBuffer after adding 17th Item=> " + capacityCheck.capacity()); //34 ((intial/current capacity+1) * 2)
			
			StringBuffer customCapacity = new StringBuffer(18); //Type 2 Constructor
			out.println("initial Capacity of Custom Buffer => " + customCapacity.capacity());
			customCapacity.append("abcdefghijklmnopqr");
			out.println("filling max capacity of Custom Buffer => " + customCapacity.capacity());
			customCapacity.append("s");
			out.println("new max capacity of Custom Buffer => " + customCapacity.capacity()); // on exceeding same forml((intial/current capacity+1) * 2)
			
			StringBuffer sbFromString = new StringBuffer("Baskar"); //Type 3 Constructor
			out.println("StringBuffer from String, initial Capacity =>" + sbFromString.capacity()); //(initial capacity is 16 + lengthofString is 6) => 22
			sbFromString.append("abcdefghijklmnopq"); //adding 17 items which makes total capacity to increase to 23 which crosses capacity of 22
			out.println("New Size of  String buffer created from String =>" + sbFromString.capacity()); //((intial/current capacity+1) * 2) => (22+1 * 2) => 46
			sbFromString.trimToSize();
			out.println("new Size after trim / releasing unused space=>" + sbFromString.capacity());
			
			//STRINGBUFFER METHODS
			out.println("\nSTRINGBUFFER METHODS\n");
			StringBuffer methodVariable = new StringBuffer("JaasrithaKadari");
			out.println("Length method of StringBuffer =>" + methodVariable.length() + " Content is =>" + methodVariable);
			out.println("Capacity method of StringBuffer =>" + methodVariable.capacity());
			methodVariable.setLength(9);
			out.println("SetLength method made String to =>" + methodVariable + " its length =>" + methodVariable.length());
			methodVariable.ensureCapacity(100); 
			out.println("Capacity changed using ensureCapacity() of StringBuffer =>" + methodVariable.capacity());
			methodVariable.reverse();
			out.println("After Reverse method applied =>" + methodVariable);
			
		}
}