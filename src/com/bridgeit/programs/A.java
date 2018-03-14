package com.bridgeit.programs;

public class A {

	private static A instance;
	private A()
	{
		System.out.println("Lazy initialization");
	}
	
	public static A getInstance()
	{
		if(instance==null)
		{
			instance=new A();
		}
		return instance;
		
	}
	
	public static void main(String[] args)
	{
		A a1=A.getInstance();
		System.out.println(a1.hashCode());
		
		A a2=A.getInstance();
		System.out.println(a2.hashCode());
	}
}

