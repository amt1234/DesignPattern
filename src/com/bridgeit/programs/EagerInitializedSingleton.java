/******************************************************************************
 *  Purpose: Eager Initialization

 *  @author  Poonam
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
