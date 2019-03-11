class ShallowCloneContainedObj
{
	public int i;
	ShallowCloneContainedObj(int value)
	{
		this.i = value;
	}
}
public class ShallowCloneingDemo implements Cloneable
{
	public ShallowCloneContainedObj insObj;
	public int instIntVar;
	
	ShallowCloneingDemo(ShallowCloneContainedObj passedObj, int instvalue)
	{
		this.insObj = passedObj;
		this.instIntVar = instvalue;
	}
//Shallow Cloneing
/*	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
*/

//DeepCloneing
	public  Object clone() throws CloneNotSupportedException
	{
		ShallowCloneContainedObj newObj = new ShallowCloneContainedObj(this.insObj.i);
		return new ShallowCloneingDemo(newObj, this.instIntVar);
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ShallowCloneContainedObj contObj = new ShallowCloneContainedObj(10);
		ShallowCloneingDemo entireObj = new ShallowCloneingDemo(contObj, 20);
		ShallowCloneingDemo cloneObj = (ShallowCloneingDemo)entireObj.clone();
		System.out.println(entireObj.instIntVar +"........" + entireObj.insObj.i);
		entireObj.instIntVar = 100;
		entireObj.insObj.i = 200;
		System.out.println(entireObj.instIntVar +"........" + entireObj.insObj.i);
		System.out.println(cloneObj.instIntVar +"........" + cloneObj.insObj.i);
	}
}