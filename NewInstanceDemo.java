class Student 
{
	Student(int arg) {
		
	}
}

class Customer
{
	
}
class NewInstanceDemo
{
	public static void main(String[] args) throws Exception
	{
		Object o = Class.forName(args[0]).newInstance();
		Test t = new Test();
		System.out.println("Object created for : " + o.getClass().getName());
	}
}