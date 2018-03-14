package com.bridgeit.programs;

public class ThreadSafe {

	public static void main(String[] args)
	{
		
		ThreadS t=ThreadS.getInstance();
		System.out.println(t.hashCode());
		ThreadS t1=ThreadS.getInstance();
		System.out.println(t1.hashCode());
		ThreadS t3=ThreadS.getInstance();
		System.out.println(t3.hashCode());
	}

}

class ThreadS
{
	
	private static ThreadS thread;
	
	private ThreadS()
	{
		System.out.println("Thread Safe");
	}
	
	public static synchronized ThreadS getInstance()
	{
		if(thread==null)
		{
			thread=new ThreadS();
		}
		return thread;
	}
	
	
}