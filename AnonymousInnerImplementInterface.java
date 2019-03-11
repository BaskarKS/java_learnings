class AnonymousInnerImplementInterface
{
		public static void main(String[] args)
		{
			Runnable runObj = new Runnable() {
					public void run()
					{
						for (int i=0; i <= 10; i++)
							System.out.println("Child Thread Seq : " + i);
					}
			};
			Thread childThread = new Thread(runObj);
			childThread.start();
			for(int i = 10; i >=0; i--)
				System.out.println("Main Thread Seq : " + i);
		}
}