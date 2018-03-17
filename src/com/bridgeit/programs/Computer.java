/******************************************************************************
 *  Purpose: Factory singleton design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public abstract class Computer {
	public abstract String getRam();

	public abstract String getOs();

	public abstract String getHdd();

	public String toString() {
		return "RAM= " + this.getRam() + ", HDD=" + this.getOs() + ", CPU=" + this.getHdd();
	}
}
