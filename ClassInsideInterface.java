package com.innerclass;
interface Vehicle
{
	public abstract int getNoOfWheels();
	class DefaultVehicle implements Vehicle// this class is "public static" by default, eligible to create this class instance direclty
	{
			public int getNoOfWheels()
			{
				System.out.println("Default Implementation returns 4 wheels");
				return 4;
			}
	}
}

class HeavyBus implements Vehicle
{
	public 	int getNoOfWheels()
	{
		System.out.println("HeavyBus implementation returns 8 wheels");
		return 8;
	}
}

public class ClassInsideInterface
{
	public static void main(String[] args)
	{
		System.out.println("Checking Class inside Interface and Default implementations");
		Vehicle.DefaultVehicle defaultImpObj = new Vehicle.DefaultVehicle();
		defaultImpObj.getNoOfWheels();
		HeavyBus customImpObj = new HeavyBus();
		customImpObj.getNoOfWheels();
	}
}