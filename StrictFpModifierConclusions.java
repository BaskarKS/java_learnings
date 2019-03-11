public class StrictFpModifierConclusions
{
	public static void main(String[] args)
	{
		//Introduced in 1.2V
		//Can be declared only for methods and classes but not for variables 
		
		//WHY STRICTFP?
		// usually results of floating point arithmetic varies from platform to platform.
		// if platform independent resuls needed for floating point arithmetic then we need strictfp modifier.
		// floating point results for 16 bit processor is 5-6 digits after. for 32 bit processor is 14-15 digits after.
		
		// if a method declared as strictfp -> all floating point calculations in that method has to follow
		// IEEE754 standards to get platform independent results.
		
		//if a class declared as strictfp then every floating point calculation present in every concrete method 
		// has to follow IEEE754 standards to get platform independent results.
		
		//abstract and strictfp modifiers combination on methods is illegal
		//abstract modifier method doesnt talk about implementation but strictfp talks about method implementation,
		
		// abstract and strictfp modifiers combination on classes is legal, 
		// where strictfp acts by forcing all concrete methods which contain floating point calculations to follow IEEE754 standards strictly
	}
}