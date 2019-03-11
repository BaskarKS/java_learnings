public class TransientModifierConclusion
{
	public static void main(String[] args)
	{
		// modifier applicable only for "variables", can be used in Serialization context.
		
		//In serialization, if we dont want to save or send value of particular variable to meet security constraint then that variable is declared
		// as transient.
		
		//at the time of serialization JVM will ignores the transient variable values and save/send the default values of variable type to file/send.
		
		//"Transient means not to Serialize"
	}
}