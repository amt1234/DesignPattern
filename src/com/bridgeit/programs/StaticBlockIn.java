package com.bridgeit.programs;

public class StaticBlockIn {

	public static void main(String[] args) {
		A2 a2=A2.getInstance();
		System.out.println(a2.hashCode());
		A2 a3=A2.getInstance();
		System.out.println(a3.hashCode());
	}

}

class A2
{
	private static A2 instance;
	private A2()
	{
		System.out.println("StaticBlockInitialization");
	}
	static
	{
		try
		{
			instance=new A2();
		}
		catch(Exception e)
		{
			throw new RuntimeException("exception");
		}
	}
	public static A2 getInstance()
	{
		return instance;
	}
	
	
}