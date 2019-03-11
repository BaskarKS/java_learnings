class StringImmutability{
	public static void main(String[] args)
	{
		StringBuffer strObj = new StringBuffer();
		System.out.println(strObj.hashCode() + " ..." + strObj.capacity());
		strObj.append("Durga" + " Software Jaasritha solutions");
		System.out.println(strObj.hashCode() + " ..." + strObj.capacity());
		System.out.println(strObj);
	}
}