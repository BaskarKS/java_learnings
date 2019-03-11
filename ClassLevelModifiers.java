import com.baskar.java.conclusions.PackageConclusions;
import static java.lang.System.out;

public class ClassLevelModifiers
{
	public static void main(String[] args)
	{
			// class should provide information to JVM like
			//1. class can be accessed from anywhere or not
			//2. Objet creation is possible or not.
			//3. child class creation is possible or not
			//all the above information can be shared to JVM using modifiers
			// In c++ => public, private, protected, default are called access specifiers, others are called modifiers. In java all are called modifers only.
			// Modifiers : ( 1.public,
						// 2.private,
						// 3. <default>, 
						//4.protected, 
						//5.final, 
						//6.abstract, 
						//7. stictfp, 
						//8.static, 
						//9. synchronized, 
						//10.native, 
						//11.transient,
						//12. volatile)
				PackageConclusions obj = new PackageConclusions();
				System.out.println(obj.packConclu);
	}
}

//private class OuterClassModifiers //error: modifier private not allowed here
class OuterClassModifiers
{
	//only the below 5 modifiers can be applicable to outer or top level classes
	// Modifiers : 1.public,
			   //2. <default>, 
			   //3.final, 
			   //4.abstract, 
			   //5. strictfp, 
			   
	// public class can be accessed anywhere, directly with in package, using import can be accessed outside
	// default class can be accessed only with in the current package, from outside cant be accessed. Also called "Package level access"
}

class InnerClassModifiers
{
	//only the below 5 modifiers can be applicable to outer or top level classes
	// Modifiers : 1.public,
			   //2.private,
			   //3. <default>, 
			   //4.protected, 
			   //5.final, 
			   //6.abstract, 
			   //7.strictfp, 
			   //8.static
}