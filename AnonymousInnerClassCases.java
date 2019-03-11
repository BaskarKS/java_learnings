package com.innerclass;
public class AnonymousInnerClassCases
{
	public static void main(String[] args)
	{
		///Classes without name
		/// classes without names such type of inner class are anonymous inner class, "main purpose is - instant use"
		//Based on Declaration and behaviour they are defined 3 types
		///1. Anonymous inner class that extends a class
		///2. Anonymous inner class that implements a interface
		///3. Anonymous inner class that defined inside arguments
		
		///1. Anonymous inner class that extends a class
		System.out.println("Anonymous inner class that extends a class ");
		Thread taskNew = new Thread() {
				public void run()
				{
					for (int count = 10; count >= 0; count--)
					{
						System.out.println("New Task Computation in Child Thread - " + count);
					}
				}
		};
		taskNew.start();
		for(int count = 0; count <= 10; count++)
		{
			System.out.println("Computation in Main Thread = " + count);
		}
		///2. Anonymous inner class that implements a interface
		System.out.println("Anonymous inner class that implements a interface ");
		Thread taskNewDiff = new Thread(new Runnable()
			{
				public void run()
				{
					for(int count = 5; count >= 0; count--)
					{
						System.out.println("Child Task - Anonymous though Interface - " + count);
					}
				}
			}
		);
		for(char c = 'g'; c != 'a'; c--)
		{
			System.out.println("Main Thread Task - " + c);
		}
		//3. Anonymous inner class that defined inside arguments
		new Thread(new Runnable(){
			public void run()
			{
				for(int count = 5; count > 0; count--)
				{
					System.out.println("Anonymous Inner Class inside arguments - " + count);
				}
			}
		}).start();
		
	///sometimes we "extend a class functionality with some modification" / implement an interface with some modification instantly without 
	/// creating a name for future use of the implementation defined, such types are AnonymousInnerClass
	}
}