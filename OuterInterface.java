//Interface inside Interface
interface OuterInterface
{
	public void outerInterfaceMethod();
	
	interface InnerInterface {
		public void innerInterfaceMethod();
	}
}