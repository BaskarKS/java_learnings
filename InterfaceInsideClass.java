package com.innerclass;
public class InterfaceInsideClass
{
	private interface wheelCount // this is not "public and static" by default, we can define this interface even private
	{
		int getNoOfWheels(); // defined or not, the methods are abstract and public by default, in implementation class compulsary should be defined public
	}
	
	public class Bus implements wheelCount
	{
		public int getNoOfWheels() // compulsary should be defined public, cant downlimit the scope (cant be default / protected /etc)
		{
			int noOfWheels = 6;
			System.out.println("In Bus Class => no of wheels is =>" + noOfWheels);
			return noOfWheels;
		}
	}
	
	public class Auto implements wheelCount
	{
		public int getNoOfWheels() // compulsary should be defined public
		{
			int noOfWheels = 3;
			System.out.println("In Bus Class => no of wheels is =>" + noOfWheels);
			return noOfWheels;
		}
	}
	
	public static void main(String[] args)
	{
		InterfaceInsideClass outerObj = new InterfaceInsideClass();
		InterfaceInsideClass.Bus busObj = outerObj.new Bus();
		busObj.getNoOfWheels();
		InterfaceInsideClass.Auto autoObj = outerObj.new Auto();
		autoObj.getNoOfWheels();
	}
}