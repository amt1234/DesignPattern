/******************************************************************************
 *  Purpose: Eager Initialization

 *  @author  Poonam
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class Demo {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		System.out.println(instanceOne.hashCode());
		EagerInitializedSingleton instancetwo = EagerInitializedSingleton.getInstance();
		System.out.println(instancetwo.hashCode());
	}

}
