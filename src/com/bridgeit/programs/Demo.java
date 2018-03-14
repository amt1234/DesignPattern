package com.bridgeit.programs;

public class Demo {

	public static void main(String[] args) {
		 EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		 System.out.println(instanceOne.hashCode());
		 EagerInitializedSingleton instancetwo = EagerInitializedSingleton.getInstance();
		 System.out.println(instancetwo.hashCode());
	}

}
