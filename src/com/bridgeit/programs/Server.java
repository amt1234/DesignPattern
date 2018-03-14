package com.bridgeit.programs;

public class Server extends Computer 
{
	String ram;
	String os;
	String hdd;

	public Server(String ram,String os,String hdd)
	{
		this.ram=ram;
		this.os=os;
		this.hdd=hdd;
	}
	@Override
	public String getRam() {
	
		return this.ram;
	}

	@Override
	public String getOs() {
		
		return this.os;
	}

	@Override
	public String getHdd() {
		
		return this.hdd;
	}

}
