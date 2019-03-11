class IsInstanceDemo
{
	public static void main(String[] args) throws Exception
	{
		Thread t = new Thread();
		try {
			System.out.println(Class.forName(args[0]).isInstance(t));
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException caught in Catch Block");
		}
		
		System.out.println("Use of instanceof : " + (t instanceof Thread));
		System.out.println("Use of instanceof : " + (t instanceof Runnable));
		System.out.println("Use of instanceof : " + (t instanceof Object));
	}
}

//at command prompt > java IsInstanceDemo java.lang.Runnable