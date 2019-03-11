package com.threads;
public class 
{
	//threads can do ITC by using wait(), notify(), notifyAll()
	//thread which is expecting an updation supposed to call wait(), hence it moves to wait state.
	//thread which is performing updation, after performing updation its supposed to call notify() / notifyAll() to woke up the waiting thread to resume exec.
	//all the three above methods are defined in Object class because Threads can call this method on any Java Object.
	//wait() method can be called by the thread(if it aquires lock - owner) only if its the owner of the object. otherwise IllegalMonitorStateException
	// wait(), notify(), notifyAll() can be called only in the Synchronized area(means we are already owner of that), otherwise IllegalMonitorStateException
	
	//if a thread calls wait() on an object=> it immediately releases lock on that object and enters into wait state.
	//if a thread calls notify() on an object => it releases lock on that object but may not immediately.
	//except wait() notify() notifyAll() methos, theres not other method thread releases the lock on an object
	
	//public final void wait(); throws Interrupted exception
	//public final native void wait(long ms) throws Interrupted exception
	//public final void wait(long ms, int ns) throws Interrupted exception
	public static void main(String[] args)
	{
		
	}
}