/******************************************************************************
 *  Purpose: Factory singleton design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String os, String hdd) {
		if ("pc".equalsIgnoreCase(type)) {
			return new PC(ram, os, hdd);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, os, hdd);
		}
		return null;
	}

}
