public class InterningStringCheck
{
	public static void main(String[] args)
	{
		String heapObj = new String("Baskar");
		String scpObj = heapObj.intern(); // new object is created in SCP area
		System.out.println(heapObj == scpObj); //scp area obj reference doesnt match with object in heap area //false
		String scpObjectCreate = "Baskar"; // since this value object is already available in SCP area the same reference it will get
		System.out.println(scpObj == scpObjectCreate); //both will be pointing to the same object in SCP area. //true
		
		String heapObjOne = new String("Baskar");
		String heapObjTwo = heapObjOne.concat(" Suribabu");
		String scpObjOne = heapObjTwo.intern();
		System.out.println("\n");
		System.out.println(heapObjTwo == scpObjOne);
		String scpObjTwo = "Baskar Suribabu";
		System.out.println(scpObjOne == scpObjTwo); 
	}
}