public class StringImmutableCheck
{
	
	public static void main(String[] args)
	{
		String firstObj = new String("Baskar");
		String dupeFirstObj = new String("Baskar");
		System.out.println(firstObj + "..." + firstObj.hashCode());
		String secondObj = firstObj.concat(" kid -> Jaasritha"); //this concat produces new Object, doesnt do changes on existing Obj. This is Immutability.
		System.out.println(secondObj + "..." + secondObj.hashCode());
		System.out.println("First Obj after Concat - " + firstObj);
		System.out.println(firstObj == dupeFirstObj);
		System.out.println(firstObj.equals(dupeFirstObj)); //.equals method is overridden, hence we get "true" because of content comparison.
		
		
		StringBuffer firstStrBuffer = new StringBuffer("Baskar");
		StringBuffer dupeFirstStrBuffer = new StringBuffer("Baskar");
		System.out.println(firstStrBuffer + "..." + firstStrBuffer.hashCode());
		StringBuffer newStrBuffer = firstStrBuffer.append(" kid -> Jaasritha"); // this return the same Old Obj making changes on to it, This is mutability.
		System.out.println(newStrBuffer + "..." + newStrBuffer.hashCode());
		System.out.println(firstStrBuffer == dupeFirstStrBuffer);
		System.out.println(firstStrBuffer.equals(dupeFirstStrBuffer)); // .equals method is not overridden, we get "false" cause of reference comparison
	}
}
