public class StringBufferCheckMethods
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Baskar");
		sb.deleteCharAt(3); //delete character at position 3
		System.out.println(sb);
		sb.delete(1,4); //delete characters from position start to (end-1)
		System.out.println(sb);
	}
}