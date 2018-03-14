package com.bridgeit.programs;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer pc=ComputerFactory.getComputer("pc", "16 GB","WINDOWS", "1 TB");
		
		Computer server=ComputerFactory.getComputer("Server", "32 GB","MAC","2 TB");
		
		System.out.println("PC configuration :"+pc);
		System.out.println("Server configuration :"+server);

	}

}
